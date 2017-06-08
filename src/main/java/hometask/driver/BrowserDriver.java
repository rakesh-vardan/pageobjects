package hometask.driver;

import org.openqa.selenium.WebDriver;

public abstract class BrowserDriver {

    protected WebDriver driver;

    public abstract WebDriver getBrowserDriver();
}
