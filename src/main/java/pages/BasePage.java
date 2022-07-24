package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver aDriver) {
        this.driver = aDriver;
    }

    public void click(By by) {
        driver.findElement(by).click();
    }

    public String getText(By by) { return driver.findElement(by).getText(); }
}
