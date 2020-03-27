package stepDefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
public class Test {

    @RunWith(Cucumber.class)
    public class MyStepDefinitions {

        @Given("^I navigate to bank site$")
        public void i_navigate_to_bank_site() throws Throwable {
            throw new PendingException();
        }

        @When("^I input username and password$")
        public void i_input_username_and_password() throws Throwable {
            throw new PendingException();
        }

        @Then("^I verify Homepage displayed$")
        public void i_verify_homepage_displayed() throws Throwable {
            throw new PendingException();
        }

        @And("^I click to Login button$")
        public void i_click_to_login_button() throws Throwable {
            throw new PendingException();
        }

    }
}
