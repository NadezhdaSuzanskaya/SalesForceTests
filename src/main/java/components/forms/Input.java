package components.forms;

import components.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Input extends AbstractComponent {

    private static final String INPUT_LOCATOR_PATTERN =
            "//label[contains(.,'%s')]/ancestor::div[contains(@class,'uiInput')]//input";

    private static final String INPUT_GRID_CONTACT_LOCATOR_PATTERN =
    "//label[contains(.,'%s')]/ancestor::div[contains(@class,'slds-grid')]//input";

    private static final String INPUT_FORM_CONTACT_LOCATOR_PATTERN =
            "//label[contains(.,'%s')]/ancestor::div[contains(@class,'slds-form-element__row')]//input";
    private static final String INPUT_DROPDOWN_LOCATOR_PATTERN =
    "//label[contains(.,'%s')]/ancestor::div[contains(@class,'slds-grid')]//input";
    private static final String DROPDOWN_OPTION_LOCATOR_PATTERN =
    "//label[contains(.,'Account Name')]/ancestor::div[contains(@class,'slds-grid')]//span[@class='slds-truncate' and text()='%s']";


    private String label;
    private By inputLocator;
    private By inputLocatorContact;
    private By inputLocatorContact1;
    private By inputLocatorDropdown;
   // private By dropdownLocatorOption;

    public Input(WebDriver driver, String label) {
        super(driver);
        this.label = label;
        this.inputLocator = By.xpath(String.format(INPUT_LOCATOR_PATTERN, label));
        this.inputLocatorContact = By.xpath(String.format(INPUT_GRID_CONTACT_LOCATOR_PATTERN , label));
        this.inputLocatorContact1 = By.xpath(String.format(INPUT_FORM_CONTACT_LOCATOR_PATTERN , label));
        this.inputLocatorDropdown = By.xpath(String.format(INPUT_DROPDOWN_LOCATOR_PATTERN , label));
     //   this.dropdownLocatorOption = By.xpath(String.format(DROPDOWN_OPTION_LOCATOR_PATTERN , label));
    }

    @Override
    public boolean isComponentDisplayed() {
        return driver.findElement(inputLocator).isDisplayed();
    }

    public void insert(String text) {
        driver.findElement(inputLocator).sendKeys(text);
    }

    public void insertContactGrigInput(String text) {
        driver.findElement(inputLocatorContact).sendKeys(text);
    }
    public void insertContactFormInput(String text) {
        driver.findElement(inputLocatorContact1).sendKeys(text);
    }

    private void openDropdownPopup() {
        driver.findElement(inputLocatorDropdown).click();
    }

    public void selectOption(String optionName) {
        openDropdownPopup();
        By optionLocator = By.xpath(String.format(DROPDOWN_OPTION_LOCATOR_PATTERN, optionName));
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(optionLocator));
        System.out.println("0000:"+optionLocator);
        System.out.println("0000:"+driver.findElement(optionLocator).getText());
        System.out.println("0000:"+driver.findElement(optionLocator).isDisplayed());
        driver.findElement(optionLocator).click();
       // explicitlyWait.until(ExpectedConditions.textToBePresentInElementLocated(optionLocator, optionName));
    }
}
