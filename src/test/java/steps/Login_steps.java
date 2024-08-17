package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_steps {


    @Given("Set Drivers")
    public void set_drivers() {
        System.out.println(set driversssss");
         
    }

    @And("Browser is open")
    public void browserIsOpen() {
        System.out.println("opening the browser***");
    }

    @When("Type amazon on search box")
    public void typeAmazonOnSearchBox() {
        System.out.println(" type in the search box");
    }

    @And("click on search")
    public void clickOnSearch() {
        System.out.println("click om search button");
         System.out.println("Done");
    }

    @Then("User is navigate to the homepage")
    public void userIsNavigateToTheHomepage() {
        System.out.println("homepage appears");
    }
}
