package io.loop.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Do;
import io.loop.pages.LoginPage;
import io.loop.utilities.utilities.BrowserUtils;
import io.loop.utilities.utilities.ConfigurationReader;
import io.loop.utilities.utilities.DocuportConstants;
import io.loop.utilities.utilities.Driver;

import java.util.Map;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user enters username for client")
    public void user_enters_username_for_client() throws InterruptedException {
        Thread.sleep(3000);
        BrowserUtils.waitForClickable(loginPage.loginButton,10);
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_CLIENT);

    }
    @When("user enters password for client")
    public void user_enters_password_for_client() {
        BrowserUtils.waitForClickable(loginPage.passwordInput,10);
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD_All);

    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        BrowserUtils.waitForClickable(loginPage.loginButton,10);
        loginPage.loginButton.click();

    }
    @Then("user should see the home page for client")
    public void user_should_see_the_home_page_for_client() {
        loginPage.homePage.isDisplayed();

    }

    @When("user enters username for employee")
    public void user_enters_username_for_employee() {
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_EMPLOYEE);

    }
    @When("user enters password for employee")
    public void user_enters_password_for_employee() {
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD_All);

    }
    @Then("user should see the home page for employee")
    public void user_should_see_the_home_page_for_employee() {
        loginPage.homePage.isDisplayed();

    }

    @When("user enters username for advisor")
    public void user_enters_username_for_advisor() {
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_ADVISOR);

    }
    @When("user enters password for advisor")
    public void user_enters_password_for_advisor() {
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD_All);
    }

    @Then("user should see the home page for advisor")
    public void user_should_see_the_home_page_for_advisor() {
        loginPage.homePage.isDisplayed();

    }

    @When("user enters username for supervisor")
    public void user_enters_username_for_supervisor() {
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_SUPERVISOR);

    }
    @When("user enters password for supervisor")
    public void user_enters_password_for_supervisor() {
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD_All);

    }
    @Then("user should see the home page for supervisor")
    public void user_should_see_the_home_page_for_supervisor() {
        loginPage.homePage.isDisplayed();

    }

    @When("user enters credentials")
    public void user_enters_credentials(Map<String, String> credentials) {
//        for (Map.Entry<String, String> entry : credentials.entrySet()){
//            String key = entry.getKey();
//            System.out.println("key = " + key);
//            String value = entry.getValue();
//            System.out.println("value = " +value);
//            System.out.println("===================");
//        }
        loginPage.loginDocuport(credentials.get("username"), credentials.get("password"));

    }





}