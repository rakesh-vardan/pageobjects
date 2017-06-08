package hometask.pagefactory.tests;

import hometask.driver.BrowserDriver;
import hometask.driver.ChromeDriverCreator;
import hometask.driver.FirefoxDriverCreator;
import hometask.driver.InternetExplorerDriverCreator;
import hometask.pages.AdminLoginPage;
import hometask.pages.AllPostsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AddNewPostTest extends BaseTest{

    @Test
    public void addANewPost() {

        AdminLoginPage loginPage = new AdminLoginPage(driver);
        AllPostsPage allPostsPage = loginPage.login();
        allPostsPage.createANewPost("Creating New Post using PageObjects with Pagefactory", "Its good to use PageObjects and factory");
    }
}
