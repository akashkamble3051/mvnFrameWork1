package swagLabPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class SwagLabLoginPage extends SeleniumUtility {
	WebDriver driver;

	public SwagLabLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	WebElement usernameField;

	@FindBy(css = "input[type='password']")
	WebElement pwdField;

	@FindBy(name = "login-button")
	WebElement loginBtn;

	public void swgLabEnterUserNameAndPassword(String userName, String pwd) {
		typeInput(usernameField, userName);
		typeInput(pwdField, pwd);
	}

	public void clickOnSwgLabLoginBtn() {
		clickOnElement(loginBtn);
	}
}
