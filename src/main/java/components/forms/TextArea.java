package components.forms;

import components.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea extends AbstractComponent {

    private static final String TEXTAREA_LOCATOR_PATTERN =
            "//label[contains(.,'%s')]/ancestor::div[contains(@class,'uiInput')]//textarea";
    private String label;
    private By inputLocator;

    public TextArea(WebDriver driver, String label) {
        super(driver);
        this.label = label;
        this.inputLocator = By.xpath(String.format(TEXTAREA_LOCATOR_PATTERN, label));
    }

    @Override
    public boolean isComponentDisplayed() {
        return driver.findElement(inputLocator).isDisplayed();
    }

    public void insert(String text) {
        driver.findElement(inputLocator).sendKeys(text);
    }

}