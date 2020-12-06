package webler.szakdolgozat.honeyAndSalt.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavPage extends BasePage {
	
	public NavPage (WebDriver driver) {
		super(driver);
	}
	
	private By mainpageButton = By.id("mainpage");
	
	public void clickOnMainPageButton() {
		waitAndClick(mainpageButton);
	}
}
