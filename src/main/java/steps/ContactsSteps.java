package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.ContactsPage;
import pages.MainPage;
import utils.Driver;

public class ContactsSteps {

    private WebDriver driver = Driver.getDriver();

    private ContactsPage contactsPage= PageFactory.initElements(driver, ContactsPage.class);

    public void setName(String name){
        contactsPage.getNameInputField().sendKeys(name);
    }

    public void setEmail(String email){
        contactsPage.getEmailInputField().sendKeys(email);
    }

    public void setSubject(String subject){
        contactsPage.getSubjectInputField().sendKeys(subject);
    }

    public void setMessage(String message){
        contactsPage.getMessageInputField().sendKeys(message);
    }

    public void sendMessage(){
        contactsPage.getSendButton().click();
    }

    public String getSuccessMessage() throws InterruptedException {
        Thread.sleep(2000);
        return contactsPage.getSuccessMessage().getText();
    }
}
