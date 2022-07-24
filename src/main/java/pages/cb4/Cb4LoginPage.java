package pages.cb4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BasePage;

public class Cb4LoginPage extends BasePage {
    public Cb4LoginPage(WebDriver aDriver) {
        super(aDriver);
    }

    public By firstNameEditText = By.id("form-field-firstname");
    public By lastNameEditText = By.id("form-field-lastname");
    public By emailAddressEditText = By.id("form-field-email");
    public By watchBtn = By.xpath("//div//button//span[text()='watch now']");

    public void fillFormAndClickWatch(String firstName, String lastName, String emailAddress) {
        driver.findElement(firstNameEditText).sendKeys(firstName);
        driver.findElement(lastNameEditText).sendKeys(lastName);
        driver.findElement(emailAddressEditText).sendKeys(emailAddress);
        driver.findElement(watchBtn).click();
        int size = driver.findElements(watchBtn).size();
        Assert.assertEquals(size, 0, "failed to move to next page");
    }

}
