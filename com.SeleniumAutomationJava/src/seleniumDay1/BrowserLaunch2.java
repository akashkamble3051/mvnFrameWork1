package seleniumDay1;


import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunch2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\eclipse-workspace\\com.SeleniumAutomationJava\\drivers\\chromedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();

	}

}