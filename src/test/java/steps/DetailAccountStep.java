package steps;

import components.constants.AccountConstans;
import components.forms.DetailsText;
import components.forms.DetailsNumber;
import components.forms.DetailsLink;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.DetailAccountPage;

public class DetailAccountStep extends AbstractStep {

    private DetailAccountPage detailAccountPage;

    public DetailAccountStep(WebDriver driver) {
        super(driver);
    }

    @Step("account's details are checked")
    public void checkDetails() {
        String bil_address = AccountConstans.BILLING_STREET + "\n" + AccountConstans.BILLING_CITY + ", " + AccountConstans.BILLING_STATE + " " + AccountConstans.BILLING_ZIP + "\n" + AccountConstans.BILLING_COUNTRY;
        String ship_address = AccountConstans.SHIPPING_STREET + "\n" + AccountConstans.SHIPPING_CITY + ", " + AccountConstans.SHIPPING_STATE + " " + AccountConstans.SHIPPING_ZIP + "\n" + AccountConstans.SHIPPING_COUNTRY;

        Assert.assertEquals((new DetailsText(driver, "Account Name")).getValueOfDetails(), AccountConstans.ACCOUNT_NAME, "The Account Name is different");
        Assert.assertEquals((new DetailsLink(driver, "Phone")).getValueOfDetails(), AccountConstans.PHONE, "The Account Phone is different");
        Assert.assertEquals((new DetailsLink(driver, "Fax")).getValueOfDetails(), AccountConstans.FAX, "The Account fax is different");
        Assert.assertEquals((new DetailsLink(driver, "Website")).getValueOfDetails(), AccountConstans.WEBSITE, "The Account website is different");
        Assert.assertEquals((new DetailsText(driver, "Type")).getValueOfDetails(), AccountConstans.TYPE, "The Account Type is different");
        Assert.assertEquals((new DetailsText(driver, "Industry")).getValueOfDetails(), AccountConstans.INDUSTRY, "The Account Industry is different");
        Assert.assertEquals((new DetailsText(driver, "Description")).getValueOfDetails(), AccountConstans.DESCRIPTIONS, "The Account Description is different");
        Assert.assertEquals((new DetailsText(driver, "Annual Revenue")).getValueOfDetails(), "$" + AccountConstans.ANNUAL_REVENUE, "The Account Annual Revenue is different");
        Assert.assertEquals((new DetailsNumber(driver, "Employees")).getValueOfDetails(), AccountConstans.EMPLOYEES, "The Account Employees is different");
        Assert.assertEquals((new DetailsLink(driver, "Billing Address")).getValueOfDetails(), bil_address, "The Billing Address is different");
        Assert.assertEquals((new DetailsLink(driver, "Shipping Address")).getValueOfDetails(), ship_address, "The Shipping Address is different");

    }

    @Step("the page with account's details is loaded")
    public DetailAccountStep isPageLoaded() {
        detailAccountPage = new DetailAccountPage(driver);
        detailAccountPage.waitPageLoaded();
        return this;
    }
}