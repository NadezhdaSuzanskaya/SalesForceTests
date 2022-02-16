package steps;

import components.ListOfConstants;
import components.forms.AccountsDetailsText;
import components.forms.AccountDetailsNumber;
import components.forms.AccountDetailsLink;
import components.forms.CreateAccountFormComponent;
import components.forms.Input;
import components.forms.Table;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AccountPage;
import pages.DetailAccountPage;

public class DetailAccountStep extends AbstractStep {

    private AccountPage accountPage;
    private DetailAccountPage detailAccountPage;
    ListOfConstants listOfConstants = new ListOfConstants();
    private Table table;

    public DetailAccountStep(WebDriver driver) {
        super(driver);
    }

    public void checkDetails() {
        String bil_address= listOfConstants.getBILLING_STREET()+"\n"+listOfConstants.getBILLING_CITY()+", "+listOfConstants.getBILLING_STATE()+" "+listOfConstants.getBILLING_ZIP()+"\n"+listOfConstants.getBILLING_COUNTRY();
        String ship_address= listOfConstants.getSHIPPING_STREET()+"\n"+listOfConstants.getSHIPPING_CITY()+", "+listOfConstants.getSHIPPING_STATE()+" "+listOfConstants.getSHIPPING_ZIP()+"\n"+listOfConstants.getSHIPPING_COUNTRY();

        AccountsDetailsText accName = new AccountsDetailsText(driver, "Account Name");
        Assert.assertEquals(accName.getValueOfDetails(), listOfConstants.getACCOUNT_NAME(), "The Account Name is different");

        AccountDetailsLink phone = new AccountDetailsLink(driver, "Phone");
        Assert.assertEquals(phone.getValueOfDetails(), listOfConstants.getPHONE(), "The Account Phone is different");


        AccountDetailsLink fax = new AccountDetailsLink(driver, "Fax");
        Assert.assertEquals(fax.getValueOfDetails(), listOfConstants.getFAX(), "The Account fax is different");

        AccountDetailsLink website = new AccountDetailsLink(driver, "Website");
        Assert.assertEquals(website.getValueOfDetails(), listOfConstants.getWEBSITE(), "The Account website is different");

        AccountsDetailsText type = new AccountsDetailsText(driver, "Type");
        Assert.assertEquals(type.getValueOfDetails(), listOfConstants.getTYPE(), "The Account Type is different");

        AccountsDetailsText industry = new AccountsDetailsText(driver, "Industry");
        Assert.assertEquals(industry.getValueOfDetails(), listOfConstants.getINDUSTRY(), "The Account Industry is different");

        AccountsDetailsText description = new AccountsDetailsText(driver, "Description");
        Assert.assertEquals(description.getValueOfDetails(), listOfConstants.getDESCRIPTIONS(), "The Account Description is different");

        AccountsDetailsText annual_revenue = new AccountsDetailsText(driver, "Annual Revenue");
        Assert.assertEquals(annual_revenue.getValueOfDetails(), "$"+listOfConstants.getANNUAL_REVENUE(), "The Account Annual Revenue is different");

        AccountDetailsNumber employees = new AccountDetailsNumber(driver, "Employees");
        Assert.assertEquals(employees.getValueOfDetails(), listOfConstants.getEMPLOYEES(), "The Account Employees is different");

        AccountDetailsLink billingAddress = new AccountDetailsLink(driver, "Billing Address");
        Assert.assertEquals(billingAddress.getValueOfDetails(), bil_address, "The Billing Address is different");

        AccountDetailsLink shippingAddress = new AccountDetailsLink(driver, "Shipping Address");
        Assert.assertEquals(shippingAddress.getValueOfDetails(), ship_address, "The Shipping Address is different");

    }

    public DetailAccountStep isPageLoaded() {
        detailAccountPage = new DetailAccountPage(driver);
        detailAccountPage.waitPageLoaded();
        return this;
    }
}