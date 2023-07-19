package io.loop.utilities.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    /*
    creating private constructor so this class object is not reachable from outside
     */

    private Driver(){

    }

    /*
    making driver instance private
    Static - run before everything also use in static method
     */

   // private static WebDriver driver;
    //implemented threadLocal to achieve multiThread local
    private static InheritableThreadLocal <WebDriver> driverPool = new InheritableThreadLocal<>();


    /*
    reusable method that will return same driver instance everytime when called
     */

    /**
     * singleton patter
     * @return driver
     * @author Naima
     */
    public static WebDriver getDriver(){
        if (driverPool.get()==null){
            String browserType = ConfigurationReader.getProperty("browser");
            switch (browserType.toLowerCase()){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.valueOf(ConfigurationReader.getProperty("timeout"))
                    ));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    break;
            }
            driverPool.get().manage().window().maximize();
            driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driverPool.get();
    }

    /**
     * closing driver
     * @author Naima
     */

    public static void closeDriver(){

        if (driverPool.get() !=null){
            driverPool.get().quit();
            driverPool.remove();
        }


    }

}
