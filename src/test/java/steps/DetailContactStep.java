package steps;

import components.ListOfConstants;
import components.forms.DetailsLink;
import components.forms.DetailsText;
import components.forms.Table;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.ContactPage;
import pages.DetailContactPage;

public class DetailContactStep extends AbstractStep {

    private ContactPage contactPage;
    private DetailContactPage detailContactPage;
    ListOfConstants listOfConstants = new ListOfConstants();
    private Table table;

    public DetailContactStep(WebDriver driver) {
        super(driver);
    }

    public void checkDetails() {
        DetailsLink phone = new DetailsLink(driver, "Phone");
        Assert.assertEquals(phone.getValueOfDetails(), listOfConstants.getCONTACT_PHONE(), "The Contact Phone is different");

        DetailsLink mobile = new DetailsLink(driver, "Mobile");
        Assert.assertEquals(mobile.getValueOfDetails(), listOfConstants.getCONTACT_MOBILE(), "The Contact Mobile Phone is different");

        DetailsLink fax = new DetailsLink(driver, "Fax");
        Assert.assertEquals(fax.getValueOfDetails(), listOfConstants.getCONTACT_FAX(), "The Contact Fax is different");

        DetailsLink email = new DetailsLink(driver, "Email");
        Assert.assertEquals(email.getValueOfDetails(), listOfConstants.getCONTACT_EMAIL(), "The Contact Email is different");

        DetailsText title = new DetailsText(driver, "Title");
        Assert.assertEquals(title.getValueOfDetails(), listOfConstants.getCONTACT_TITLE(), "The Contact Title is different");

        DetailsText type = new DetailsText(driver, "Type");
        Assert.assertEquals(type.getValueOfDetails(), listOfConstants.getTYPE(), "The Contact Type is different");

        DetailsText department = new DetailsText(driver, "Department");
        Assert.assertEquals(department.getValueOfDetails(), listOfConstants.getCONTACT_DEPARTMENT(), "The Contact Department is different");


        DetailsText birthdate = new DetailsText(driver, "Birthdate");
        Assert.assertEquals(birthdate.getValueOfDetails(), listOfConstants.getBIRTHDATE(), "The Contact Birthdate  is different");
    }

    public DetailContactStep isPageLoaded() {
        detailContactPage = new DetailContactPage(driver);
        detailContactPage.waitPageLoaded();
        return this;
    }
    }

