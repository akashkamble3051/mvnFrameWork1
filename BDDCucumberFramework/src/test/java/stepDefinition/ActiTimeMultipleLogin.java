package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import actitimePages.ActitimeHomePage;
import actitimePages.ActitimeLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumUtility;

public class ActiTimeMultipleLogin extends SeleniumUtility {
	WebDriver driver;
	ActitimeLoginPage actLogin;
	ActitimeHomePage actHome;

	@Given("User open the {string} browser and launch the actitime login page using {string}")
	public void user_open_the_browser_and_launch_the_actitime_login_page_using(String browser, String appUrl) {
		driver = setUp(browser, appUrl);
		actLogin = new ActitimeLoginPage(driver);
		actHome = PageFactory.initElements(driver, ActitimeHomePage.class);
	}

	@When("User enter {string} and {string} on the login page")
	public void user_enter_and_on_the_login_page(String username, String password) {
		actLogin.enterActitimeUsernameAndPassword(username, password);
	}

	@When("User click on the login button after enetring username and password")
	public void user_click_on_the_login_button_after_enetring_username_and_password() {
		actLogin.clickOnActitimeLoginBtn();
	}

	@Then("Verify that login is successful")
	public void verify_that_login_is_successful() {
		actHome.verifyUserIsOnActitimeHomePage();
		actHome.logout();
		tearDown();
	}

	@Then("Verify that login is successful if {string} is positive and login is not successful if scenario is negative")
	public void verify_that_login_is_successful_if_is_positive_and_login_is_not_successful_if_scenario_is_negative(
			String scenario) {
		if (scenario.equalsIgnoreCase("Positive")) {
			actHome.closeThePopUp();
			actHome.verifyUserIsOnActitimeHomePage();
			actHome.logout();
			tearDown();
		}
		if (scenario.equalsIgnoreCase("Negative")) {
			actLogin.verifyWarningMsgIsDisplayed();
			tearDown();
		}

	}
}
