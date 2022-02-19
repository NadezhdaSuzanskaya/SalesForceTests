package components.model;

import java.util.Objects;

public class ContactModel {
    String ACCOUNT_NAME;
    String CONTACT_PHONE ;
    String CONTACT_MOBILE ;
    String CONTACT_EMAIL ;
    String CONTACT_TITLE ;
    String CONTACT_FAX ;
    String CONTACT_DEPARTMENT ;
    String FIRST_NAME;
    String LAST_NAME;
    String BIRTHDATE ;
    String TYPE ;

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getACCOUNT_NAME() {
        return ACCOUNT_NAME;
    }

    public void setACCOUNT_NAME(String ACCOUNT_NAME) {
        this.ACCOUNT_NAME = ACCOUNT_NAME;
    }

    public ContactModel() {
    }

    public String getCONTACT_PHONE() {
        return CONTACT_PHONE;
    }

    public void setCONTACT_PHONE(String CONTACT_PHONE) {
        this.CONTACT_PHONE = CONTACT_PHONE;
    }

    public String getCONTACT_MOBILE() {
        return CONTACT_MOBILE;
    }

    public void setCONTACT_MOBILE(String CONTACT_MOBILE) {
        this.CONTACT_MOBILE = CONTACT_MOBILE;
    }

    public String getCONTACT_EMAIL() {
        return CONTACT_EMAIL;
    }

    public void setCONTACT_EMAIL(String CONTACT_EMAIL) {
        this.CONTACT_EMAIL = CONTACT_EMAIL;
    }

    public String getCONTACT_TITLE() {
        return CONTACT_TITLE;
    }

    public void setCONTACT_TITLE(String CONTACT_TITLE) {
        this.CONTACT_TITLE = CONTACT_TITLE;
    }

    public String getCONTACT_FAX() {
        return CONTACT_FAX;
    }

    public void setCONTACT_FAX(String CONTACT_FAX) {
        this.CONTACT_FAX = CONTACT_FAX;
    }

    public String getCONTACT_DEPARTMENT() {
        return CONTACT_DEPARTMENT;
    }

    public void setCONTACT_DEPARTMENT(String CONTACT_DEPARTMENT) {
        this.CONTACT_DEPARTMENT = CONTACT_DEPARTMENT;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getBIRTHDATE() {
        return BIRTHDATE;
    }

    public void setBIRTHDATE(String BIRTHDATE) {
        this.BIRTHDATE = BIRTHDATE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactModel that = (ContactModel) o;
        return Objects.equals(ACCOUNT_NAME, that.ACCOUNT_NAME) && Objects.equals(CONTACT_PHONE, that.CONTACT_PHONE) && Objects.equals(CONTACT_MOBILE, that.CONTACT_MOBILE) && Objects.equals(CONTACT_EMAIL, that.CONTACT_EMAIL) && Objects.equals(CONTACT_TITLE, that.CONTACT_TITLE) && Objects.equals(CONTACT_FAX, that.CONTACT_FAX) && Objects.equals(CONTACT_DEPARTMENT, that.CONTACT_DEPARTMENT) && Objects.equals(FIRST_NAME, that.FIRST_NAME) && Objects.equals(LAST_NAME, that.LAST_NAME) && Objects.equals(BIRTHDATE, that.BIRTHDATE) && Objects.equals(TYPE, that.TYPE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ACCOUNT_NAME, CONTACT_PHONE, CONTACT_MOBILE, CONTACT_EMAIL, CONTACT_TITLE, CONTACT_FAX, CONTACT_DEPARTMENT, FIRST_NAME, LAST_NAME, BIRTHDATE, TYPE);
    }
}
