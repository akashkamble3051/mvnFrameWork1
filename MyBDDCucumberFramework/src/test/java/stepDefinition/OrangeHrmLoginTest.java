package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orangeHrmPages.OrangeHrmHomePage;
import orangeHrmPages.OrangeHrmLoginPage;
import utility.SeleniumUtility;

public class OrangeHrmLoginTest extends SeleniumUtility {
	WebDriver driver;
	OrangeHrmLoginPage orgLogin;
	OrangeHrmHomePage orgHome;
	String userName, password;

	@Given("User opens the chrome browser and OrangeHrm application is loaded")
	public void user_opens_the_chrome_browser_and_orange_hrm_application_is_loaded() {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		orgLogin = PageFactory.initElements(driver, OrangeHrmLoginPage.class);
		orgHome = PageFactory.initElements(driver, OrangeHrmHomePage.class);
	}

	@Given("User has username and password")
	public void user_has_username_and_password() {
		userName = "Admin";
		password = "admin123";
	}

	@When("User enters userName and password")
	public void user_enters_user_name_and_password() {
		orgLogin.enterUsernameAndPassword(userName, password);
	}

	@When("User click on the sign in button")
	public void user_click_on_the_sign_in_button() {
		orgLogin.clickOnLoginButton();
	}

	@Then("User should login successfully and navigated to home page")
	public void user_should_login_successfully_and_navigated_to_home_page() {
		Assert.assertTrue(orgHome.verifyUserIsOnHomePage());
		orgHome.logout();
		tearDown();
	}
}
