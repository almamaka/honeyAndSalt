package webler.szakdolgozat.honeyAndSalt.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;


public class RegistrationPage extends BasePage{

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	Actions action = new Actions(driver);
	
	private By usernameField = By.id("username");
	private By passwordField = By.id("password");
	private By emailField = By.id("email");
	private By passwordConfirmField = By.id("passwordConfirm");
	private By registrationButton = By.id("btn");
	
	public void typeIntoUsernameField(String keystosend) {
		waitAndType(usernameField, keystosend);
	}
	
	public void keySpecialCharacterEmail(By selector) {
		action.keyDown(Keys.CONTROL).keyDown(Keys.ALT).sendKeys("v").keyUp(Keys.ALT).keyUp(Keys.CONTROL).build().perform();
	}
	
	public void typeIntoEmailField(String keystosend) {
		waitAndType(emailField, keystosend.toString());
		
		
	}
	
	public void keysIntoEmailField() {
		waitAndClick(emailField);
		action.sendKeys("valami").keyDown(Keys.ALT).sendKeys("v").keyUp(Keys.ALT).sendKeys("valaki.hu").build().perform();
	}
	
	public void typeIntoPasswordField(String keystosend) {
		waitAndType(passwordField, keystosend);
	}
	
	public void typeIntoPasswordConfirmField(String keystosend) {
		waitAndType(passwordConfirmField, keystosend);
	}
	
	public void clickOnRegistrationButton() {
		waitFindElement(registrationButton);
		click(registrationButton);
	}

}
