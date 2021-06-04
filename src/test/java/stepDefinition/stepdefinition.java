package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Collections;
import java.util.List;

public class stepdefinition {

    @Given("^User is on banking landing page$")
    public void user_is_on_banking_landing_page() {
        System.out.println("Landing page displayed");
    }
    @When("^user login by \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_and_password(String string, String string2) {
        System.out.println(string);
        System.out.println(string2);
    }
    @When("^user signup with the following detail$")
    public void user_signup_with_the_follwing_detail(DataTable data){
        List<List<String>> obj= Collections.singletonList(data.asList());
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
    }
    @When("^user login into application (.+) password (.+)$")
    public void user_login_into_application(String username, String password){
        System.out.println(username);
        System.out.println(password);
    }
    @Then("^Home page is populated$")
    public void home_page_is_populated() {
        System.out.println("Home page displayed");

    }
    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_are_displayed(String arg1) {
        System.out.println("Cards displayed");
        System.out.println(arg1);

    }
    @Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("Deciding the browser to open");
    }

    @When("^browser is triggered$")
    public void browser_is_triggered() throws Throwable {
        System.out.println("Browser is triggered");
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
        System.out.println("Browser is started");
    }

}
