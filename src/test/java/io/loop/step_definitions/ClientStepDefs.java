package io.loop.step_definitions;

import io.cucumber.java.en.When;
import io.loop.pages.ClientPage;
import io.loop.utilities.utilities.BrowserUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.SoftAssertions;

public class ClientStepDefs {

    ClientPage clientPage = new ClientPage();
    private Logger LOG = LogManager.getLogger();
    private SoftAssertions softAssertions = new SoftAssertions();


    @When("user validates choose account pop up is visible")
    public void user_validates_choose_account_pop_up_is_visible() {
        BrowserUtils.waitForVisibility(clientPage.chooseAccountText, 5);
//        assertTrue(clientPage.chooseAccountText.isDisplayed());
//        assertTrue(clientPage.chooseAccountText.getText().equals("Choose Account"));
//        assert (clientPage.chooseAccountText.getText().equals("Choose account"));
        softAssertions.assertThat(clientPage.chooseAccountText.getText()).isEqualTo("Loop Academy");
        LOG.info("Account text is visible");
    }

//    @When("user chooses account from drop down")
//    public void user_chooses_account_from_drop_down() {
//        // assertTrue(clientPage.continueButton.isDisplayed());
//        softAssertions.assertThat(clientPage.continueB.isDisplayed()).isTrue();
//        softAssertions.assertThat(clientPage.continueB.getText()).isEqualTo("Loop Academy");
//        clientPage.continueb.click();
//        softAssertions.assertAll();
//    }

    @When("user clicks {string} button")
    public void user_clicks_button(String string) {

    }



}
