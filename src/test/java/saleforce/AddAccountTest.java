package saleforce;

import components.model.AccountModel;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import utils.AccountModelUtils;

public class AddAccountTest extends BaseTest {
    AccountModel testAccount = AccountModelUtils.getAccountModel();
    @Test (groups = "smoke")
    public void addNewAccountTest() {
        mainSteps
                .openSaleforceLoginPage()
                .loginWithValidCreds()
                .openAccountPage()
                .createNewAccount(testAccount);
    }
    @Test (groups = "smoke")
@Issue(value= "CAL-1")
@TmsLink(value= "CAL-1")

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

//    @Test (groups = "smoke", description="Сreating a new account and checking the details of the created account")
    @Issue(value= "CAL-1")
    @TmsLink(value= "CAL-1")
    @Description("Steps: - opening the site" +
            "- logging in" +
            "creating new account" +
            "checking the delails")
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
