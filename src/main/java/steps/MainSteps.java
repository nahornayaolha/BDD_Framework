package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;
import utils.Driver;

public class MainSteps {

    private WebDriver driver = Driver.getDriver();

    private MainPage mainPage = PageFactory.initElements(driver, MainPage.class);

    public void openUrl(String url) {
        driver.get(url);
    }

    public void openContactsPage() {
        mainPage.getContactsTab().click();
    }

    public void openLogInPage() {

        mainPage.getSignInTab().click();
    }

    public String checkHeader() {
        return mainPage.getHeader().getText();

    }

    public boolean checkMainTab() {
        if (mainPage.getMainPageTab().isDisplayed()) {
            return true;
        } else
            return false;
    }

    public boolean checkAboutUsTab() {
        if (mainPage.getAboutUsTabTab().isDisplayed()) {
            return true;
        } else
            return false;
    }

    public boolean checkDoctorsTab() {
        if (mainPage.getDoctorsTab().isDisplayed()) {
            return true;
        } else
            return false;
    }

    public boolean checkPriciesTab() {
        if (mainPage.getPriciesTab().isDisplayed()) {
            return true;
        } else
            return false;
    }

    public boolean checkContactsTab() {
        if (mainPage.getContactsTab().isDisplayed()) {
            return true;
        } else
            return false;
    }

    public boolean checkNewsTab() {
        if (mainPage.getNewsTab().isDisplayed()) {
            return true;
        } else
            return false;
    }

    public boolean checkSignInTab() {
        if (mainPage.getSignInTab().isDisplayed()) {
            return true;
        } else
            return false;
    }

    public boolean checkOnlineCheckInTab() {
        if (mainPage.getOnlineCheckIn().isDisplayed()) {
            return true;
        } else
            return false;
    }
}
