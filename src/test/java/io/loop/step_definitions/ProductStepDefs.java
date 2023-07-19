package io.loop.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.it.Ma;
import io.loop.pages.ProductPage;
import io.loop.utilities.utilities.BrowserUtils;
import io.loop.utilities.utilities.ConfigurationReader;
import io.loop.utilities.utilities.Driver;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ProductStepDefs {

    ProductPage productPage = new ProductPage();

    @Given("User is on the HomePage")
    public void user_is_on_the_home_page() {



        Driver.getDriver().get(ConfigurationReader.getProperty("product.url"));
    }

    @Then("User should be able to see expected prices in following products")
    public void user_should_be_able_to_see_expected_prices_in_following_products(List<Map <String,String>> productDetails) {

        for (Map<String, String> productDetail : productDetails) {
            System.out.println("---------Product Details---------");
            System.out.println(productDetail.get("Category"));
            System.out.println(productDetail.get("Product"));
            System.out.println(productDetail.get("expectedPrice"));
            BrowserUtils.justWait(5);
            productPage.clickCategory(productDetail.get("Category")); //click category
            String actualPrice = productPage.getProductPrice(productDetail.get("Product"));

            String expectedPrice = productDetail.get("expectedPrice"); // get price from feature file

            Assert.assertEquals(expectedPrice, actualPrice);
        }
    }

    @Then("User should be able to see expected prices in following products with listOflist")
    public void userShouldBeAbleToSeeExpectedPricesInFollowingProductsWithListOflist() {
    }



        @Then("User should be able to see following names in their groups")
    public void user_should_be_able_to_see_following_names_in_their_groups(io.cucumber.datatable.DataTable dataTable) {

    }

}



