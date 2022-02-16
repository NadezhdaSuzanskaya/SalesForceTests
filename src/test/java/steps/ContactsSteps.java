package steps;

import components.ListOfConstants;
import components.forms.CreateAccountFormComponent;
import components.forms.Table;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import pages.AccountPage;
import pages.ContactPage;

public class ContactsSteps extends AbstractStep {

        private ContactPage contactPage;
        ListOfConstants listOfConstants= new ListOfConstants();
        private Table table;

    public ContactsSteps(WebDriver driver) {
            super(driver);
        }

    public void    createContact(){
        ContactPage contactPage = new ContactPage(driver);
        contactPage.openNewContactForm();
        CreateContactFormComponent form = new CreateContactFormComponent(driver);
        Assert.assertTrue(
                form.isComponentDisplayed(),
                form.getClass().getSimpleName().concat(" not displayed")
        );
    }
}
