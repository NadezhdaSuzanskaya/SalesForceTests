package components.forms;

import components.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateFormComponent extends AbstractComponent {

    private static final By HEADER1 = By.xpath("//h2[contains(.,'New Account')]");
    private static final String HEADER = "//h2[contains(.,'%s')]";
    private static final By SAVE_BUTTON = By.xpath("//div[@class='actionsContainer']//button[contains(@class,'uiButton')]/span[text()='Save']");
    private String nameOfButton;
    private By inputLocator;

    private static final By SAVE_BUTTON_CONTACT = By.xpath("//div[@class='center-align-buttons']//button[text()='Save']");

    public CreateFormComponent(WebDriver driver, String nameOfButton) {
        super(driver);
        this.nameOfButton = nameOfButton;
        this.inputLocator = By.xpath(String.format(HEADER, nameOfButton));
    }

    @Override
    public boolean isComponentDisplayed() {
        try {
            explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(inputLocator));
        } catch (TimeoutException ex) {
            return false;
        }
        return true;
    }

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }

    public void saveContact() {
        driver.findElement(SAVE_BUTTON_CONTACT).click();
    }

}
