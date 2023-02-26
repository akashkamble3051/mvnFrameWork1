package orangeHrmPages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.SeleniumUtility;

public class OrangeHrmHomePageTest extends SeleniumUtility{
	
	@FindBy(css = "img[alt='client brand banner']")
	private WebElement companyLogo;

	
	@FindBy(css = ".oxd-userdropdown-icon")
	private WebElement profileDropdown;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutBtn;

	
	
	public boolean VerifyUserIsOnHomePage() {
	try {	
	return	verifyUIElementDisplayed(companyLogo);
	}catch(TimeoutException e) {
		return false;
	}
	}
	public void logout() {
		clickOnElement(profileDropdown);
		
		 clickOnElement(logoutBtn);
		
	}
	
}
