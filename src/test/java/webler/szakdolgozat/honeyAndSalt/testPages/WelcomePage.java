package webler.szakdolgozat.honeyAndSalt.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePage{

	protected String url = baseUrl + "/welcome";
	
	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	
	private By welcomeEnterButton = By.id("welcome_go");
	private By welcomeLogoutButton = By.id("welcome_logout");
	
	By enterButton = By.xpath("//div/c:if/h4/a[@id='welcome_go']");
	
	public void clickOnEnterRecipeBrowser() {
		waitFindElement(welcomeEnterButton);
		waitAndClick(welcomeEnterButton);
	}
	
	public void clickOnLogoutButton() {
		waitAndClick(welcomeLogoutButton);
	}
}
