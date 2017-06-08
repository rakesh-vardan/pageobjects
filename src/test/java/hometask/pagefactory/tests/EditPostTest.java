package hometask.pagefactory.tests;

import hometask.pages.AdminLoginPage;
import hometask.pages.AllPostsPage;
import org.testng.annotations.Test;

public class EditPostTest extends BaseTest {

    @Test
    public void editExistingPost() {
        AdminLoginPage loginPage = new AdminLoginPage(driver);
        AllPostsPage allPostsPage = loginPage.login();
        allPostsPage.editAPost("Creating New Post using PageObjects with Pagefactory", "Editing Post using PageObjects", "Test framework low maintenance");
    }
}
