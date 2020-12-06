package webler.szakdolgozat.honeyAndSalt.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListRecipePage extends BasePage {

	public ListRecipePage (WebDriver driver) {
		super(driver);
	}
	
	private By modifyButton = By.xpath("//a[@href = '/edit/1']");
	private By deleteButton = By.xpath("//a[@href = '/delete/1']");
	private By likeButton = By.xpath("//a[@href = '/like/1']");
	private By unlikeButton = By.xpath("//a[@href = '/unlike/1']");
	
	private By preptimeField = By.name("prepTime");
	
	private By modifySaveButton = By.id("modifysave");
	
	public void clickOnModifyButton() throws InterruptedException {
		Thread.sleep(1000);
		waitAndClick(modifyButton);
	}
	
	public void clickOnDeleteButton() throws InterruptedException {
		Thread.sleep(1000);
		waitAndClick(deleteButton);
	}
	
	public void clickOnLikeButton() throws InterruptedException {
		Thread.sleep(1000);
		waitAndClick(likeButton);
	}
	
	public void clickOnUnlikeButton() throws InterruptedException {
		Thread.sleep(1000);
		waitAndClick(unlikeButton);
	}
	
	public boolean assertFavourites(String favourite) {
		By recipe = By.xpath("//h5[contains(text(), favourite)]");
		return elementIsVisible(recipe);
	}
	
	public void typeIntoPrepTimeField(String keystosend) throws InterruptedException {
		Thread.sleep(1000);
		waitAndType(preptimeField, keystosend);
	}
	
	public void clickOnModifySaveButton() throws InterruptedException {
		Thread.sleep(1000);
		waitAndClick(modifySaveButton);
	}

}
