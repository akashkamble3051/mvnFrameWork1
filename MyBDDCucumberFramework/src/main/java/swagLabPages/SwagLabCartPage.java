package swagLabPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class SwagLabCartPage extends SeleniumUtility {
	WebDriver driver;

	public SwagLabCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "checkout")
	WebElement checkoutBtn;

	public void clickOnCheckOutBtn() {
		clickOnElement(checkoutBtn);
	}
}
