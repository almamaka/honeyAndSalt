package webler.szakdolgozat.honeyAndSalt.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	String baseUrl = "http://localhost:8080";
	
	WebDriver driver;
	
	public BasePage (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement find(By selector) {
		return driver.findElement(selector);
	}
	
	String getElementText(By selector) {
		return find(selector).getText();
	}
	
	void type(By selector, String keysToSend) {
		find(selector).sendKeys(keysToSend);
	}
	
	void click(By selector) {
		find(selector).click();
	}
	
	void clear(By selector) {
		find(selector).clear();
	}

	WebElement waitFindElement(By selector) {
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		return wait.until(x -> x.findElement(selector));
	}
	
	public void waitAndClick(By selector) {
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.elementToBeClickable(selector));
		click(selector);
	}
	

	public void waitAndType(By selector, String keysToSend) {
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.elementToBeClickable(selector));
		clear(selector);
		type(selector, keysToSend);
	}
	
	WebElement waitForPresenceOfElement(By selector) {
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		return wait.until(ExpectedConditions.presenceOfElementLocated(selector));
	}

	WebElement waitForElementToBeClickable(By selector) {
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		return wait.until(ExpectedConditions.elementToBeClickable(selector));
	}
	
	public void deleteTextFromInputField(By selector) {
		WebElement textfield = waitForElementToBeClickable(selector);
		textfield.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
	}
}
