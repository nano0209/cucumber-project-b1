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

    private static WebDriver driver;

    /*
    reusable method that will return same driver instance everytime when called
     */

    /**
     * singleton patter
     * @return driver
     * @author Naima
     */
    public static WebDriver getDriver(){
        if (driver==null){
            String browserType = ConfigurationReader.getProperty("browser");
            switch (browserType.toLowerCase()){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

    /**
     * closing driver
     * @author Naima
     */

    public static void closeDriver(){

        if (driver !=null){
            driver.quit();
            driver = null;
        }


    }

}
