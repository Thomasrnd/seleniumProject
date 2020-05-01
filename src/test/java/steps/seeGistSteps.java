package steps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class seeGistSteps extends PageObject {
    //Initialize object
    @FindBy(xpath = "//img[@class='avatar avatar-user']")
    private WebElementFacade userAvatarBtn;

    @FindBy(xpath = "//a[@data-ga-click='Header, go to your gists, text:your gists']")
    private WebElementFacade yourGistBtn;

    @FindBy(xpath = "//div[@class='js-gist-file-update-container js-task-list-container file-box']")
    private WebElementFacade gistBtn;

    //Initialize steps function
    public void goToGistPage(){
        userAvatarBtn.click();
        yourGistBtn.click();
        gistBtn.click();
    }
}
