package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactPage extends BasePage {

    private static final String BASE_URN = "https://nonamecomp.lightning.force.com/lightning/o/Account/list?filterName=Recent";

    private static final By HEADER = By.xpath("//h1[contains(.,'Contact')]");
    private static final By NEW_BUTTON = By.cssSelector("[title='New']");
    private static final By TABLE = By.xpath("//table/tbody/tr");
    private static final By MESSAGE = By.xpath("//span[contains(.,'Updated')]");

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitPageLoaded() {
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(HEADER));
    }

    @Override
    public BasePage openPage() {
        driver.get(BASE_URN);
        return this;
    }

    public void openNewContactForm() {
        driver.findElement(NEW_BUTTON).click();
    }
    public void waitTableLoaded() {
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(MESSAGE));
    }
}
