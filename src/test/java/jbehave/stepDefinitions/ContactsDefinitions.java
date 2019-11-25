package jbehave.stepDefinitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import steps.ContactsSteps;

public class ContactsDefinitions {

    @Steps
    ContactsSteps contactsSteps;

    @When("set '$name' into the name field")
    public void setName(String name){
        contactsSteps.setName(name);
    }

    @When("set '$email' into the email field")
    public void setEmail(String email){
        contactsSteps.setEmail(email);
    }

    @When("set '$subject' into the subject field")
    public void setSubject(String subject){
        contactsSteps.setSubject(subject);
    }

    @When("set '$message' into the message textarea")
    public void setMessage(String message){
        contactsSteps.setMessage(message);
    }

    @When("I click on send button")
    public void sendMessage(){
        contactsSteps.sendMessage();
    }

    @Then("message with the following text appears: '$expectedMessage'")
    public void verifySuccessMessage(String expectedMessage) throws InterruptedException {
        Assert.assertEquals("Actual header does not equal expected", expectedMessage, contactsSteps.getSuccessMessage());
    }
}
