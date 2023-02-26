package vTiger.Pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.SeleniumUtility;

public class VtigerCompaignPage extends SeleniumUtility {

	@FindBy(id = "Campaigns_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addCompaignBtn;

	@FindBy(id = "Campaigns_editView_fieldName_campaignname")
	private WebElement compaignNameField;

	@FindBy(id = "Campaigns_editView_fieldName_closingdate")
	private WebElement expectedCloseDateField;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveBtn;

	@FindBy(xpath = "//h4[text()=' Campaigns ']")
	private WebElement compaignHeader;

	@FindBy(xpath = "//a[text()='POM Testing']")
	private WebElement newlyCreatedCompaign;

	@FindBy(xpath = "//tr[td[span[span[a[text()='POM Testing']]]]]/td[1]//input")
	private WebElement newlyCreatedCompaignCheckBox;

	@FindBy(id = "Campaigns_listView_massAction_LBL_DELETE")
	private WebElement deleteBtn;

	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yesBtn;

	public void createCompaign(String compaignName, String expectedCloseDate) {
		clickOnElement(addCompaignBtn);
		typeInput(compaignNameField, compaignName);
		typeInput(expectedCloseDateField, expectedCloseDate);
		clickOnElement(saveBtn);
	}

	public boolean verifyCreatedCompaign() {
		try {
			return verifyUIElementDisplayed(newlyCreatedCompaign);
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void deleteCreateCompaign() {
		clickOnElement(newlyCreatedCompaignCheckBox);
		clickOnElement(deleteBtn);
		clickOnElement(yesBtn);
	}

	public boolean verifyDeletedCompaign() {
		try {
			return !(verifyUIElementDisplayed(newlyCreatedCompaign));
		} catch (TimeoutException e) {
			return true;
		}
	}
}
