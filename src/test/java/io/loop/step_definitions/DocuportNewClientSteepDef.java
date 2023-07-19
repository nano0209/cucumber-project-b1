package io.loop.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.DocuportBasePage;
import io.loop.pages.LoginPage;
import io.loop.utilities.utilities.ConfigurationReader;

public class DocuportNewClientSteepDef {

    LoginPage loginPage = new LoginPage();
    DocuportBasePage docuportBasePage = new DocuportBasePage();
    @When("user enters credentials for advisor role")
    public void user_enters_credentials_for_advisor_role() {
        loginPage.loginDocuport(ConfigurationReader.getProperty("advisor"),ConfigurationReader.getProperty("password"));
    }
    @When("user clicks client button and create new clients")
    public void user_clicks_client_button_and_create_new_client() {
        docuportBasePage.clients.click();
        docuportBasePage.createNewClient.click();
        docuportBasePage.personalDropdown.click();
        docuportBasePage.locateInputNames("First name","Loop1");
        docuportBasePage.locateInputNames("Last name","Academy1");
        docuportBasePage.createNewUserCheckBox.click();
        docuportBasePage.locateInputNames("Email address", "loopcamp42@gmail.com");
        docuportBasePage.advisorDropdown.click();
        docuportBasePage.batch1Group1Option.click();
        docuportBasePage.locateInputNames("Phone number", "785465854");
        docuportBasePage.locateInputNames("Password", "Group1");
        docuportBasePage.locateInputNames("Confirm password", "Group1");
        docuportBasePage.submit.click();

    }
    @When("user validates that new client created")
    public void user_validates_that_new_client_created() {




    }
    @When("user logs out as an advisor")
    public void user_logs_out_as_an_advisor() {

    }
    @Then("user logs in as a new client")
    public void user_logs_in_as_a_new_client() {

    }

}
