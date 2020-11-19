package webler.szakdolgozat.honeyAndSalt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Alma\\Java\\szakdolgozat\\chromedriver_win32");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
	
	
	@AfterMethod(alwaysRun = true)
	protected void tearDown() {
		driver.close();
	}
}
