package selenium_setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class SeleniumSetup {
    public static WebDriver driver = null;


    @BeforeSuite
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }



    @AfterSuite
    public void tearDown() {
        try {
            driver.close();
        } catch (Exception e) {
        }
    }
}
