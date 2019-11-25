package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(xpath = "//h1/a")
    WebElement header;

    @FindBy(xpath = "//nav[@class='main-navigation']//ul/li[1]")
    WebElement mainPageTab;

    @FindBy(xpath = "//nav[@class='main-navigation']//ul/li[2]/a")
    WebElement aboutUsTabTab;

    @FindBy(xpath = "//nav[@class='main-navigation']//ul/li[3]/a")
    WebElement doctorsTab;

    @FindBy(xpath = "//nav[@class='main-navigation']//ul/li[4]/a")
    WebElement priciesTab;

    @FindBy(xpath = "//nav[@class='main-navigation']//ul/li[5]/a")
    WebElement contactsTab;

    @FindBy(xpath = "//nav[@class='main-navigation']//ul/li[6]/a")
    WebElement newsTab;

    @FindBy(xpath = "//nav[@class='main-navigation']//ul/li[7]/a")
    WebElement signInTab;

    public WebElement getOnlineCheckIn() {
        return onlineCheckIn;
    }

    @FindBy(xpath = "//nav[@class='main-navigation']//ul/li[8]/a")
    WebElement onlineCheckIn;

    public WebElement getHeader() {
        return header;
    }


    public WebElement getMainPageTab() {
        return mainPageTab;
    }

    public WebElement getAboutUsTabTab() {
        return aboutUsTabTab;
    }

    public WebElement getDoctorsTab() {
        return doctorsTab;
    }

    public WebElement getPriciesTab() {
        return priciesTab;
    }

    public WebElement getContactsTab() {
        return contactsTab;
    }

    public WebElement getNewsTab() {
        return newsTab;
    }

    public WebElement getSignInTab() {
        return signInTab;
    }

}
