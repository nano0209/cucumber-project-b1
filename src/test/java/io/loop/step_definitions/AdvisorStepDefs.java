package io.loop.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.ClientPage;
import io.loop.pages.LoginPage;
import io.loop.utilities.utilities.BrowserUtils;
import io.loop.utilities.utilities.ConfigurationReader;
import io.loop.utilities.utilities.Driver;
import org.apache.commons.logging.Log;
import org.junit.Assert;

public class AdvisorStepDefs {
    LoginPage loginPage = new LoginPage();
    ClientPage clientPage = new ClientPage();

    @Given("User is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    @When("user enters credentials {string} and {string}")
    public void user_enters_credentials_and(String username, String password) {
       // BrowserUtils.waitForVisibility(loginPage.usernameInput,4);
        loginPage.loginDocuport(username, password);
        BrowserUtils.justWait(5);
        if (username.equals("b1g1_client@gmail.com")) {
            loginPage.continueButton.click();
            BrowserUtils.justWait(5);
        }

    }
    @When("click on Received documents")
    public void click_on_received_documents() {
        BrowserUtils.justWait(5);
        clientPage.receivedDocs.click();

    }
    @When("validate search button is displayed for Received docs")
    public void validate_search_button_is_displayed() {
        clientPage.searchBox.isDisplayed();

    }
    @When("validate download button is displayed for Received docs")
    public void validate_download_button_is_displayed_for_Received_docs() {
        Assert.assertTrue(clientPage.download.isDisplayed());

    }
    @When("validate Received docs is displayed")
    public void validate_received_docs_is_displayed() {
       Assert.assertTrue(clientPage.searchBox.isDisplayed());

    }
    @Then("click on MyUploads")
    public void click_on_my_uploads() {
        clientPage.myUploads.click();

    }
    @Then("validate search button is displayed for MyUploads")
    public void validate_search_button_is_displayed_for_MyUploads() {
        Assert.assertTrue(clientPage.searchBox.isDisplayed());

    }
    @Then("validate download button is displayed for MyUploads")
    public void validate_download_button_is_displayed_for_MyUploads() {
        Assert.assertTrue(clientPage.download.isDisplayed());

    }
    @Then("validate MyUploads is displayed")
    public void validate_my_uploads_is_displayed() {
        Assert.assertTrue(clientPage.myUploads.isDisplayed());

    }
}

