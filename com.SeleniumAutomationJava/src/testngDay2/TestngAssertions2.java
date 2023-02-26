package testngDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.SeleniumUtility;

public class TestngAssertions2 extends SeleniumUtility {
	WebDriver driver;

	@BeforeTest
	public void launchBrowserAndApplication() {
		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	}

	@Test
	public void vTigerLoginTest() {
		SoftAssert softAssert = new SoftAssert();

//		verify the Vtiger logo on the login page
		WebElement companyLogo = driver.findElement(By.cssSelector(".img-responsive.user-logo"));

		softAssert.assertTrue(companyLogo.isDisplayed());
//		softAssert.assertEquals(companyLogo.isDisplayed(), true);

		typeInput(driver.findElement(By.name("username")), "admin");

		typeInput(driver.findElement(By.id("password")), "Test@123");

		WebElement singInbtn = driver.findElement(By.xpath("//button[text()='Sign in']"));

		softAssert.assertEquals(singInbtn.isDisplayed(), false);

		clickOnWebElement(singInbtn);
		
		softAssert.assertAll();
	}

	@AfterTest
	public void closeBrowser() {
		tearDown();
	}
}
