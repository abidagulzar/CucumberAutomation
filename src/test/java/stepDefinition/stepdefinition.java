package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {

    @Given("^User is on banking landing page$")
    public void user_is_on_banking_landing_page() {
        System.out.println("Landing page displayed");
    }
    @When("^user login into application with username and password$")
    public void user_login_into_application_with_username_and_password() {
        System.out.println("Enter user name and password in login screen ");
    }
    @Then("^Home page is populated$")
    public void home_page_is_populated() {
        System.out.println("Home page displayed");
    }
    @And("^Cards are displayed$")
    public void cards_are_displayed() {
        System.out.println("Cards displayed");

    }
}
