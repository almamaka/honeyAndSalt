package webler.szakdolgozat.honeyAndSalt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import webler.szakdolgozat.honeyAndSalt.testPages.ListRecipePage;
import webler.szakdolgozat.honeyAndSalt.testPages.LoginPage;
import webler.szakdolgozat.honeyAndSalt.testPages.MainPage;
import webler.szakdolgozat.honeyAndSalt.testPages.NavPage;
import webler.szakdolgozat.honeyAndSalt.testPages.RegistrationPage;
import webler.szakdolgozat.honeyAndSalt.testPages.SearchPage;
import webler.szakdolgozat.honeyAndSalt.testPages.WelcomePage;

public class BaseTest {

	WebDriver driver;
	public LoginPage loginpage;
	public WelcomePage welcomepage;
	public NavPage navpage;
	public RegistrationPage registrationpage;
	public MainPage mainpage;
	public SearchPage searchpage;
	public ListRecipePage listrecipepage;
	
	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Alma\\Java\\szakdolgozat\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		loginpage = new LoginPage(driver);
		welcomepage = new WelcomePage(driver);
		navpage = new NavPage(driver);
		registrationpage = new RegistrationPage(driver);
		mainpage = new MainPage(driver);
		searchpage = new SearchPage(driver);
		listrecipepage = new ListRecipePage(driver);
		
		driver.manage().window().maximize();
	}
	
	
	
//	@AfterMethod(alwaysRun = true)
//	protected void tearDown() {
//		driver.close();
//	}
}
