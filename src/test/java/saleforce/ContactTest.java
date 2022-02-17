package saleforce;

import org.testng.annotations.Test;

public class ContactTest extends BaseTest {

    @Test
    public void addNewContactTest() {
        mainSteps
                .openSaleforceLoginPage()
                .loginWithValidCreds()
                .openContactsPage()
                .createContact();
    }

    @Test
    public void checkDetailsCreatedContactTest() {
        mainSteps
                .openSaleforceLoginPage()
                .loginWithValidCreds()
                .openContactsPage()
                .createContact()
                .isPageLoaded()
                .checkDetails();
    }
}
