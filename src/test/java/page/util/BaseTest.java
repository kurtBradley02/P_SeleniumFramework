package page.util;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;

	@BeforeTest
	public void f() {
		
    	WebDriverManager.chromedriver().driverVersion("127.0.6533.120").setup();
		driver = new ChromeDriver();
	}

	@AfterTest
	public void test() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
