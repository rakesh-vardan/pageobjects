package hometask.pagefactory.tests;

import hometask.pages.AdminLoginPage;
import hometask.pages.AllPostsPage;
import org.testng.annotations.Test;

public class AllTests extends BaseTest {

    @Test(priority = 1)
    public void addANewPost() {
        AdminLoginPage loginPage = new AdminLoginPage(driver);
        AllPostsPage allPostsPage = loginPage.login();
        allPostsPage.createANewPost("New Post for checking all test cases", "The description about the test case is here");
    }

    @Test(priority = 2)
    public void editExistingPost() {
        AdminLoginPage loginPage = new AdminLoginPage(driver);
        AllPostsPage allPostsPage = loginPage.login();
        allPostsPage.editAPost("New Post for checking all test cases", "Updated Post for checking all test cases", "Updated description");
    }

    @Test(priority = 3)
    public void countNoOfPosts() {
        AdminLoginPage loginPage = new AdminLoginPage(driver);
        AllPostsPage allPostsPage = loginPage.login();
        System.out.println(allPostsPage.getAllPostsCount());
    }

    @Test(priority = 4)
    public void deleteExistingPost() {
        AdminLoginPage loginPage = new AdminLoginPage(driver);
        AllPostsPage allPostsPage = loginPage.login();
        allPostsPage.deleteAPost("Updated Post for checking all test cases");
    }

    @Test(priority = 5)
    public void countNoOfPostsAgain() {
        AdminLoginPage loginPage = new AdminLoginPage(driver);
        AllPostsPage allPostsPage = loginPage.login();
        System.out.println(allPostsPage.getAllPostsCount());
    }
}
