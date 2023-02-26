package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orangeHrmPages.OrangeHrmHomePageTest;
import orangeHrmPages.OrangeHrmLoginPageTest;
import utility.SeleniumUtility;

public class OrangeHrmTestCases extends SeleniumUtility{
	
OrangeHrmLoginPageTest ohLogin;
OrangeHrmHomePageTest ohHomepage;
WebDriver driver;
String uid;
String pwd;
@Given("user open chrome browser and OrangeHrm application is loaded")
public void user_open_chrome_browser_and_orange_hrm_application_is_loaded() {
	driver= setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	ohLogin=PageFactory.initElements(driver, OrangeHrmLoginPageTest.class);
	ohHomepage=PageFactory.initElements(driver, OrangeHrmHomePageTest.class);
}

@Given("user should have userID and password")
public void user_should_have_user_id_and_password() {
	
	uid="admin";
	pwd="admin123";
	
}

@When("user enter userID and Password")
public void user_enter_user_id_and_password() {
	ohLogin.enterUserNameANdPassword(uid,pwd);	
	
}

@When("click on login button")
public void click_on_login_button() {
	ohLogin.clickOnLoginButton();
	
}

@Then("user should login successfully")
public void user_should_login_successfully() {
	Assert.assertTrue(ohHomepage.VerifyUserIsOnHomePage());
	
}

@Then("Navigate to Home page")
public void navigate_to_home_page() {
	
	ohHomepage.logout();
	tearDown();
	
}


}
