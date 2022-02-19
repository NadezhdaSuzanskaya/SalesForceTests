package utils;

import components.constants.AccountConstans;
import components.model.AccountModel;

public class AccountModelUtils {
    public static AccountModel getAccountModel() {
        AccountModel accountModel = new AccountModel();
        accountModel.setACCOUNT_NAME(AccountConstans.ACCOUNT_NAME);
        accountModel.setPHONE(AccountConstans.PHONE);
        accountModel.setFAX(AccountConstans.FAX);
        accountModel.setWEBSITE(AccountConstans.WEBSITE);
        accountModel.setTYPE(AccountConstans.TYPE);
        accountModel.setINDUSTRY(AccountConstans.INDUSTRY);
        accountModel.setDESCRIPTIONS(AccountConstans.DESCRIPTIONS);
        accountModel.setANNUAL_REVENUE(AccountConstans.ANNUAL_REVENUE);
        accountModel.setEMPLOYEES(AccountConstans.EMPLOYEES);

        accountModel.setBILLING_STREET(AccountConstans.BILLING_STREET);
        accountModel.setBILLING_COUNTRY(AccountConstans.BILLING_COUNTRY);
        accountModel.setBILLING_CITY(AccountConstans.BILLING_CITY);
        accountModel.setBILLING_ZIP(AccountConstans.BILLING_ZIP);
        accountModel.setBILLING_STATE(AccountConstans.BILLING_STATE);

        accountModel.setSHIPPING_STREET(AccountConstans.SHIPPING_STREET);
        accountModel.setSHIPPING_COUNTRY(AccountConstans.SHIPPING_COUNTRY);
        accountModel.setSHIPPING_CITY(AccountConstans.SHIPPING_CITY);
        accountModel.setSHIPPING_ZIP(AccountConstans.SHIPPING_ZIP);
        accountModel.setSHIPPING_STATE(AccountConstans.SHIPPING_STATE);
        return accountModel;

    }
}
