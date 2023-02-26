package swagLabTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import swagLab.Pages.SwagLabCartPage;
import swagLab.Pages.SwagLabCheckoutPage;
import swagLab.Pages.SwagLabHomePage;
import swagLab.Pages.SwagLabLoginPage;
import utility.SeleniumUtility;

public class SwagLabTestCase extends SeleniumUtility {
	WebDriver driver;
	SwagLabLoginPage swlLogin;
	SwagLabHomePage swlHome;
	SwagLabCartPage swlCart;
	SwagLabCheckoutPage swlCheckout;

	@BeforeTest//browser launch and page factory setup for POM(Page Object Model)
	public void launchBrowserAndApplication() throws InterruptedException {
		driver = setUp("chrome", "https://www.saucedemo.com/");
		swlLogin = new SwagLabLoginPage(driver); // make sure driver is already initialized
		swlHome = PageFactory.initElements(driver, SwagLabHomePage.class);
		swlCart = new SwagLabCartPage(driver);
		swlCheckout = PageFactory.initElements(driver, SwagLabCheckoutPage.class);
		Thread.sleep(3000);
	}

	@Test(priority = 0)
	public void loginTestCase() throws InterruptedException {
		swlLogin.swagLabLogin("standard_user", "secret_sauce");
		Thread.sleep(3000);
	}

	@Test(priority = 1)
	public void sortProductsTestCase() throws InterruptedException {
		swlHome.sortProductPriceAscending();
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void addToCartTestCase() throws InterruptedException {
		swlHome.addToCartAndMovetoCartPage();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void clickOnCheckOutBtnTestCase() throws InterruptedException {
		swlCart.clickOnCheckOutBtn();
		Thread.sleep(3000);
	}

	@Test(priority = 4)
	public void enterUserDetailsTestCase() throws InterruptedException {
		swlCheckout.enterUserDetails("John", "Mike", "123456");
		swlCheckout.clickOnContinue();
		Thread.sleep(3000);
	}

	@Test(priority = 5)
	public void clickOnFinishBtnTestCase() throws InterruptedException {
		swlCheckout.clickOnFinishBtn();
		Thread.sleep(3000);
	}

	@Test(priority = 6)
	public void backToHomePageAndLogoutTestCase() throws InterruptedException {
		swlCheckout.clickOnBackToHomeBtn();
		Thread.sleep(3000);
		swlHome.logout();
		Thread.sleep(3000);
	}

	@AfterTest
	public void closeBrowser() {
		tearDown();
	}
}
