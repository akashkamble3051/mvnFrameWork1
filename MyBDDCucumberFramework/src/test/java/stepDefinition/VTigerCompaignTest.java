package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumUtility;
import vTiger.Pages.VtigerCompaignPage;
import vTiger.Pages.VtigerHomePage;
import vTiger.Pages.VtigerLoginPage;

public class VTigerCompaignTest extends SeleniumUtility {
	WebDriver driver;
	VtigerLoginPage vtLogin;
	VtigerHomePage vtHome;
	VtigerCompaignPage vtCompaign;

	String propertyFilePath = "./src/main/resources/VTigerData.properties";

	@Before(order = 1)
	public void firstBeforeHook() {
		System.out.println("First Before Hook");
	}

	@Before(order = 2)
	public void secondBeforeHook() {
		System.out.println("Second Before Hook");
	}

	@After(order = 2)
	public void firstAfterHook() {
		System.out.println("First After Hook");
	}

	@After(order = 1)
	public void secondAfterHook() {
		System.out.println("Second After Hook");
	}

	@Given("User is on the Vtiger login page")
	public void user_is_on_the_vtiger_login_page() throws IOException {
		System.out.println("Background started");
		driver = setUp(getPropertyFileData(propertyFilePath, "browser"),
				getPropertyFileData(propertyFilePath, "appUrl"));
		vtLogin = new VtigerLoginPage(driver);
		vtHome = PageFactory.initElements(driver, VtigerHomePage.class);
		vtCompaign = PageFactory.initElements(driver, VtigerCompaignPage.class);
	}

	@Given("User login with valid credentials")
	public void user_login_with_valid_credentials() throws IOException {
		vtLogin.enterUserNameAndPassword(getPropertyFileData(propertyFilePath, "username"),
				getPropertyFileData(propertyFilePath, "password"));
		vtLogin.clickOnSingInBtn();
	}

	@Given("User navigates to compaign page")
	public void user_navigates_to_compaign_page() {
		vtHome.navigateToCompaignPage();
	}

	@When("Click on Add compaing button")
	public void click_on_add_compaing_button() {
		System.out.println("Sceanrio outline starts");
		vtCompaign.clickOnAddCompaignBtn();
	}

	@When("User enters {string} and {string} and click on save button")
	public void user_enters_and_and_click_on_save_button(String compaignName, String expectedCloseDate) {
		vtCompaign.createCompaign(compaignName, expectedCloseDate);
	}

	@When("User click on Compaign header link")
	public void user_click_on_compaign_header_link() {
		vtCompaign.clickOnHeaderLink();
	}

	@Then("Verify the created compaing with {string}")
	public void verify_the_created_compaing_with(String compaignName) {
		Assert.assertTrue(vtCompaign.verifyCreatedCompaign());
		vtHome.signOut();
	}

	@When("User click on select all compaign checkbox")
	public void user_click_on_select_all_compaign_checkbox() {
		System.out.println("Delete compaign scenario");
		vtCompaign.selectAllCheckBox();
	}

	@When("User click on delete button")
	public void user_click_on_delete_button() {
		vtCompaign.clickOnDeleteBtn();
	}

	@When("User click on confirm delete button appeared on the pop up")
	public void user_click_on_confirm_delete_button_appeared_on_the_pop_up() {
		vtCompaign.clickOnDeleteConfirmBtn();
	}

	@Then("Verify that all the created compaings are deleted")
	public void verify_that_all_the_created_compaings_are_deleted() {
		Assert.assertTrue(vtCompaign.verifyDeletedCompaign());
		//Assert.assertTrue(false);////we have set fail test case to show screenshot operation at failure of test scenario
		vtHome.signOut();
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
			driver.close();
		}
	}
	


//	to make this hook scenario specific then use the tag specified with scenario 
	@Before("@Rerun")
	public void createCompaign() throws IOException {
		System.out.println("Rerun specific hook");
		user_is_on_the_vtiger_login_page();
		user_login_with_valid_credentials();
		user_navigates_to_compaign_page();
		if (vtCompaign.verifyDeletedCompaign()) {
			click_on_add_compaing_button();
			user_enters_and_and_click_on_save_button("JavaLearning", "28-02-2023");
		}
		vtHome.signOut();
	}
}

