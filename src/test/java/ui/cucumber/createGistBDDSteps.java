package ui.cucumber;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.createGistSteps;

import java.util.List;
import java.util.Map;

public class createGistBDDSteps {

    @Steps
    private createGistSteps createGistStepsObject;

    @Then("^i want to create gist$")
    public void thatIWantToCreateGist() throws Throwable {
        createGistStepsObject.clickCreateGist();
    }

    @When("^i want to create gist file with following$")
    public void iWantToCreateGistWithFollowing(DataTable table) throws Throwable {
        List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        for (Map<String,String> row : rows) {
            String gistDescription = row.get("gist_description");
            String gistFileName = row.get("gist_file_name");
            String gistFill = row.get("gist_fill");
            createGistStepsObject.creatingGist(gistDescription,gistFileName,gistFill);
            createGistStepsObject.submitGist();
        }
    }

//    @Then("^should navigate to hist homepage$")
//    public void shouldNavigateToGistHomepage()throws Throwable{
//        loginStepsPageObject.verifyHomePage();
//    }
}
