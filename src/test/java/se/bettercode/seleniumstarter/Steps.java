package se.bettercode.seleniumstarter;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

@StepDefAnnotation
public class Steps {

    public static NokController nokController;
    public static WebDriver driver;

    @Given("^that I am logged in as a teacher$")
    public void that_I_am_logged_in_as_a_teacher() throws Throwable {

        nokController.getEmailElement().sendKeys("Test.Larare@nok.se");
        nokController.getPasswordElement().sendKeys("testLarare");
        nokController.getLoginButtonElement().click();
    }

    @Then("^I am at the product page$")
    public void i_am_at_the_product_page() throws Throwable {
        assertEquals("Mina sidor - Natur och Kultur", driver.getTitle());

    }

    @Given("^that I have a product with a license that is not started$")
    public void that_I_have_a_product_with_a_license_that_is_not_started() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter my products$")
    public void i_enter_my_products() throws Throwable {

    }

    @Then("^the product is visable$")
    public void the_product_is_visable() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^that I have a product with a license that is started$")
    public void that_I_have_a_product_with_a_license_that_is_started() throws Throwable {
        nokController.getNokFlexProduct();
    }

    @Then("^I can open my product$")
    public void i_can_open_my_product() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
