package hometask.pagefactory.tests;

import hometask.pages.AdminLoginPage;
import hometask.pages.AllPostsPage;
import org.testng.annotations.Test;

public class CountingPostsTest extends BaseTest {

    @Test
    public void countNoOfPosts() {
        AdminLoginPage loginPage = new AdminLoginPage(driver);
        AllPostsPage allPostsPage = loginPage.login();
        System.out.println(allPostsPage.getAllPostsCount());
    }
}
