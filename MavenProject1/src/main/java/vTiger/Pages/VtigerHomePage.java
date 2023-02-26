package vTiger.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.SeleniumUtility;

public class VtigerHomePage extends SeleniumUtility {

	@FindBy(id = "appnavigator")
	private WebElement appNavigatorBtn;

	@FindBy(xpath = "//span[text()=' MARKETING']")
	private WebElement marketingOption;

	@FindBy(xpath = "//span[text()=' Campaigns']")
	private WebElement compaignsOption;

	@FindBy(css = ".company-logo")
	private WebElement companyLogo;

	@FindBy(xpath = "//a[@class='userName dropdown-toggle pull-right']")
	private WebElement profileOption;

	@FindBy(id = "menubar_item_right_LBL_SIGN_OUT")
	private WebElement singOutBtn;

	public void navigateToCompaignPage() {
		clickOnElement(appNavigatorBtn);
//		mouseHover("targetElement", marketingOption, 0, 0);
		clickOnElement(marketingOption);
		clickOnElement(compaignsOption);
	}

	public void signOut() {
		clickOnElement(companyLogo);
		clickOnElement(profileOption);
		clickOnElement(singOutBtn);
	}
}
