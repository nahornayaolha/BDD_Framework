package jbehave.stepDefinitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;
import steps.LogInSteps;

public class LogInDefinitions {

    @Steps
    LogInSteps logInSteps;

    @When("set '$username' into the username/email field")
    public void setUsername(String username) throws InterruptedException {
        Thread.sleep(3000);
        logInSteps.setUsername(username);
    }

    @When("set '$username' into the password field")
    public void setPassword(String password){
        logInSteps.setPassword(password);
    }

    @When("I click on log in button")
    public void logIn(){
        logInSteps.clickOnLogIn();
    }
}
