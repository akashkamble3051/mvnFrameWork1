package vTiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class VtigerLoginPage extends SeleniumUtility {
	WebDriver driver;

	public VtigerLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement userNameField;

	@FindBy(name = "password")
	private WebElement pwdField;

	@FindBy(xpath = "//button[text()='Sign in']")
	private WebElement singInBtn;

	public void enterUserNameAndPassword(String userName, String pwd) {
		typeInput(userNameField, userName);
		typeInput(pwdField, pwd);
	}

	public void clickOnSingInBtn() {
		clickOnElement(singInBtn);
	}
}
