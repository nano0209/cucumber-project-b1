package io.loop.pages;

import io.loop.utilities.utilities.BrowserUtils;
import io.loop.utilities.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='input-14']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@id='input-15']")
    public WebElement passwordInput;

    @FindBy(className = "v-btn__content")
    public WebElement loginButton;

    @FindBy(xpath = "//span[.='Home']")
    public WebElement homePage;

    @FindBy(xpath = "//span[.=' Continue ']")
    public WebElement continueButton;



    /**
     * login to docuport
     * @param username
     * @param password
     * @author Naima
     */
    public void loginDocuport(String username, String password){

        BrowserUtils.waitForVisibility(usernameInput, 5);
        usernameInput.clear();
        usernameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        BrowserUtils.waitForClickable(loginButton, 5);
        BrowserUtils.clickWithJS(loginButton);
    }


}