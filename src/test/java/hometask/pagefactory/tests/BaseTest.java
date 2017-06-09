package hometask.pagefactory.tests;

import hometask.driver.BrowserDriver;
import hometask.driver.ChromeDriverCreator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowserDriver browser = new ChromeDriverCreator();
        driver = browser.getBrowserDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
