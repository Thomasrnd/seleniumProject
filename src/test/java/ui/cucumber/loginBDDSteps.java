package ui.cucumber;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.loginSteps;

public class loginBDDSteps {

    @Steps
    private loginSteps loginStepsPageObject;

    @Given("^that i want to access \"([^\"]*)\"$")
    public void thatIWantToAccess(String url) throws Throwable {
        loginStepsPageObject.openUrl(url);
    }

    @When("^i want to login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iWantToLoginWith(String email, String password) throws Throwable {
        loginStepsPageObject.signingIn();
        loginStepsPageObject.loginScreen(email,password);
    }

    @Then("^should navigate to gist homepage$")
    public void shouldNavigateToGistHomepage()throws Throwable{
        loginStepsPageObject.verifyHomePage();
    }
}
