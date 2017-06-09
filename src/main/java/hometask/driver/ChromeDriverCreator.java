package hometask.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverCreator extends BrowserDriver {

    public WebDriver getBrowserDriver() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver_v2.29.exe");
        return new ChromeDriver();
    }
}
