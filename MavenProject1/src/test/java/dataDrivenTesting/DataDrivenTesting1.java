package dataDrivenTesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelUtility;
import utility.SeleniumUtility;

public class DataDrivenTesting1 extends SeleniumUtility {
	String xFilePath = "./src/test/resources/ApplicationData.xlsx";
	String xlSheet = "LoginData";
	int cellCounter;
	boolean flag;
	int rowCounter = 1;

	@Test(dataProvider = "LoginData")
	public void actitimeLoginTest(String appUrl, String browser, String expectedLoginPageTitle, String userName,
			String pwd, String expectedHomePageTitle) {

		WebDriver driver = setUp(browser, appUrl);
		Assert.assertEquals(driver.getTitle(), expectedLoginPageTitle);

		typeInput(driver.findElement(By.id("username")), userName);
		typeInput(driver.findElement(By.name("pwd")), pwd);
		clickOnElement(driver.findElement(By.id("loginButton")));

		Assert.assertEquals(verifyTheCurrentPageTitle(expectedHomePageTitle), expectedHomePageTitle);
		flag = true;
	}

	@AfterMethod
	public void updateResultInSheet() throws IOException {
		if (flag)
			ExcelUtility.setCellData(xFilePath, xlSheet, rowCounter, cellCounter, "Pass");
		else
			ExcelUtility.setCellData(xFilePath, xlSheet, rowCounter, cellCounter, "Fail");
		flag = false;
		rowCounter++;
		driver.close();
	}

	@DataProvider(name = "LoginData")
	public String[][] getData() throws IOException {
		int rowCount = ExcelUtility.getRowCount(xFilePath, xlSheet);
		int cellCount = ExcelUtility.getCellCount(xFilePath, xlSheet, 0);
		cellCounter = ExcelUtility.getCellCount(xFilePath, xlSheet, 1);

		String[][] data = new String[rowCount][cellCount];

		for (int i = 1; i <= rowCount; i++) { // iterate the rows
			for (int j = 0; j < cellCount; j++) { // iterate the cells
				data[i - 1][j] = ExcelUtility.getCellData(xFilePath, xlSheet, i, j);
			}
		}
		return data;
	}
}
