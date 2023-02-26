package orangeHrmPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.SeleniumUtility;

public class OrangeHrmLoginPageTest extends SeleniumUtility  {

	@FindBy(name="username")
	private WebElement userNameField;
	
	@FindBy(name="password")
	private WebElement passwordField;
	
	@FindBy(css="button[type='submit']")
	private WebElement loginField;
	
	String uid;
	String pwd;
	
	public void enterUserNameANdPassword(String uid,String pwd) {
		
		typeInput( userNameField,  uid);
		typeInput(passwordField, pwd);
		
		
	}
	public void clickOnLoginButton() {
		
		clickOnElement( loginField);
		
	}
	
	
}
