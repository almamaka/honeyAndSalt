package webler.szakdolgozat.honeyAndSalt;

import org.testng.annotations.Test;

public class UseCaseTest extends BaseTest {

	@Test
	public void mainPageTest() {
		loginpage.goTo();
		loginpage.signIn("almamaka", "11111111");
		welcomepage.clickOnLogoutButton();
		navpage.clickOnMainPageButton();
	}
	
	@Test
	public void registrationTest() throws InterruptedException {
		loginpage.goTo();
		loginpage.clickOnRegistrationButton();
		Thread.sleep(1000);
		registrationpage.typeIntoUsernameField("felhasználó2");
		//registrationpage.typeIntoEmailField("valaki@calami.hu");
		registrationpage.keysIntoEmailField();
		registrationpage.typeIntoPasswordField("12345678");
		registrationpage.typeIntoPasswordConfirmField("12345678");
		registrationpage.clickOnRegistrationButton();
		welcomepage.clickOnEnterRecipeBrowser();
		navpage.clickOnMainPageButton();
	}

}
