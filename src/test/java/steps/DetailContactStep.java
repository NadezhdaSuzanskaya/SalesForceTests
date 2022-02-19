package steps;

import components.constants.AccountConstans;
import components.constants.ContactConstants;
import components.constants.ListOfConstants;
import components.forms.DetailsLink;
import components.forms.DetailsNumber;
import components.forms.DetailsText;
import components.forms.Table;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.ContactPage;
import pages.DetailContactPage;

public class DetailContactStep extends AbstractStep {

    private DetailContactPage detailContactPage;
    public DetailContactStep(WebDriver driver) {
        super(driver);
    }

    public void checkDetails() {
        String name = ContactConstants.FIRST_NAME + " " + ContactConstants.LAST_NAME;

        Assert.assertEquals((new DetailsLink(driver, "Account Name")).getValueOfAccNameDetails(), ContactConstants.ACCOUNT_NAME, "The Account Name for Contact is different");
        Assert.assertEquals((new DetailsLink(driver, "Phone")).getValueOfDetails(), ContactConstants.CONTACT_PHONE, "The Contact Phone is different");
        Assert.assertEquals((new DetailsLink(driver, "Mobile")).getValueOfDetails(), ContactConstants.CONTACT_MOBILE, "The Contact Mobile Phone is different");
        Assert.assertEquals((new DetailsLink(driver, "Fax")).getValueOfDetails(), ContactConstants.CONTACT_FAX, "The Contact Fax is different");
        Assert.assertEquals((new DetailsLink(driver, "Email")).getValueOfDetails(), ContactConstants.CONTACT_EMAIL, "The Contact Type is different");
        Assert.assertEquals((new DetailsText(driver, "Title")).getValueOfDetails(), ContactConstants.CONTACT_TITLE, "The Contact Industry is different");
        Assert.assertEquals((new DetailsText(driver, "Type")).getValueOfDetails(), ContactConstants.TYPE, "The Contact Description is different");
        Assert.assertEquals((new DetailsText(driver, "Department")).getValueOfDetails(), ContactConstants.CONTACT_DEPARTMENT, "The Contact Annual Revenue is different");
        Assert.assertEquals((new DetailsText(driver, "Birthdate")).getValueOfDetails(), ContactConstants.BIRTHDATE, "The Contact Employees is different");
        Assert.assertEquals((new DetailsText(driver, "Name")).getValueOfDetailsByName(), name, "The Contact Name is different");

    }

    public DetailContactStep isPageLoaded() {
        detailContactPage = new DetailContactPage(driver);
        detailContactPage.waitPageLoaded();
        return this;
    }
}

