package steps;

import components.ListOfConstants;
import components.forms.DetailsText;
import components.forms.DetailsNumber;
import components.forms.DetailsLink;
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

        DetailsText accName = new DetailsText(driver, "Account Name");
        Assert.assertEquals(accName.getValueOfDetails(), listOfConstants.getACCOUNT_NAME(), "The Account Name is different");

        DetailsLink phone = new DetailsLink(driver, "Phone");
        Assert.assertEquals(phone.getValueOfDetails(), listOfConstants.getPHONE(), "The Account Phone is different");


        DetailsLink fax = new DetailsLink(driver, "Fax");
        Assert.assertEquals(fax.getValueOfDetails(), listOfConstants.getFAX(), "The Account fax is different");

        DetailsLink website = new DetailsLink(driver, "Website");
        Assert.assertEquals(website.getValueOfDetails(), listOfConstants.getWEBSITE(), "The Account website is different");

        DetailsText type = new DetailsText(driver, "Type");
        Assert.assertEquals(type.getValueOfDetails(), listOfConstants.getTYPE(), "The Account Type is different");

        DetailsText industry = new DetailsText(driver, "Industry");
        Assert.assertEquals(industry.getValueOfDetails(), listOfConstants.getINDUSTRY(), "The Account Industry is different");

        DetailsText description = new DetailsText(driver, "Description");
        Assert.assertEquals(description.getValueOfDetails(), listOfConstants.getDESCRIPTIONS(), "The Account Description is different");

        DetailsText annual_revenue = new DetailsText(driver, "Annual Revenue");
        Assert.assertEquals(annual_revenue.getValueOfDetails(), "$"+listOfConstants.getANNUAL_REVENUE(), "The Account Annual Revenue is different");

        DetailsNumber employees = new DetailsNumber(driver, "Employees");
        Assert.assertEquals(employees.getValueOfDetails(), listOfConstants.getEMPLOYEES(), "The Account Employees is different");

        DetailsLink billingAddress = new DetailsLink(driver, "Billing Address");
        Assert.assertEquals(billingAddress.getValueOfDetails(), bil_address, "The Billing Address is different");

        DetailsLink shippingAddress = new DetailsLink(driver, "Shipping Address");
        Assert.assertEquals(shippingAddress.getValueOfDetails(), ship_address, "The Shipping Address is different");

    }

    public DetailAccountStep isPageLoaded() {
        detailAccountPage = new DetailAccountPage(driver);
        detailAccountPage.waitPageLoaded();
        return this;
    }
}