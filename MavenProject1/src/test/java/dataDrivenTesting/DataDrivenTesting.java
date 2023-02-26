package dataDrivenTesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.ExcelUtility;
import utility.SeleniumUtility;

public class DataDrivenTesting extends SeleniumUtility {

	String xFilePath = "./src/test/resources/ApplicationData.xlsx";
	String xlSheet = "LoginData";

	@Test
	public void actitimeLogin() throws IOException {
		String browser = ExcelUtility.getCellData(xFilePath, xlSheet, 1, 1);
		String appUrl = ExcelUtility.getCellData(xFilePath, xlSheet, 1, 0);
		WebDriver driver = setUp(browser, appUrl);

//		Validate the actual login page title
		Assert.assertEquals(driver.getTitle(), ExcelUtility.getCellData(xFilePath, xlSheet, 1, 2));

//		read the username from excel sheet and enter it
		WebElement userNameField = driver.findElement(By.id("username"));
		String userName = ExcelUtility.getCellData(xFilePath, xlSheet, 1, 3);
		typeInput(userNameField, userName);

//		read the password from excel sheet and enter it
		WebElement passwordField = driver.findElement(By.name("pwd"));
		String password = ExcelUtility.getCellData(xFilePath, xlSheet, 1, 4);
		typeInput(passwordField, password);

//		click on the login butt
		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		clickOnElement(loginBtn);
		
//		validate the actual home page title
		WebElement logoutBtn = driver.findElement(By.id("logoutLink"));
		verifyUIElementDisplayed(logoutBtn); // added purposeful to delayed the script execution
		Assert.assertEquals(driver.getTitle(), ExcelUtility.getCellData(xFilePath, xlSheet, 1, 5));
	}
}
