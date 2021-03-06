package webler.szakdolgozat.honeyAndSalt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UseCaseTest extends BaseTest {

	@Test
	public void tryEveryNavigationElement() throws InterruptedException {
		loginpage.goTo();
		loginpage.signIn("almamaka", "11111111");
		Assert.assertTrue(welcomepage.assertWelcomeTextIsDisplayed());
		if (welcomepage.assertWelcomeTextIsDisplayed() == true) {
			System.out.println("Sikeres assert");
		} else {
			System.out.println("Sikertelen assert");
		}
		mainpage.goTo();
		navpage.clickOnRecipeSearchButton();
		Assert.assertTrue(navpage.assertTextIsvisibleOnPage("Receptböngésző"));
		if (navpage.assertTextIsvisibleOnPage("Receptböngésző") == true) {
			System.out.println("Sikeres assert");
		} else {
			System.out.println("Sikertelen assert");
		}
		
		navpage.clickOnFavouritesButton();
		Assert.assertTrue(navpage.assertTextIsvisibleOnPage("Kedvenc receptjeim"));
		if (navpage.assertTextIsvisibleOnPage("Kedvenc receptjeim") == true) {
			System.out.println("Sikeres assert");
		} else {
			System.out.println("Sikertelen assert");
		}
		navpage.clickOnUserdataButton();
		Assert.assertTrue(navpage.assertTextIsvisibleOnPage("Felhasználói adatok"));
		if (navpage.assertTextIsvisibleOnPage("Felhasználói adatok") == true) {
			System.out.println("Sikeres assert");
		} else {
			System.out.println("Sikertelen assert");
		}
		navpage.clickOnMainPageButton();
		navpage.clickOnLogoutButton();
		Assert.assertTrue(loginpage.assertLogoutSuccesTextIsVisible());
		if (loginpage.assertLogoutSuccesTextIsVisible() == true) {
			System.out.println("Sikeres assert");
		} else {
			System.out.println("Sikertelen assert");
		}
		
	}
	
	@Test
	public void registrationTest() throws InterruptedException {
		loginpage.goTo();
		loginpage.clickOnRegistrationButton();
		Thread.sleep(1000);
		registrationpage.typeIntoUsernameField("felhasználó1");
		registrationpage.keysIntoEmailField("valami@valami.hu");
		registrationpage.typeIntoPasswordField("12345678");
		registrationpage.typeIntoPasswordConfirmField("12345678");
		registrationpage.clickOnRegistrationButton();
		Assert.assertTrue(welcomepage.assertWelcomeTextIsDisplayed());
		if (welcomepage.assertWelcomeTextIsDisplayed() == true) {
			System.out.println("Sikeres assert");
		} else {
			System.out.println("Sikertelen assert");
		}
		welcomepage.clickOnEnterRecipeBrowser();
		navpage.clickOnLogoutButton();
		Assert.assertTrue(loginpage.assertLogoutSuccesTextIsVisible());
		if (loginpage.assertLogoutSuccesTextIsVisible() == true) {
			System.out.println("Sikeres assert");
		} else {
			System.out.println("Sikertelen assert");
		}
	}
	
	@Test
	public void favouriteTest() throws InterruptedException {
		loginpage.goTo();
		loginpage.signIn("almamaka", "11111111");
		mainpage.goTo();
		navpage.clickOnRecipeSearchButton();
		searchpage.clickOnAllRecipesButton();
		listrecipepage.clickOnLikeButton();
		navpage.clickOnFavouritesButton();
		Assert.assertTrue(listrecipepage.assertFavourites("Rakott tócsni liszt nélkül"));
		if (listrecipepage.assertFavourites("Rakott tócsni liszt nélkül") == true) {
			System.out.println("Sikeres assert");
		} else {
			System.out.println("Sikertelen assert");
		}
		searchpage.clickOnDetailsButton();
		listrecipepage.clickOnUnlikeButton();
		navpage.clickOnLogoutButton();
		Assert.assertTrue(loginpage.assertLogoutSuccesTextIsVisible());
		if (loginpage.assertLogoutSuccesTextIsVisible() == true) {
			System.out.println("Sikeres assert");
		} else {
			System.out.println("Sikertelen assert");
		}
	}
	
	@Test
	public void editRecipeTestAdmin() throws InterruptedException {
		loginpage.goTo();
		loginpage.signIn("almamaka", "11111111");
		mainpage.goTo();
		navpage.clickOnRecipeSearchButton();
		searchpage.clickOnAllRecipesButton();
		listrecipepage.clickOnModifyButton();
		listrecipepage.typeIntoPrepTimeField("25");
		listrecipepage.clickOnModifySaveButton();
		Assert.assertTrue(navpage.assertTextIsvisibleOnPage("Recept listázó"));
		if (navpage.assertTextIsvisibleOnPage("Recept listázó") == true) {
			System.out.println("Sikeres assert");
		} else {
			System.out.println("Sikertelen assert");
		}
		navpage.clickOnLogoutButton();
		Assert.assertTrue(loginpage.assertLogoutSuccesTextIsVisible());
		if (loginpage.assertLogoutSuccesTextIsVisible() == true) {
			System.out.println("Sikeres assert");
		} else {
			System.out.println("Sikertelen assert");
		}
	}
	
	@Test
	public void searchTest() throws InterruptedException {
		loginpage.goTo();
		loginpage.signIn("almamaka", "11111111");
		mainpage.goTo();
		navpage.clickOnRecipeSearchButton();
		searchpage.typeIntoSearchInstructionsAndNameField("fokhagymakrém");
		searchpage.clickOnSearchInstructionsAndNameButton();
		Assert.assertTrue(searchpage.assertSearchResults("Fokhagymakrém leves"));
		if (searchpage.assertSearchResults("Fokhagymakrém leves") == true) {
			System.out.println("Sikeres assert");
		} else {
			System.out.println("Sikertelen assert");
		}
		searchpage.assertSearchResultsByIngredients("liszt");
		searchpage.clickOnSearchIngredientsButton();
		Assert.assertTrue(searchpage.assertSearchResultsByIngredients("Olasz pizzatészta"));
		if (searchpage.assertSearchResultsByIngredients("Olasz pizzatészta") == true) {
			System.out.println("Sikeres assert");
		} else {
			System.out.println("Sikertelen assert");
		}
		searchpage.typeIntoSearchInstructionsAndNameField("liszt");
		searchpage.clickOnSearchInstructionsAndNameButton();
		searchpage.clickOnDetailsButton();
		navpage.clickOnLogoutButton();
		Assert.assertTrue(loginpage.assertLogoutSuccesTextIsVisible());
		if (loginpage.assertLogoutSuccesTextIsVisible() == true) {
			System.out.println("Sikeres assert");
		} else {
			System.out.println("Sikertelen assert");
		}
	}

}
