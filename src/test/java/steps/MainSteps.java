package steps;

import components.buttons.menu.AccountsButton;
import components.buttons.menu.ContactsButton;
import components.forms.Table;
import io.qameta.allure.Step;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AccountPage;
import pages.ContactPage;
import pages.HomePage;
import pages.SalesforceLoginPage;

import static saleforce.BaseTest.PASSWORD;
import static saleforce.BaseTest.USERNAME;

public class MainSteps extends AbstractStep {

    private SalesforceLoginPage loginPage;
    private HomePage homePage;
    private AccountPage accountPage;
    private AccountsButton accountsButton;
    private ContactsButton contactsButton;
    private Table table;
    private static final String VALID_LOGIN = System.getProperty("login");
    private static final String VALID_PASSWORD = System.getProperty("password");

    public MainSteps(WebDriver driver) {
        super(driver);
    }

    @Step("the saleforce page is opened")
    public MainSteps openSaleforceLoginPage() {
        loginPage = new SalesforceLoginPage(driver);
        loginPage.openPage();
        validatePageIsLoaded(loginPage);
        return this;
    }

    @Step("the user logs in")
    public MainSteps loginWithValidCreds() {
        //loginPage.authentication(VALID_LOGIN, VALID_PASSWORD);
        loginPage.authentication(USERNAME, PASSWORD);
        homePage = new HomePage(driver);
        validatePageIsLoaded(homePage);
        return this;
    }

    @Step("the Account page is opened")
    public AccountsSteps openAccountPage() {
        accountsButton = new AccountsButton(driver);
        Assert.assertTrue(
                accountsButton.isComponentDisplayed(),
                accountsButton.getClass().getSimpleName().concat(" not displayed")
        );
        accountsButton.click();
        validatePageIsLoaded(new AccountPage(driver));
        return new AccountsSteps(driver);
    }

    public AccountsSteps isTableDisplayed() {
        table = new Table(driver);
        Assert.assertTrue(
                table.isComponentDisplayed(),
                table.getClass().getSimpleName().concat(" not displayed")
        );
        //    accountsButton.click();
        //  validatePageIsLoaded(new AccountPage(driver));
        return new AccountsSteps(driver);
    }

    @Step("the Contact page is opened")
    public ContactsSteps openContactsPage() {
        contactsButton = new ContactsButton(driver);
        Assert.assertTrue(
                contactsButton.isComponentDisplayed(),
                contactsButton.getClass().getSimpleName().concat(" not displayed")
        );
        contactsButton.click();
        validatePageIsLoaded(new ContactPage(driver));
        return new ContactsSteps(driver);
    }


}
