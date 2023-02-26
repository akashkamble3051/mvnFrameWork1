package vTigerTestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.SeleniumUtility;
import vTiger.Pages.VtigerCompaignPage;
import vTiger.Pages.VtigerHomePage;
import vTiger.Pages.VtigerLoginPage;

public class VTigerCompaignTestCases extends SeleniumUtility {
	WebDriver driver;
	VtigerLoginPage vtLogin;
	VtigerHomePage vtHome;
	VtigerCompaignPage vtCompaign;
	String propertyFileLocation = "./src/main/resources/VtigerCredentials.properties";

	@BeforeMethod
	public void lunchApplicationAndLogin() throws IOException, InterruptedException {
		String browser = getPropertyFileData(propertyFileLocation, "browser");
		driver = setUp(browser, getPropertyFileData(propertyFileLocation, "appUrl"));
		vtLogin = new VtigerLoginPage(driver);
		vtHome = PageFactory.initElements(driver, VtigerHomePage.class);
		vtCompaign = PageFactory.initElements(driver, VtigerCompaignPage.class);
		vtLogin.enterUserNameAndPassword(getPropertyFileData(propertyFileLocation, "username"),
				getPropertyFileData(propertyFileLocation, "password"));
		vtLogin.clickOnSingInBtn();
		Thread.sleep(3000);
	}

	@Test(priority = 0)
	public void createCompaign() throws InterruptedException {
		vtHome.navigateToCompaignPage();
		vtCompaign.createCompaign("POM Testing", "20-02-2023");
		Thread.sleep(3000);
	}

	@Test(priority = 1)
	public void verifyCreatedCompaign() {
		vtHome.navigateToCompaignPage();
		Assert.assertTrue(vtCompaign.verifyCreatedCompaign());
	}

	@Test(priority = 2)
	public void deleteCreateLead() {
		vtHome.navigateToCompaignPage();
		vtCompaign.deleteCreateCompaign();
	}

	@Test(priority = 3)
	public void verifyDeletedCompaign() {
		vtHome.navigateToCompaignPage();
		Assert.assertEquals(vtCompaign.verifyDeletedCompaign(), true);
	}

	@AfterMethod
	public void logoutAndTearDown() {
		vtHome.signOut();
		tearDown();
	}
}
