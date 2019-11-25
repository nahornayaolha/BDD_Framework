package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {

    @FindBy(xpath = "//input[@id='user_login1']")
    WebElement usernameInputField;

    @FindBy(xpath = "//input[@id='user_pass1']")
    WebElement passwordInputField;

    public WebElement getUsernameInputField() {
        return usernameInputField;
    }

    public WebElement getPasswordInputField() {
        return passwordInputField;
    }

    public WebElement getLogInButton() {
        return logInButton;
    }

    @FindBy(xpath = "//input[@id='wp-submit1']")
    WebElement logInButton;

    public WebElement getHide() {
        return hide;
    }

    @FindBy(xpath = "//html/body/div[1]/div/a/following-sibling::div")
    WebElement hide;
}
