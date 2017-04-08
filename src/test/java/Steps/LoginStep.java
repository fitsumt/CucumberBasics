package Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;

/**
 * Created by fitsumwoldemariam on 4/3/17.
 */
public class LoginStep {
    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Navigate Login page");
    }

    @And("^I click a login button$")
    public void iClickALoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Click login button");
    }

    @Then("^I should see a userform page$")
    public void iShouldSeeAUserformPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I should see user form page");
    }

    @And("^I entered the following for login$")
    public void iEnteredTheFollowingForLogin(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        List<List<String>> data = table.raw();
        System.out.println("The Value is :" + data.get(0).get(0).toString());
        System.out.println("The Value is :" + data.get(0).get(1).toString());


    }

    //  @And("^I entered the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
 //   public void iEnteredTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    //    System.out.println("Username is " + username + " and Password is " + password);
   // }
}
