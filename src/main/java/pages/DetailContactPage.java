package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DetailContactPage extends BasePage {
    private static final By HEADER = By.xpath("//h1//span[text()='Contacts']");
    private static final By TITLE_DETAIL_CONTACT_PAGE = By.xpath("//div[@class='entityNameTitle slds-line-height--reset' and text()='Contact']");

    public DetailContactPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitPageLoaded() {
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(TITLE_DETAIL_CONTACT_PAGE));
    }

    @Override
    public BasePage openPage() {
        return this;
    }
}