package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage {

    public WebElement getNameInputField() {
        return nameInputField;
    }

    public WebElement getEmailInputField() {
        return emailInputField;
    }

    public WebElement getSubjectInputField() {
        return subjectInputField;
    }

    public WebElement getMessageInputField() {
        return messageInputField;
    }

    @FindBy(xpath = "//input[@name='your-name']")
    WebElement nameInputField;

    @FindBy(xpath = "//input[@name='your-email']")
    WebElement emailInputField;

    @FindBy(xpath = "//input[@name='your-subject']")
    WebElement subjectInputField;

    @FindBy(xpath = "//textarea[@name='your-message']")
    WebElement messageInputField;

    public WebElement getSendButton() {
        return sendButton;
    }

    @FindBy(xpath = "//input[@value='Відправити']")
    WebElement sendButton;

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    @FindBy(xpath = "//form/div[contains(text(),'Дякуємо')]")
    WebElement successMessage;
}
