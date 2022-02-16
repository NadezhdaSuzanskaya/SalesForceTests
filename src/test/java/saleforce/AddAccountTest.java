package saleforce;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class AddAccountTest extends BaseTest {

    @Test
    public void addNewAccountTest() {
        mainSteps
                .openSaleforceLoginPage()
                .loginWithValidCreds()
                .openAccountPage()
                .createNewAccount();
    }

    @Test
    public void checkCreatedAccountInTableTest() {
        mainSteps
                .openSaleforceLoginPage()
                .loginWithValidCreds()
                .openAccountPage();
        int countOfAccountNameBeforeAdding = accountsSteps.checkAccountNames();
        accountsSteps.createNewAccount();
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
        accountsSteps.createNewAccount();
        detailaccountsSteps.isPageLoaded()
                           .checkDetails();
    }


}
