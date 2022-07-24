package tests;

import org.testng.annotations.Test;
import pages.cb4.Cb4LoginPage;
import pages.cb4.Cb4MainPage;
import selenium_setup.SeleniumSetup;

public class testCB4 extends SeleniumSetup {

    @Test
    public void test01firstNavigation() {
        Cb4MainPage cb4MainPage = new Cb4MainPage(driver);
        String url = "http://www.cb4.com";
        cb4MainPage.navigate(url);
    }

    @Test
    public void test02watchADemo() {
        Cb4MainPage cb4MainPage = new Cb4MainPage(driver);
        cb4MainPage.clickWatchDemoButton();
    }

    @Test
    public void test03loginToPage() {
        Cb4LoginPage cb4LoginPage = new Cb4LoginPage(driver);
        cb4LoginPage.fillFormAndClickWatch("1", "2", "3");
    }
}
