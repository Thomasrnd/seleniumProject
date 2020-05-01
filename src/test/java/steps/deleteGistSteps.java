package steps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class deleteGistSteps extends PageObject {

    WebDriver driver;

    //Initialize object
    @FindBy(xpath = "//button[@aria-label='Delete this Gist']")
    private WebElementFacade deleteBtn;

    //Initialize steps function
    public void deleteGist(){
        waitFor(deleteBtn);
        deleteBtn.click();
        driver.switchTo().alert().accept();
    }
}
