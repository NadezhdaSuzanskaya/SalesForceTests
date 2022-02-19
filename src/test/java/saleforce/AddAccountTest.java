package saleforce;

import components.model.AccountModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import utils.AccountModelUtils;

public class AddAccountTest extends BaseTest {
    AccountModel testAccount = AccountModelUtils.getAccountModel();
    @Test
    public void addNewAccountTest() {
        mainSteps
                .openSaleforceLoginPage()
                .loginWithValidCreds()
                .openAccountPage()
                .createNewAccount(testAccount);
    }

    @Test
    public void checkCreatedAccountInTableTest() {
        mainSteps
                .openSaleforceLoginPage()
                .loginWithValidCreds()
                .openAccountPage();
        int countOfAccountNameBeforeAdding = accountsSteps.checkAccountNames();
        accountsSteps.createNewAccount(testAccount);
        mainSteps
                .openAccountPage()   //open the tab "Account"
                .isTableLoaded();   //wait till the table is reloaded
        int countOfAccountNameAfterAdding = accountsSteps.checkAccountNames();
        Assert.assertEquals(countOfAccountNameAfterAdding, countOfAccountNameBeforeAdding + 1, "Account with selected name wasn't created");
    }

    @Test
    public void checkDetailsCreatedAccountTest() {
        mainSteps
                .openSaleforceLoginPage()
                .loginWithValidCreds()
                .openAccountPage();
        accountsSteps.createNewAccount(testAccount);
        detailaccountsSteps.isPageLoaded()
                           .checkDetails();
    }


}
