package io.loop.pages;

import io.loop.utilities.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {

    public ClientPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h3[.='Choose account']")
    public WebElement chooseAccountText;

    @FindBy(xpath = "//span[.='Received docs']")
    public WebElement receivedDocs;

    @FindBy(xpath = "//span[.='Search']//span")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='d-flex align-center justify-start justify-sm-end flex-wrap']")
    public WebElement download;
    @FindBy(xpath = "//span[.='My uploads']")
    public WebElement myUploads;

//    public void clickButton (String button) {
//        switch(button.toLowerCase()) {
//            case "continue":
//                continueb.click();
//                break;
//            case "receivedDocs":
//                receivedDocs.click();
//                break;
//            case "myUploads":
//                myUploads.click();
//                break;
//        }
//    }






}
