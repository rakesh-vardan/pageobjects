package hometask.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerDriverCreator extends BrowserDriver {
    public WebDriver getBrowserDriver() {

        System.setProperty("webdriver.ie.driver", "./src/main/resources/IEDriverServer_v3.4.0.exe");
        return new InternetExplorerDriver();
    }
}
