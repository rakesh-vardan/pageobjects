package hometask.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class DeletePostPage {

    private WebDriver driver;

    @FindBy(linkText = "Move to Trash")
    WebElement moveToTrash;

    public DeletePostPage(WebDriver driver) {
        this.driver = driver;
        System.out.println(driver.getCurrentUrl());
    }

    public void delete() {
        moveToTrash.click();
    }
}
