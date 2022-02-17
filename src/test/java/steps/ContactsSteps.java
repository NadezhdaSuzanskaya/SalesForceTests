package steps;

import components.ListOfConstants;
import components.forms.CreateFormComponent;
import components.forms.Dropdown;
import components.forms.Input;
import components.forms.Table;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import pages.ContactPage;

public class ContactsSteps extends AbstractStep {

        private ContactPage contactPage;
        ListOfConstants listOfConstants= new ListOfConstants();
        private Table table;

    public ContactsSteps(WebDriver driver) {
            super(driver);
        }

    public DetailContactStep    createContact(){
        ContactPage contactPage = new ContactPage(driver);
        contactPage.openNewContactForm();
        CreateFormComponent form = new CreateFormComponent(driver, "New Contact");
        Assert.assertTrue(
                form.isComponentDisplayed(),
                form.getClass().getSimpleName().concat(" not displayed")
        );

        new Input(driver, "Phone").insertContactGrigInput(listOfConstants.getCONTACT_PHONE());
        new Input(driver, "Mobile").insertContactGrigInput(listOfConstants.getCONTACT_MOBILE());
        new Input(driver, "Email").insertContactGrigInput(listOfConstants.getCONTACT_EMAIL());
        new Input(driver, "Title").insertContactGrigInput(listOfConstants.getCONTACT_TITLE());
        new Input(driver, "Fax").insertContactGrigInput(listOfConstants.getCONTACT_FAX());
        new Input(driver, "Department").insertContactGrigInput(listOfConstants.getCONTACT_DEPARTMENT());

        new Input(driver, "First Name").insertContactFormInput(listOfConstants.getFIRST_NAME());
        new Input(driver, "Last Name").insertContactFormInput(listOfConstants.getLAST_NAME());
        new Input(driver, "Account Name").selectOption(listOfConstants.getACCOUNT_NAME());
        new Input(driver, "Birthdate").insertContactGrigInput(listOfConstants.getBIRTHDATE());
        form.saveContact();
        return new DetailContactStep(driver);
    }
}
