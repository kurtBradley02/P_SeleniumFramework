package page.test.chaos;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.object.LoginPage;
import page.util.BaseTest;

public class ValidateUserCantLoginInvalidUsername extends BaseTest {
    
    LoginPage loginPage;
    
    @BeforeMethod
    public void navigateToLoginPage() {
    	
        loginPage = new LoginPage(driver);
        loginPage.navigate("file:///C:/Users/kurtb/OneDrive/Desktop/Login.html");
    }
    
    
    @Test(priority = 1)
    public void validateUserCanLoginSuccessfully() {
        loginPage.getUsername().sendKeys("user");
        loginPage.getPassword().sendKeys("123456");
        loginPage.getLoginButton().click();
    }
    
    @AfterMethod
    public void closeBrowser() {
        assertEquals(loginPage.getFailModal().getText().equals("Login Faila"), true);
    }

}