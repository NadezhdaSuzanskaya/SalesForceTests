package steps;

import components.forms.*;
import components.model.AccountModel;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AccountPage;

public class AccountsSteps extends AbstractStep {

    private AccountPage accountPage;
    public AccountsSteps(WebDriver driver) {
        super(driver);
    }
//@Step("new account is created")
    public AccountsSteps createNewAccount(AccountModel accountModel) {
        accountPage = new AccountPage(driver);
        accountPage.openNewAccountForm();
        CreateFormComponent form = new CreateFormComponent(driver, "New Account");
        //CreateFormComponent form = new CreateFormComponent(driver, "New Account");
        Assert.assertTrue(
                form.isComponentDisplayed(),
                form.getClass().getSimpleName().concat(" not displayed")
        );
        enterDataInAccountForm(accountModel);
        form.save();
        //    validatePageIsLoaded(accountPage);
        return this;
    }
  //  @Step ("account details are filled")
    private void enterDataInAccountForm(AccountModel accountModel) {
        new Input(driver, "Account Name").insert(accountModel.getACCOUNT_NAME());
        new Input(driver, "Phone").insert(accountModel.getPHONE());
        new Input(driver, "Website").insert(accountModel.getWEBSITE());
      //  new Input(driver, "Fax").insert(accountModel.getFAX());
        new Input(driver, "Employees").insert(accountModel.getEMPLOYEES());
        new Dropdown(driver, "Type").selectOption(accountModel.getTYPE());
        new Dropdown(driver, "Industry").selectOption(accountModel.getINDUSTRY());
        //    new Input(driver, "Annual Revenue").insert(accountModel.getANNUAL_REVENUE());
        new Input(driver, "Billing City").insert(accountModel.getBILLING_CITY());
        new Input(driver, "Billing State/Province").insert(accountModel.getBILLING_STATE());
        new Input(driver, "Billing Zip/Postal Code").insert(accountModel.getBILLING_ZIP());
        new Input(driver, "Billing Country").insert(accountModel.getBILLING_COUNTRY());
        new Input(driver, "Shipping City").insert(accountModel.getSHIPPING_CITY());
        new Input(driver, "Shipping State/Province").insert(accountModel.getSHIPPING_STATE());
        new Input(driver, "Shipping Zip/Postal Code").insert(accountModel.getSHIPPING_ZIP());
        new Input(driver, "Shipping Country").insert(accountModel.getSHIPPING_COUNTRY());
        new TextArea(driver, "Description").insert(accountModel.getDESCRIPTIONS());
        new TextArea(driver, "Billing Street").insert(accountModel.getBILLING_STREET());
        new TextArea(driver, "Shipping Street").insert(accountModel.getSHIPPING_STREET());
    }

    public int checkAccountNames() {
        Table tableLine = new Table(driver);
        return tableLine.countOfAccountsWithSelectedName();
    }

    public AccountsSteps isTableLoaded() {
        accountPage = new AccountPage(driver);
        accountPage.waitTableLoaded();
        return this;
    }

}
