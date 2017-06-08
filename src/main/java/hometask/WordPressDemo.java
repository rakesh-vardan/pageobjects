package hometask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.util.List;

public class WordPressDemo {

    WebDriver driver = null;

    @BeforeClass
    public void loginToApp(){
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver_v2.29.exe");
        driver = new ChromeDriver();
        driver.get("https://automatetheworldblog.wordpress.com/wp-admin/");
        WebElement email = driver.findElement(By.id("user_login"));
        WebElement pwd = driver.findElement(By.id("user_pass"));
        WebElement submit = driver.findElement(By.id("wp-submit"));
        email.sendKeys("automatetheworldblog");
        pwd.sendKeys("Passw0rd");
        submit.click();
    }

    @BeforeMethod
    public void openEditPageForEachTest(){
        driver.get("https://automatetheworldblog.wordpress.com/wp-admin/edit.php");
    }

    @Test
    public void createNewPost() {
        WebElement addNewPost = driver.findElement(By.linkText("Add New"));
        addNewPost.click();
        driver.switchTo().frame("content_ifr");
        WebElement postBody = driver.findElement(By.id("tinymce"));
        postBody.sendKeys("This is description");
        driver.switchTo().defaultContent();
        WebElement title = driver.findElement(By.id("title"));
        title.click();
        title.sendKeys("My First Post");
        WebElement publish = driver.findElement(By.id("publish"));
        publish.click();
    }

    @Test(dependsOnMethods = {"createNewPost"})
    public void DeletePost(){
        WebElement post = driver.findElement(By.linkText("My First Post"));
        Actions builder = new Actions(driver);
        builder.moveToElement(post).build().perform();
        WebElement trash = driver.findElement(By.xpath("//div[@class='row-actions']//span[@class='trash']/a[@aria-label='Move “My First Post” to the Trash']"));
        trash.click();
    }

    @Test(dependsOnMethods = {"createNewPost"})
    public void countPosts(){
        WebElement postsContainer = driver.findElement(By.id("the-list"));
        List postsList = postsContainer.findElements(By.tagName("tr"));
        System.out.println(postsList.size());
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
