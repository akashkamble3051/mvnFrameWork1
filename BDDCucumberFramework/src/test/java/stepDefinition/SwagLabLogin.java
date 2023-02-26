package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import swagLabPages.SwagLabHomePage;
import swagLabPages.SwagLabLoginPage;
import utility.SeleniumUtility;

public class SwagLabLogin extends SeleniumUtility {
	WebDriver driver;
	SwagLabLoginPage swgLogin;
	SwagLabHomePage swgHome;
	String username, pwd;

	@Given("User launchs {string} browser and opens the SwagLab appilcation using {string}")
	public void user_launchs_chrome_browser_and_opens_the_swag_lab_appilcation(String browser, String appUrl) {
		driver = setUp(browser, appUrl);
		swgLogin = new SwagLabLoginPage(driver);
		swgHome = PageFactory.initElements(driver, SwagLabHomePage.class);
	}

	@Given("User has username as {string} and password as {string}")
	public void user_has_username_as_and_password_as(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password() {
		swgLogin.swgLabEnterUserNameAndPassword(username, pwd);
	}

	@When("User click on Swaglab login button")
	public void user_click_on_swaglab_login_button() {
		swgLogin.clickOnSwgLabLoginBtn();
	}

	@Then("Verify user is on the home page")
	public void verify_user_is_on_the_home_page() {
		swgHome.logout();
		tearDown();
	}

}
