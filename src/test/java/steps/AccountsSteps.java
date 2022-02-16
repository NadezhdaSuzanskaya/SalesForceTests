package steps;

import components.buttons.menu.AccountsButton;
import components.forms.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AccountPage;
import components.ListOfConstants;

public class AccountsSteps extends AbstractStep {

    private AccountPage accountPage;
    ListOfConstants listOfConstants= new ListOfConstants();
    private Table table;

    public AccountsSteps(WebDriver driver) {
        super(driver);
    }

    public void createNewAccount() {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.openNewAccountForm();
        CreateAccountFormComponent form = new CreateAccountFormComponent(driver);
        Assert.assertTrue(
                form.isComponentDisplayed(),
                form.getClass().getSimpleName().concat(" not displayed")
        );
        Input accountNameInput = new Input(driver, "Account Name");
        accountNameInput.insert(listOfConstants.getACCOUNT_NAME());

        new Input(driver, "Phone").insert(listOfConstants.getPHONE());
        new Input(driver, "Website").insert(listOfConstants.getWEBSITE());
        new Input(driver, "Fax").insert(listOfConstants.getFAX());
        new Input(driver, "Employees").insert(listOfConstants.getEMPLOYEES());
        new Dropdown(driver, "Type").selectOption(listOfConstants.getTYPE());
        new Dropdown(driver, "Industry").selectOption(listOfConstants.getINDUSTRY());
        new Input(driver, "Annual Revenue").insert(listOfConstants.getANNUAL_REVENUE());
        new Input(driver, "Billing City").insert(listOfConstants.getBILLING_CITY());
        new Input(driver, "Billing State/Province").insert(listOfConstants.getBILLING_STATE());
        new Input(driver, "Billing Zip/Postal Code").insert(listOfConstants.getBILLING_ZIP());
        new Input(driver, "Billing Country").insert(listOfConstants.getBILLING_COUNTRY());
        new Input(driver, "Shipping City").insert(listOfConstants.getSHIPPING_CITY());
        new Input(driver, "Shipping State/Province").insert(listOfConstants.getSHIPPING_STATE());
        new Input(driver, "Shipping Zip/Postal Code").insert(listOfConstants.getSHIPPING_ZIP());
        new Input(driver, "Shipping Country").insert(listOfConstants.getSHIPPING_COUNTRY());
        new TextArea(driver, "Description").insert(listOfConstants.getDESCRIPTIONS());
        new TextArea(driver, "Billing Street").insert(listOfConstants.getBILLING_STREET());
        new TextArea(driver, "Shipping Street").insert(listOfConstants.getSHIPPING_STREET());
        form.save();
      //  validatePageIsLoaded(accountPage);
    }

    public void checkAccountData() {
        //  new Table(driver).isComponentDisplayed();
        Assert.assertTrue(new Table(driver).isComponentDisplayed(), "table isn't displayed");

    }

    public int checkAccountNames() {

        Table tableLine = new Table(driver);
        return tableLine.countOfAccountsWithSelectedName();
    }
    public AccountsSteps isTableLoaded() {
        accountPage = new AccountPage(driver);
        //  table = new Table(driver);
        // table.isComponentDisplayed();
        System.out.println("22222222223333333333");
        accountPage.waitTableLoaded();
        System.out.println("88888888888888833333");
        return this;
    }

}
