package steps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class loginSteps extends PageObject {

    //Initialize object
    @FindBy(xpath = "//a[@data-ga-click='Header, sign in']")
    private WebElementFacade signInBtn;

    @FindBy(xpath = "//input[@id='login_field']")
    private WebElementFacade loginField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElementFacade passwordField;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElementFacade submitBtn;

    @FindBy(xpath = "//img[@class='avatar avatar-user']")
    private WebElementFacade homepageLabel;

    //Initialize steps function
    public void signingIn(){
        waitFor(signInBtn);
        signInBtn.click();
    }

    public void loginScreen(String email, String password){
        waitFor(loginField);
        loginField.click();
        loginField.sendKeys(email);
        passwordField.click();
        passwordField.sendKeys(password);
        submitBtn.click();
    }

    public void verifyHomePage(){
        waitFor(homepageLabel);
    }

//    WebDriver driver;
//
//    @Given("^that i am on the shopping website$")
//    public void that_i_am_on_the_shopping_website() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "D:/chromedriver/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        driver.get("https://www.shopee.co.id/");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//div[@class='shopee-popup__close-btn']")).click();
//    }
//
//    @When("^i add an item to the basket$")
//    public void i_add_an_item_to_the_basket(DataTable table) throws Throwable {
//        for(Map<String, String> row : table.asMaps(String.class, String.class)) {
//            String search = row.get("key_word");
//            driver.findElement(By.xpath("//input[@aria-label='Cari produk, merek dan toko']")).click();
//            driver.findElement(By.xpath("//input[@aria-label='Cari produk, merek dan toko']")).sendKeys(search);
//            driver.findElement(By.xpath("//input[@aria-label='Cari produk, merek dan toko']")).sendKeys(Keys.ENTER);
//            Assert.assertEquals(0, driver.findElements(By.xpath("//span[@class='shopee-search-result-header__text-highlight']")).size());
//List<Map<String, String>> rows = table.asMaps(String.class, String.class);
////        for (Map<String,String> row : rows) {
////        }
//    }
}
