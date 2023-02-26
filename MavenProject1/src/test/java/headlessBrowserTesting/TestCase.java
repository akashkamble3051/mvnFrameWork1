package headlessBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {
	
@Test	
public void testCase1() {
	
	WebDriver driver = new HtmlUnitDriver();
	driver.get("https://www.google.co.in/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
}

@Test
public void testCase2() {
	WebDriverManager.chromedriver().setup();
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("headless");
	
	WebDriver driver = new ChromeDriver(options);
	
	driver.get("https://www.selenium.dev/");
	 System.out.println(driver.getTitle());
	 System.out.println(driver.getCurrentUrl());
	
}

}
