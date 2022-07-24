package pages.cb4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class Cb4MainPage extends BasePage {

    By watchDemoBtn = By.xpath("//body//div//a//span[text()='watch a demo']");
    public Cb4MainPage(WebDriver aDriver) {
        super(aDriver);
    }

    public void navigate(String url) {
        driver.get(url);
    }

    public void clickWatchDemoButton() {
        driver.findElement(watchDemoBtn).click();
    }
}
