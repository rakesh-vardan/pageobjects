package hometask.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage {

    private final String adminLoginUrl = "https://automatetheworldblog.wordpress.com/wp-admin/";
    private WebDriver driver;

    @FindBy(id = "user_login")
    WebElement email;

    @FindBy(id = "user_pass")
    WebElement password;

    @FindBy(id = "wp-submit")
    WebElement submit;

    public AdminLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.get(adminLoginUrl);
    }

    public AllPostsPage login() {
        email.sendKeys("automatetheworldblog");
        password.sendKeys("Passw0rd");
        submit.click();
        return new AllPostsPage(driver);
    }

}
