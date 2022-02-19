package components.forms;

import components.AbstractComponent;
import components.constants.ListOfConstants_del;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Table extends AbstractComponent {
    ListOfConstants_del listOfConstants = new ListOfConstants_del();

    private static final String TABLE_BODY = "//table/tbody";
    private static final String TABLE_TR = "//table/tbody/tr";
    private static final String ACCOUNTS_NAME = "//a[@data-aura-class='forceOutputLookup']";
    private By inputLocator;
    private By trTable = By.xpath(TABLE_TR);

    public Table(WebDriver driver) {
        super(driver);
        this.inputLocator = By.xpath(TABLE_BODY);
    }

    @Override
    public boolean isComponentDisplayed() {
        return driver.findElement(inputLocator).isDisplayed();
    }

    public void insert(String text) {
        driver.findElement(inputLocator).sendKeys(text);
    }

    public int countOfAccountsWithSelectedName() {
        //   ListOfConstants listOfConstants= new ListOfConstants();
        List<WebElement> elems;
        List expectedProductList = new ArrayList();
        int countOfName = 0;
        if (isComponentDisplayed()) {
            elems = driver.findElements(trTable);
            System.out.println("elem: " + elems);
            for (int i = 0; i < elems.size(); i++) {
                expectedProductList.add(driver.findElements(By.xpath(ACCOUNTS_NAME)).get(i).getText());
                System.out.println("333" + driver.findElements(By.xpath(ACCOUNTS_NAME)).get(i).getText());
                System.out.println("444" + listOfConstants.getACCOUNT_NAME());
                if (driver.findElements(By.xpath(ACCOUNTS_NAME)).get(i).getText().equals(listOfConstants.getACCOUNT_NAME())) {
                    countOfName++;
                }
            }
            System.out.println(expectedProductList);
        }
        System.out.println("countOfName:" + countOfName);
        return countOfName;
    }
}
