package steps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class editGistSteps extends PageObject {

    //Initialize object

    @FindBy(xpath = "//a[@aria-label='Edit this Gist']")
    private WebElementFacade editBtn;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElementFacade updateBtn;

    //Initialize steps function
    public void goToEditPage(){
        editBtn.click();
    }

    public void updateGist(){
        updateBtn.click();
    }
}
