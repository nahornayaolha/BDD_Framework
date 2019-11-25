package jbehave.stepDefinitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import steps.MainSteps;

public class MainDefinitions {

    @Steps
    MainSteps mainSteps;

    @Given("I navigated to the base page via url = '$URL'")
    public void navigateToTheBasePage(String URL){
        mainSteps.openUrl(URL);
    }

    @When("I navigated to the 'Contacts' page")
    public void navigateToTheContactsPage(){
        mainSteps.openContactsPage();
    }

    @When("I navigated to the 'Log In' page")
    public void navigateToTheLogInPage(){
        mainSteps.openLogInPage();
    }

    @Then("Actual header is '$aexpectedHeader'")
    public void assertHeader(String expectedHeader){
        Assert.assertEquals("Actual header does not equal expected", expectedHeader, mainSteps.checkHeader());
    }

    @Then("navigation panel contains 'Main page' tab")
    public void checkMainTab(){
        Assert.assertTrue("This tab is not displayed", mainSteps.checkMainTab());
    }

    @Then("navigation panel contains 'About Us' tab")
    public void checkAboutUsTab(){
        Assert.assertTrue("This tab is not displayed", mainSteps.checkAboutUsTab());
    }

    @Then("navigation panel contains 'Doctors' tab")
    public void checkDoctorsTab(){
        Assert.assertTrue("This tab is not displayed", mainSteps.checkDoctorsTab());
    }

    @Then("navigation panel contains 'Pricies' tab")
    public void checkPriciesTab(){
        Assert.assertTrue("This tab is not displayed", mainSteps.checkPriciesTab());
    }

    @Then("navigation panel contains 'Contacts' tab")
    public void checkContactsTab(){
        Assert.assertTrue("This tab is not displayed", mainSteps.checkContactsTab());
    }

    @Then("navigation panel contains 'News' tab")
    public void checkNewsTab(){
        Assert.assertTrue("This tab is not displayed", mainSteps.checkNewsTab());
    }

    @Then("navigation panel contains 'Sign In' tab")
    public void checkSignInTab(){
        Assert.assertTrue("This tab is not displayed", mainSteps.checkSignInTab());
    }

    @Then("navigation panel contains 'Check In' tab")
    public void checkOnlineCheckInTab(){
        Assert.assertTrue("This tab is not displayed", mainSteps.checkOnlineCheckInTab());
    }
}
