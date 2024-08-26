package page.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.object.LoginPage;
import page.util.BaseTest;

public class ValidateUserCanLoginSuccessfully extends BaseTest {
    
    LoginPage loginPage;
    
    @Test(priority = 1)
    public void validateUserCanLoginSuccessfully() {
    	
        loginPage = new LoginPage(driver);
        loginPage.navigate("file:///C:/Users/kurtb/OneDrive/Desktop/Login.html");
    	
        loginPage.getUsername().sendKeys("admin");
        loginPage.getPassword().sendKeys("123456");
        loginPage.getLoginButton().click();
        
        assertEquals(loginPage.getSuccessModal().getText().equals("Login Success"), true);
    }
    

}