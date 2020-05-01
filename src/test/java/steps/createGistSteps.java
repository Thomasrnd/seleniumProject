package steps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class createGistSteps extends PageObject
{

    //Initialize object
    @FindBy(xpath = "//a[@aria-label='Gist Homepage ']")
    private WebElementFacade createGistBtn;

    @FindBy(xpath = "//input[@placeholder='Filename including extension…']")
    private WebElementFacade fileNameGistField;

    @FindBy(xpath = "//input[@placeholder='Gist description…']")
    private WebElementFacade gistDescriptionField;

    @FindBy(xpath = "//pre[@class=' CodeMirror-line ']")
    private WebElementFacade gistFillField;

    @FindBy(xpath = "//button[@name='gist[public]']")
    private WebElementFacade submitBtn;

    //Initialize steps function
    public void clickCreateGist(){
        createGistBtn.click();
    }

    public void creatingGist(String description, String fileName, String gistFill){
        gistDescriptionField.click();
        gistDescriptionField.sendKeys(description);
        fileNameGistField.click();
        fileNameGistField.sendKeys(fileName);
        gistFillField.sendKeys(gistFill);
    }

    public void clearField(){
        gistDescriptionField.clear();
        fileNameGistField.clear();
    }

    public void submitGist(){
        submitBtn.click();
    }
}
