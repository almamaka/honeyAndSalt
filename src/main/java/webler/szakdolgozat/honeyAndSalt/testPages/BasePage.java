package webler.szakdolgozat.honeyAndSalt.testPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
//	WebElement waitFindElement(By selector) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		return wait.until(x -> x.findElement(selector));
//	}
}
