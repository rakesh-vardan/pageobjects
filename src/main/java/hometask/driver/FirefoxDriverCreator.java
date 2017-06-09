package hometask.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverCreator extends BrowserDriver{
    public WebDriver getBrowserDriver() {

        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver_v0.16.1.exe");
        return new FirefoxDriver();
    }
}
