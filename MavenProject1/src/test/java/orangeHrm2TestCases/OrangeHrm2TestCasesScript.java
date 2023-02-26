package orangeHrm2TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import orangeHrm2.pages.OrangeHrmAddEmployeePage;
import orangeHrm2.pages.OrangeHrmDirectoryPage;
import orangeHrm2.pages.OrangeHrmEmployeeListPage;
import orangeHrm2.pages.OrangeHrmHomePage;
import orangeHrm2.pages.OrangeHrmLoginPage;
import utility.SeleniumUtility;

public class OrangeHrm2TestCasesScript extends SeleniumUtility {
	
	
	WebDriver driver;
	OrangeHrmLoginPage OhLoginPage;
	OrangeHrmHomePage OhHomePage;
	OrangeHrmDirectoryPage OhDirectoryPage; 
	OrangeHrmEmployeeListPage OhEmployeeListPage;
	OrangeHrmAddEmployeePage OhAddEployeePgae;
	
	@BeforeMethod
	public void browserLaunchAndPageFactorySetup() {
		
		driver =setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		OhLoginPage= PageFactory.initElements(driver, OrangeHrmLoginPage.class);
		OhHomePage=PageFactory.initElements(driver, OrangeHrmHomePage.class);
		OhDirectoryPage=PageFactory.initElements(driver, OrangeHrmDirectoryPage.class);
		OhEmployeeListPage=PageFactory.initElements(driver, OrangeHrmEmployeeListPage.class);
		OhAddEployeePgae=PageFactory.initElements(driver, OrangeHrmAddEmployeePage.class);
				
	}
	
	@Test
	public void orangeHrmlogingPage() {
		
		
		
		
		
		
	}
	
	
	

}
