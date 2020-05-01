package ui.cucumber;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.createGistSteps;
import steps.editGistSteps;
import steps.seeGistSteps;

import java.util.List;
import java.util.Map;

public class editGistBDDSteps {

    @Steps
    private createGistSteps createGistStepsObject;

    @Steps
    private editGistSteps editGistStepsObject;

    @Steps
    private seeGistSteps seeGistStepsObject;

    @Then("^i want to update gist$")
    public void thatIWantToUpdateGist() throws Throwable {
        seeGistStepsObject.goToGistPage();
        editGistStepsObject.goToEditPage();
    }

    @When("^i want to edit gist file with following$")
    public void iWantToEditWithFollowing(DataTable table) throws Throwable {
        List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        for (Map<String,String> row : rows) {
            String gistDescription = row.get("gist_description");
            String gistFileName = row.get("gist_file_name");
            String gistFill = row.get("gist_fill");
            createGistStepsObject.clearField();
            createGistStepsObject.creatingGist(gistDescription,gistFileName,gistFill);
            editGistStepsObject.updateGist();
        }
    }
}
