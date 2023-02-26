package testngDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class TestngAssertions1 extends SeleniumUtility {
//	Assertions in testng provides the way to verify and validate expected result and actual result
//	TestNg offer two types of assertions 1. HardAsserts(default)		2. SoftAsserts

//	HardAssert can be used using Assert class from testng library
//	SoftAssert can be used using SoftAssert class from testng library

//	HardAssert are the assert that stop the test execution when an assert statement fails
//	HardAssert are used to validations

//	SoftAssert are the assert that will not stop the test execution when an assert statement fails
//	SoftAssert are used for verifications

	WebDriver driver; // here driver default value is null

	@BeforeTest
	public void launchBrowserAndApplication() {
		driver = setUp("chrome", "https://demo.actitime.com/login.do");
	}

	@Test(priority = 0)
	public void verifyUserIsOnLoginPage() {
//		expected login page title --> actiTIME - Login
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
//		Asserts that two Strings are equal. If they are not, an AssertionError is thrown.
//		If AssertionError is thrown then testng will mark this test case method as failed
	}

	@Test(priority = 1)
	public void actitimeLoginTestCase() {
		WebElement userNameField = driver.findElement(By.id("username"));
		typeInput(userNameField, "admin");

		typeInput(driver.findElement(By.name("pwd")), "manager");

		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		clickOnWebElement(loginBtn);
	}

	@Test(priority = 2)
	public void verifyUserIsOnHomePage() {
//		expected home page title --> actiTIME - Enter Time-Track
		WebElement logoutBtn = driver.findElement(By.id("logoutLink"));
		logoutBtn.isDisplayed(); // written purposefully so that script will wait till home page gets loaded

		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track", "Home page title mismatch");

		clickOnWebElement(logoutBtn);
	}

	@AfterTest
	public void closeTheBrowser() {
		tearDown();
	}
}
