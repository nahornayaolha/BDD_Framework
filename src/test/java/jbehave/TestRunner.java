package jbehave;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.BeforeStories;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import net.serenitybdd.jbehave.SerenityStories;
import utils.Driver;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;


public class TestRunner extends SerenityStories {


    private WebDriver driver;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    private String browser;

    @BeforeScenario
    public void setupDriver() {
        browser = System.getProperty("browser");
        System.out.println(getBrowser());
        switch (getBrowser().toLowerCase()) {
            case BrowserType.FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case BrowserType.CHROME:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case BrowserType.IE:
                WebDriverManager.iedriver().arch32().setup();
                driver = new InternetExplorerDriver();
                break;
            default:
                throw new RuntimeException("An incorrect browser configuration was provided " + getBrowser());
        }
        driver.manage().window().maximize();
        Driver.setDriver(driver);
    }

    @AfterScenario
    public void afterHook() {
        Driver.getDriver().quit();
    }
}
