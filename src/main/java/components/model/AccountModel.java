package components.model;

import java.util.Objects;

public class AccountModel {
    String ACCOUNT_NAME ;
    String PHONE ;
    String FAX ;
    String WEBSITE ;
    String TYPE ;
    String INDUSTRY ;
    String DESCRIPTIONS ;
    String ANNUAL_REVENUE ;
    String EMPLOYEES ;
    String BILLING_STREET ;
    String BILLING_COUNTRY ;
    String BILLING_CITY ;
    String BILLING_ZIP ;
    String BILLING_STATE ;

    String SHIPPING_STREET ;
    String SHIPPING_COUNTRY ;
    String SHIPPING_CITY ;
    String SHIPPING_ZIP ;
    String SHIPPING_STATE ;


    public AccountModel() {
    }

    public String getACCOUNT_NAME() {
        return ACCOUNT_NAME;
    }

    public String getPHONE() {
        return PHONE;
    }

    public String getFAX() {
        return FAX;
    }

    public String getWEBSITE() {
        return WEBSITE;
    }

    public String getTYPE() {
        return TYPE;
    }

    public String getINDUSTRY() {
        return INDUSTRY;
    }

    public String getDESCRIPTIONS() {
        return DESCRIPTIONS;
    }

    public String getANNUAL_REVENUE() {
        return ANNUAL_REVENUE;
    }

    public String getEMPLOYEES() {
        return EMPLOYEES;
    }

    public String getBILLING_STREET() {
        return BILLING_STREET;
    }

    public String getBILLING_COUNTRY() {
        return BILLING_COUNTRY;
    }

    public String getBILLING_CITY() {
        return BILLING_CITY;
    }

    public String getBILLING_ZIP() {
        return BILLING_ZIP;
    }

    public String getBILLING_STATE() {
        return BILLING_STATE;
    }

    public String getSHIPPING_STREET() {
        return SHIPPING_STREET;
    }

    public String getSHIPPING_COUNTRY() {
        return SHIPPING_COUNTRY;
    }

    public String getSHIPPING_CITY() {
        return SHIPPING_CITY;
    }

    public String getSHIPPING_ZIP() {
        return SHIPPING_ZIP;
    }

    public String getSHIPPING_STATE() {
        return SHIPPING_STATE;
    }

    public void setACCOUNT_NAME(String ACCOUNT_NAME) {
        this.ACCOUNT_NAME = ACCOUNT_NAME;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public void setFAX(String FAX) {
        this.FAX = FAX;
    }

    public void setWEBSITE(String WEBSITE) {
        this.WEBSITE = WEBSITE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public void setINDUSTRY(String INDUSTRY) {
        this.INDUSTRY = INDUSTRY;
    }

    public void setDESCRIPTIONS(String DESCRIPTIONS) {
        this.DESCRIPTIONS = DESCRIPTIONS;
    }

    public void setANNUAL_REVENUE(String ANNUAL_REVENUE) {
        this.ANNUAL_REVENUE = ANNUAL_REVENUE;
    }

    public void setEMPLOYEES(String EMPLOYEES) {
        this.EMPLOYEES = EMPLOYEES;
    }

    public void setBILLING_STREET(String BILLING_STREET) {
        this.BILLING_STREET = BILLING_STREET;
    }

    public void setBILLING_COUNTRY(String BILLING_COUNTRY) {
        this.BILLING_COUNTRY = BILLING_COUNTRY;
    }

    public void setBILLING_CITY(String BILLING_CITY) {
        this.BILLING_CITY = BILLING_CITY;
    }

    public void setBILLING_ZIP(String BILLING_ZIP) {
        this.BILLING_ZIP = BILLING_ZIP;
    }

    public void setBILLING_STATE(String BILLING_STATE) {
        this.BILLING_STATE = BILLING_STATE;
    }

    public void setSHIPPING_STREET(String SHIPPING_STREET) {
        this.SHIPPING_STREET = SHIPPING_STREET;
    }

    public void setSHIPPING_COUNTRY(String SHIPPING_COUNTRY) {
        this.SHIPPING_COUNTRY = SHIPPING_COUNTRY;
    }

    public void setSHIPPING_CITY(String SHIPPING_CITY) {
        this.SHIPPING_CITY = SHIPPING_CITY;
    }

    public void setSHIPPING_ZIP(String SHIPPING_ZIP) {
        this.SHIPPING_ZIP = SHIPPING_ZIP;
    }

    public void setSHIPPING_STATE(String SHIPPING_STATE) {
        this.SHIPPING_STATE = SHIPPING_STATE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountModel that = (AccountModel) o;
        return Objects.equals(ACCOUNT_NAME, that.ACCOUNT_NAME) && Objects.equals(PHONE, that.PHONE) && Objects.equals(FAX, that.FAX) && Objects.equals(WEBSITE, that.WEBSITE) && Objects.equals(TYPE, that.TYPE) && Objects.equals(INDUSTRY, that.INDUSTRY) && Objects.equals(DESCRIPTIONS, that.DESCRIPTIONS) && Objects.equals(ANNUAL_REVENUE, that.ANNUAL_REVENUE) && Objects.equals(EMPLOYEES, that.EMPLOYEES) && Objects.equals(BILLING_STREET, that.BILLING_STREET) && Objects.equals(BILLING_COUNTRY, that.BILLING_COUNTRY) && Objects.equals(BILLING_CITY, that.BILLING_CITY) && Objects.equals(BILLING_ZIP, that.BILLING_ZIP) && Objects.equals(BILLING_STATE, that.BILLING_STATE) && Objects.equals(SHIPPING_STREET, that.SHIPPING_STREET) && Objects.equals(SHIPPING_COUNTRY, that.SHIPPING_COUNTRY) && Objects.equals(SHIPPING_CITY, that.SHIPPING_CITY) && Objects.equals(SHIPPING_ZIP, that.SHIPPING_ZIP) && Objects.equals(SHIPPING_STATE, that.SHIPPING_STATE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ACCOUNT_NAME, PHONE, FAX, WEBSITE, TYPE, INDUSTRY, DESCRIPTIONS, ANNUAL_REVENUE, EMPLOYEES, BILLING_STREET, BILLING_COUNTRY, BILLING_CITY, BILLING_ZIP, BILLING_STATE, SHIPPING_STREET, SHIPPING_COUNTRY, SHIPPING_CITY, SHIPPING_ZIP, SHIPPING_STATE);
    }
}
