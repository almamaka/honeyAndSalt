package webler.szakdolgozat.honeyAndSalt.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavPage extends BasePage {
	
	public NavPage (WebDriver driver) {
		super(driver);
	}
	
	private By mainpageButton = By.id("mainpage");
	private By recipesearchButton = By.id("searchpage");
	private By favouritesButton = By.id("favouritespage");
	private By navbarDropdown = By.id("navbarDropdown");
	private By userdataButton = By.id("userdatapage");
	private By logoutButton = By.id("lougoutbutton");
	
	public void clickOnMainPageButton() throws InterruptedException {
		Thread.sleep(1000);
		waitAndClick(mainpageButton);
	}
	
	public void clickOnRecipeSearchButton() throws InterruptedException {
		Thread.sleep(1000);
		waitAndClick(recipesearchButton);
	}
	
	public void clickOnFavouritesButton() throws InterruptedException {
		Thread.sleep(1000);
		waitAndClick(favouritesButton);
	}
	
	public void clickOnUserdataButton() throws InterruptedException {
		Thread.sleep(1000);
		waitAndClick(navbarDropdown);
		Thread.sleep(1000);
		waitAndClick(userdataButton);
	}
	
	public void clickOnLogoutButton() throws InterruptedException {
		Thread.sleep(1000);
		waitAndClick(navbarDropdown);
		Thread.sleep(1000);
		waitAndClick(logoutButton);
	}
	
	public boolean assertTextIsvisibleOnPage(String text) {
		By title = By.xpath("//h2[contains(text(), text)]");
		return elementIsVisible(title);
	}
}
