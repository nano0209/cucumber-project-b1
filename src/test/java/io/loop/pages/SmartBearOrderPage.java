package io.loop.pages;

import io.loop.utilities.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.logging.XMLFormatter;

public class SmartBearOrderPage extends SmartBearBasePage {

    public SmartBearOrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[contains(.,'Order')]")
    public WebElement product;

    @FindBy(xpath = "//select[contains(@id,'Product')]")
    public WebElement productDropdown;
    @FindBy(xpath = "//input[contains(@id,'Quantity')]")
    public WebElement quantity;
    @FindBy(xpath = "//input[@value='Calculate']")
    public WebElement calculateButton;
    @FindBy(xpath = "//input[contains(@id,'txtName')]")
    public WebElement customerName;
    @FindBy(xpath = "//input[contains(@id,'TextBox2')]")
    public WebElement street;
    @FindBy(xpath = "//input[contains(@id,'TextBox3')]")
    public WebElement city;
    @FindBy(xpath = "//input[contains(@id,'TextBox4')]")
    public WebElement state;
    @FindBy(xpath = "//input[contains(@id,'TextBox5')]")
    public WebElement zip;
    @FindBy(xpath = "//input[@type='radio']")
    public List<WebElement> card;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_fmwOrder_TextBox6']")
    public WebElement cardNumber;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_fmwOrder_TextBox1']")
    public WebElement expiration;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_fmwOrder_InsertButton']")
    public WebElement processButton;

    @FindBy(xpath = "//input[@type='reset']")
    public WebElement resetButton;

    @FindBy(xpath = "//h2[contains(text(),'Order')]")
    public WebElement orderHeading;

    @FindBy(xpath = "//td[.='Chuck Norris']")
    public WebElement name;

    @FindBy(xpath = "//a[.='View all orders']")
    public WebElement viewOrder;
}