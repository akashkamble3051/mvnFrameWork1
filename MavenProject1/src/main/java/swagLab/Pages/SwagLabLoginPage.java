package swagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class SwagLabLoginPage extends SeleniumUtility {
	WebDriver driver;

//	create public constructor with one WebDriver parameter
	public SwagLabLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	define the webelements present on the page
	@FindBy(id = "user-name")
	WebElement usernameField;

	@FindBy(css = "input[type='password']")
	WebElement pwdField;

	@FindBy(name = "login-button")
	WebElement loginBtn;

//	create public method for corresponding actions on the same page
	public void swagLabLogin(String userName, String pwd) {
		typeInput(usernameField, userName);
		typeInput(pwdField, pwd);
		clickOnElement(loginBtn);
	}
}
