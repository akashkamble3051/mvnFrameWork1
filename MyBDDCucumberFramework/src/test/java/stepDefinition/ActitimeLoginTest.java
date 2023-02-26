package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import actitimePages.ActitimeHomePage;
import actitimePages.ActitimeLoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumUtility;

public class ActitimeLoginTest extends SeleniumUtility {
	WebDriver driver;
	ActitimeLoginPage actLogin;
	ActitimeHomePage actHome;
	String userName, password;

	@Given("User launchs chrome browser and opens the Actitime appilcation")
	public void user_launchs_chrome_browser_and_opens_the_actitime_appilcation() {
		driver = setUp("chrome", "https://demo.actitime.com/login.do");
		actLogin = new ActitimeLoginPage(driver);
		actHome = PageFactory.initElements(driver, ActitimeHomePage.class);
	}

	@When("User enters user name and password as")
	public void user_enters_user_name_and_password_as(DataTable dataTable) {
//		here we are importing date from data table as list
		List<List<String>> userData = dataTable.asLists(String.class);
		List<String> firstUserData = userData.get(0);
		userName = firstUserData.get(0);
		password = firstUserData.get(1);
		System.out.println(firstUserData.get(0) + "\t" + firstUserData.get(1));

		List<String> secondUserData = userData.get(1);
		System.out.println(secondUserData.get(0) + "\t" + secondUserData.get(1));

		actLogin.enterActitimeUsernameAndPassword(userName, password);
	}

	@When("User enters user name and password from data table as Map")
	public void user_enters_user_name_and_password_from_data_table_as_map(DataTable dataTable) {
		List<Map<String, String>> userData = dataTable.asMaps(String.class, String.class);

		Map<String, String> firstUserData = userData.get(0);
		userName = firstUserData.get("UserName");
		password = firstUserData.get("Password");
		System.out.println(userName + "\t" + password);

		Map<String, String> secondUserData = userData.get(1);
		System.out.println(secondUserData.get("UserName") + "\t" + secondUserData.get("Password"));
		actLogin.enterActitimeUsernameAndPassword(userName, password);
	}

	@When("User click on the login button")
	public void user_click_on_the_login_button() {
		actLogin.clickOnActitimeLoginBtn();
	}

	@Then("User should navigate to home page")
	public void user_should_navigate_to_home_page() {
		Assert.assertTrue(actHome.verifyUserIsOnActitimeHomePage());
		actHome.logout();
		tearDown();
	}
}
