package ui.cucumber;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.seeGistSteps;

public class seeGistBDDSteps {
    @Steps
    private seeGistSteps seeGistStepsObject;

    @Then("^i want to see all my gist$")
    public void thatIWantToUpdateGist() throws Throwable {
        seeGistStepsObject.goToGistPage();
    }
}
