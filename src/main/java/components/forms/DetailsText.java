package components.forms;

import components.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailsText extends AbstractComponent {

    private static final String LOCATOR_PATTERN =
            "//span[@class='test-id__field-label' and text()='%s']/ancestor::div[contains(@class,'test-id__output-root')]//lightning-formatted-text";
    private static final String LOCATOR_PATTERN_NAME =
            "//span[@class='test-id__field-label' and text()='%s']/ancestor::div[contains(@class,'test-id__output-root')]//lightning-formatted-name";
    private String label;
    private By inputLocator;
    private By inputLocatorName;

    public DetailsText(WebDriver driver, String label) {
        super(driver);
        this.label = label;
        this.inputLocator = By.xpath(String.format(LOCATOR_PATTERN, label));
        this.inputLocatorName = By.xpath(String.format(LOCATOR_PATTERN_NAME, label));
    }

    @Override
    public boolean isComponentDisplayed() {
        return driver.findElement(inputLocator).isDisplayed();
    }

    public void insert(String text) {
        driver.findElement(inputLocator).sendKeys(text);
    }

    public String getValueOfDetails() {
        return driver.findElement(inputLocator).getText();
    }
    public String getValueOfDetailsByName() {
        return driver.findElement(inputLocatorName).getText();
    }
}
