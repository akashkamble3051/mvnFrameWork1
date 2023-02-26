package orangeHrmPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.SeleniumUtility;

public class OrangeHrmLoginPage extends SeleniumUtility {

	@FindBy(name = "username")
	private WebElement usernameField;

	@FindBy(name = "password")
	private WebElement passwordField;

	@FindBy(css = ".orangehrm-login-button")
	private WebElement loginBtn;

	public void enterUsernameAndPassword(String username, String password) {
		typeInput(usernameField, username);
		typeInput(passwordField, password);
	}

	public void clickOnLoginButton() {
		clickOnElement(loginBtn);
	}
}
