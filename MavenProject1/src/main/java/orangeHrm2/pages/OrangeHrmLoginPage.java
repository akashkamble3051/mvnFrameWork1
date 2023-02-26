package orangeHrm2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.SeleniumUtility;

public class OrangeHrmLoginPage extends SeleniumUtility{// define all required webElements and methods for actions
	
	
	//define required all webElements
	@FindBy(name="username")
	WebElement userNameField;
	
	@FindBy(name="password")
	WebElement passwordField;
	
	@FindBy(css="button[type='submit']")
	WebElement loginButton;
	//define required methods related to loginPage
	public void userNameAndPasswordEnter(String uid,String pwd) {
		typeInput(userNameField,uid);
		typeInput(passwordField,pwd);
		//clickOnElement(loginButton); we can use here or we can create method

	}
	
	public void clickOnLoginButton() {
		clickOnElement(loginButton);
		
	}


}
