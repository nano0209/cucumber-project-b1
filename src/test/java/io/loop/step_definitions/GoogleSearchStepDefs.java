package io.loop.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.GoogleSearchPage;
import io.loop.utilities.utilities.BrowserUtils;
import io.loop.utilities.utilities.ConfigurationReader;
import io.loop.utilities.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.security.Key;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class GoogleSearchStepDefs {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    private static final Logger LOG = LogManager.getLogger();


    @When("user types Loop Academy in the google search box and clicks enter")
    public void user_types_loop_academy_in_the_google_search_box_and_clicks_enter() {
        googleSearchPage.searchBox.sendKeys("Loop Academy" + Keys.ENTER);
        BrowserUtils.takeScreenshot();
        LOG.info("User types input to Google page");

    }
    @Then("user should see Loop Academy - Google Search in the google title")
    public void user_should_see_loop_academy_google_search_in_the_google_title_i () {
        String actualTitle = Driver.getDriver().getTitle();
        LOG.info("User see the result");
        Assert.assertEquals( "Loop Academy - Google Search", actualTitle);

        }

    @When("user types {string} in the google search box and click enter")
    public void user_types_in_the_google_search_box_and_click_enter(String input) {
        googleSearchPage.searchBox.sendKeys(input + Keys.ENTER);
    }
    @Then("User should see {string} is in the google title")
    public void user_should_see_search_is_in_the_google_title(String title) {
        Assert.assertEquals("Expected does not match actual", title, Driver.getDriver().getTitle());
    }


    @Then("user searches the following item")
    public void user_searches_the_following_item(List <String> items) {
//        items.forEach(p -> {
//            googleSearchPage.searchBox.clear();
//            googleSearchPage.searchBox.sendKeys(p + Keys.ENTER);
//            Assert.assertEquals(p + " - Google Search", Driver.getDriver().getTitle());
//        });

//        for (String s : items){
//            System.out.println(s + " from feature file");
//            googleSearchPage.searchBox.clear();
//            googleSearchPage.searchBox.sendKeys(s + Keys.ENTER);
//            Assert.assertEquals(s + " - Google Search", Driver.getDriver().getTitle());           googleSearchPage.searchBox.clear();
//            googleSearchPage.searchBox.sendKeys(s + Keys.ENTER);
//            Assert.assertEquals(s + " - Google Search", Driver.getDriver().getTitle());
//        }
        for (String each : items){
            //System.out.println(each.get("items"));
            googleSearchPage.searchBox.clear();
            googleSearchPage.searchBox.sendKeys(each + Keys.ENTER);
        }



    }
    @When("user searches for the {string}")
    public void user_searches_for_the(String country) throws InterruptedException {
        googleSearchPage.searchBox.sendKeys("What is the capital of " + country + Keys.ENTER);
        LOG.info("User search for" + country);
        Thread.sleep(3000);

    }
    @Then("user should see the {string} in the result")
    public void user_should_see_the_in_the_result(String capital) {
        Assert.assertEquals(googleSearchPage.capital.getText(), capital);
        LOG.info("User sees the:" +capital);

    }

    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {

    }


}



