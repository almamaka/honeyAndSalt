package webler.szakdolgozat.honeyAndSalt.testPages;

import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{

	public MainPage(WebDriver driver) {
		super(driver);
	}
	
	protected String url = baseUrl + "/mainpage";
	
	public MainPage goTo() {
		driver.get(url);
		return this;
	}
}
