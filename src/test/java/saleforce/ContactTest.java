package saleforce;

import components.model.ContactModel;
import org.testng.annotations.Test;
import utils.ContactModelUtils;

public class ContactTest extends BaseTest {
    ContactModel testContact = ContactModelUtils.getContactModel();

    @Test
    public void addNewContactTest() {
        mainSteps
                .openSaleforceLoginPage()
                .loginWithValidCreds()
                .openContactsPage()
                .createContact(testContact);
    }

    @Test
    public void checkDetailsCreatedContactTest() {
        mainSteps
                .openSaleforceLoginPage()
                .loginWithValidCreds()
                .openContactsPage()
                .createContact(testContact);
        detailContactSteps.isPageLoaded()
                .checkDetails();
    }
}
