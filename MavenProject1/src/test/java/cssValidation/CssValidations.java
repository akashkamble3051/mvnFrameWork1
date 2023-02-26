package cssValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class CssValidations extends SeleniumUtility {

	@Test
	public void vTigerTestCase() {
		WebDriver driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");

//		validate the sign in button color
		WebElement signInBtn = driver.findElement(By.xpath("//button[text()='Sign in']"));
		String signInBtnColor = signInBtn.getCssValue("color");
		System.out.println("Sign In button color code : " + signInBtnColor);
		
		System.out.println("Sign In button font size : "+signInBtn.getCssValue("font-size"));
		System.out.println("Sign In button font style : "+signInBtn.getCssValue("font-style"));
	}
}
