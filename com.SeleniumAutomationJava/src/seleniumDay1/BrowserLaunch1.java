package seleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch1 {

	public static void main(String[] args) {
//		how to launch the Chrome browser
//		first set the system property for "webdriver.chrome.driver"
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\com.SeleniumAutomationJava\\drivers\\chromedriver.exe");

//		Create the object of ChromeDriver class

		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
	}

}