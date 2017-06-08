package hometask.pagefactory.tests;

import hometask.driver.BrowserDriver;
import hometask.driver.ChromeDriverCreator;
import hometask.driver.FirefoxDriverCreator;
import hometask.driver.InternetExplorerDriverCreator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowserDriver browser = new ChromeDriverCreator();
        driver = browser.getBrowserDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
