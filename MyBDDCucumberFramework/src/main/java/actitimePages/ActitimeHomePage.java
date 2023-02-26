package actitimePages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.SeleniumUtility;

public class ActitimeHomePage extends SeleniumUtility {
	@FindBy(css = "#logo_aT")
	private WebElement companyLogo;

	@FindBy(id = "logoutLink")
	private WebElement logoutBtn;

	@FindBy(id = "closeProjectLightBoxBtn")
	private WebElement popUpCloseBtn;

	public boolean verifyUserIsOnActitimeHomePage() {
		try {
			return verifyUIElementDisplayed(companyLogo);
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void closeThePopUp() {
		try {
			clickOnElement(popUpCloseBtn);
		} catch (TimeoutException e) {

		}
	}

	public void logout() {
		clickOnElement(logoutBtn);
	}
}
