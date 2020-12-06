package webler.szakdolgozat.honeyAndSalt.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage{

	public SearchPage (WebDriver driver) {
		super(driver);
	}
	
	private By searchIngredientsField = By.id("search_ingred");
	private By searchInstructionsAndName = By.id("search_details");
	private By detailsButton = By.id("details");
	private By searchIngredientsButton = By.id("searchbutton2");
	private By searchInstructionsAndNameButton = By.id("searchbutton1");
	private By allrecipeButton = By.id("listrecipes");
	
	public void typeIntoSearchInstructionsAndNameField(String keysToSend) throws InterruptedException {
		Thread.sleep(1000);
		waitAndType(searchInstructionsAndName, keysToSend);
	}
	
	public void typeIntoSearchIngrediensField(String keysToSend) throws InterruptedException {
		Thread.sleep(1000);
		waitAndType(searchIngredientsField, keysToSend);
	}
	
	public void clickOnSearchIngredientsButton() throws InterruptedException {
		Thread.sleep(1000);
		waitAndClick(searchIngredientsButton);
	}
	
	public void clickOnSearchInstructionsAndNameButton() throws InterruptedException {
		Thread.sleep(1000);
		waitAndClick(searchInstructionsAndNameButton);
	}
	
	public boolean assertSearchResults(String result) {
		By recipe = By.xpath("//h5[contains(text(), result)]");
		return elementIsVisible(recipe);
	}
	
	public void clickOnDetailsButton() throws InterruptedException {
		Thread.sleep(1000);
		waitAndClick(detailsButton);
	}
	
	public boolean assertSearchResultsByIngredients(String result) {
		By recipe = By.xpath("//p[contains(text(), result)]");
		return elementIsVisible(recipe);
	}
	
	public void clickOnAllRecipesButton() throws InterruptedException {
		Thread.sleep(1000);
		waitAndClick(allrecipeButton);
	}
}
