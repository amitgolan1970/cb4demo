import org.testng.Assert;
import org.testng.annotations.Test;
import pages.lambdatest.LoginPage;
import pages.lambdatest.RegisterPage;

public class FirstSeleniumTest extends SeleniumSetup {

    @Test
    public void firstTestCase() {
        RegisterPage registerPage = new RegisterPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        registerPage.clickSignInAndRegister();
        String text = loginPage.readLoginBtnTitle();
        Assert.assertEquals(text,"LOGIN", "failed to verify login page");
    }

    @Test
    public void secondTestCase() {
        RegisterPage registerPage = new RegisterPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        registerPage.navigate();
        registerPage.click(registerPage.signInBtn);
        String text = loginPage.getText(loginPage.loginBtn);
        Assert.assertEquals(text,"LOGIN", "failed to verify login page");
    }

}
