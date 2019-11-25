package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.ContactsPage;
import pages.LogInPage;
import utils.Driver;

public class LogInSteps {

    private WebDriver driver = Driver.getDriver();

    private LogInPage logInPage= PageFactory.initElements(driver, LogInPage.class);

    public void setUsername(String username){
        logInPage.getHide().click();
        logInPage.getUsernameInputField().sendKeys(username);
    }

    public void setPassword(String password){
        logInPage.getPasswordInputField().sendKeys(password);
    }

    public void clickOnLogIn(){
        logInPage.getLogInButton().click();
    }
}
