package ui.cucumber;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.deleteGistSteps;
import steps.seeGistSteps;

public class deleteGistBDDSteps {


    @Steps
    private seeGistSteps seeGistStepsObject;

    @Steps
    private deleteGistSteps deleteGistStepsObject;

    @Then("^i want to delete gist$")
    public void thatIWantToUpdateGist() throws Throwable {
        seeGistStepsObject.goToGistPage();
        deleteGistStepsObject.deleteGist();
    }
}
