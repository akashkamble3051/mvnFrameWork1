package orangeHrmTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import orangeHRM.pages.OrangeHrmLoginPage;
import utility.SeleniumUtility;

public class OrangeHrmTestCase extends SeleniumUtility {//1. we have to initialize used classes & also initialize webDriver
	                    //2. crate before method and launch browser &
	                    //3. setup pageFactory for each used class
	
	
WebDriver driver;//1.webDriver initialized
OrangeHrmLoginPage OhLoginPage; // 1.classes initialized
	
@BeforeMethod//2. beforeMethod is created
public void BrawserLaunchAndPageFactorySetup() {
	driver= setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//2.browser launched and URL open
	OhLoginPage=PageFactory.initElements(driver,OrangeHrmLoginPage.class);
	//pageFactory set for used classes
	
	
}
@Test
public void orangeHrmLogintestCase1() {
	
	OhLoginPage.userNameAndPasswordEnter("admin","admin123");
	OhLoginPage.clickOnLoginButton();
	
}
@AfterMethod
public void CloseBrowser () {
	tearDown();
	
}

}
