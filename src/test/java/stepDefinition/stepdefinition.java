package stepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {

    @Given("^User is on banking landing page$")
    public void user_is_on_banking_landing_page() {
        System.out.println("Landing page displayed");
    }
    @When("user login into application with {string} and password {string}")
    public void user_login_into_application_with_and_password(String string, String string2){
        System.out.println(string);
        System.out.println(string2);
    }
    @Then("^Home page is populated$")
    public void home_page_is_populated() {
        System.out.println("Home page displayed");

    }
    @And("Cards displayed are {string}")
    public void cards_are_displayed(String arg1) {
        System.out.println("Cards displayed");
        System.out.println(arg1);

    }
}
