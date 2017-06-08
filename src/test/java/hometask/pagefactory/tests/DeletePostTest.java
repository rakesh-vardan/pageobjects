package hometask.pagefactory.tests;

import hometask.pages.AdminLoginPage;
import hometask.pages.AllPostsPage;
import org.testng.annotations.Test;

public class DeletePostTest extends BaseTest {

    @Test
    public void deleteExistingPost() {
        AdminLoginPage loginPage = new AdminLoginPage(driver);
        AllPostsPage allPostsPage = loginPage.login();
        allPostsPage.deleteAPost("Updating the New Post for checking all test cases");
    }
}

