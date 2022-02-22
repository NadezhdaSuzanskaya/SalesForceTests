package steps;

import components.constants.ListOfConstants_del;
import components.forms.*;
import components.model.ContactModel;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import pages.ContactPage;

public class ContactsSteps extends AbstractStep {

    ListOfConstants_del listOfConstants = new ListOfConstants_del();
    private ContactPage contactPage;

    public ContactsSteps(WebDriver driver) {
        super(driver);
    }

    /*   public DetailContactStep createContact1() {
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
       }*/
    @Step("new contact is created")
    public ContactsSteps createContact(ContactModel contactModel) {
        contactPage = new ContactPage(driver);
        contactPage.openNewContactForm();
        CreateFormComponent form = new CreateFormComponent(driver, "New Contact");
        Assert.assertTrue(
                form.isComponentDisplayed(),
                form.getClass().getSimpleName().concat(" not displayed")
        );
        enterDataInContactForm(contactModel);
        form.saveContact();
        //    validatePageIsLoaded(accountPage);
        return this;
    }


    private void enterDataInContactForm(ContactModel contactModel) {
        new Input(driver, "Account Name").selectOption(contactModel.getACCOUNT_NAME());
        new Input(driver, "Phone").insertContactGrigInput(contactModel.getCONTACT_PHONE());
        new Input(driver, "Mobile").insertContactGrigInput(contactModel.getCONTACT_MOBILE());
        new Input(driver, "Email").insertContactGrigInput(contactModel.getCONTACT_EMAIL());
        new Input(driver, "Title").insertContactGrigInput(contactModel.getCONTACT_TITLE());
        new Input(driver, "Fax").insertContactGrigInput(contactModel.getCONTACT_FAX());
        new Input(driver, "Department").insertContactGrigInput(contactModel.getCONTACT_DEPARTMENT());
        new Input(driver, "First Name").insertContactFormInput(contactModel.getFIRST_NAME());
        new Input(driver, "Last Name").insertContactFormInput(contactModel.getLAST_NAME());
        new Input(driver, "Birthdate").insertContactGrigInput(contactModel.getBIRTHDATE());

    }
}
