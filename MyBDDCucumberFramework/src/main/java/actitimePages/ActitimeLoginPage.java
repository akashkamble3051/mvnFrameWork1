package actitimePages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class ActitimeLoginPage extends SeleniumUtility {
	WebDriver driver;

	public ActitimeLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement userNameField;

	@FindBy(name = "pwd")
	private WebElement passwordFeild;

	@FindBy(id = "loginButton")
	private WebElement loginBtn;

	@FindBy(xpath = "//span[text()='Username or Password is invalid. Please try again.']")
	private WebElement warningMsg;

	public void enterActitimeUsernameAndPassword(String username, String password) {
		typeInput(userNameField, username);
		typeInput(passwordFeild, password);
	}

	public void clickOnActitimeLoginBtn() {
		clickOnElement(loginBtn);
	}

	public boolean verifyWarningMsgIsDisplayed() {
		try {
			return verifyUIElementDisplayed(warningMsg);
		} catch (TimeoutException e) {
			return false;
		}
	}
}
