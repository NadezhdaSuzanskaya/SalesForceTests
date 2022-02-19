package utils;

import components.constants.AccountConstans;
import components.constants.ContactConstants;
import components.model.AccountModel;
import components.model.ContactModel;

public class ContactModelUtils {

    public static ContactModel getContactModel() {
        ContactModel contactModel = new ContactModel();
        contactModel.setACCOUNT_NAME(ContactConstants.ACCOUNT_NAME);
        contactModel.setCONTACT_PHONE(ContactConstants.CONTACT_PHONE);
        contactModel.setCONTACT_MOBILE(ContactConstants.CONTACT_MOBILE);
        contactModel.setCONTACT_FAX(ContactConstants.CONTACT_FAX);
        contactModel.setCONTACT_EMAIL(ContactConstants.CONTACT_EMAIL);
        contactModel.setCONTACT_TITLE(ContactConstants.CONTACT_TITLE);
        contactModel.setCONTACT_DEPARTMENT(ContactConstants.CONTACT_DEPARTMENT);
        contactModel.setBIRTHDATE(ContactConstants.BIRTHDATE);
        contactModel.setFIRST_NAME(ContactConstants.FIRST_NAME);
        contactModel.setLAST_NAME(ContactConstants.LAST_NAME);
        return contactModel;

    }
}
