package vTiger.Pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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

//	@FindAll ==> for OR operation
//	@FindBys ==> for AND operation

	@FindAll({ @FindBy(xpath = "//a[text()='JavaLearning']"), @FindBy(xpath = "//a[text()='SeleniumLearning']") })
	private WebElement newlyCreatedCompaign;

//	@FindBy(xpath = "//a[text()='JavaLearning']")
//	private WebElement newlyCreatedCompaign;

	@FindBy(css = ".listViewEntriesMainCheckBox")
	private WebElement selectAllCheckBox;

	@FindBy(id = "Campaigns_listView_massAction_LBL_DELETE")
	private WebElement deleteBtn;

	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yesBtn;

	@FindBy(css = ".emptyRecordsContent")
	private WebElement noDataFoundText;

	public void clickOnAddCompaignBtn() {
		clickOnElement(addCompaignBtn);
	}

	public void clickOnHeaderLink() {
		clickOnElement(compaignHeader);
	}

	public void createCompaign(String compaignName, String expectedCloseDate) {
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

	public void selectAllCheckBox() {
		clickOnElement(selectAllCheckBox);
	}

	public void clickOnDeleteBtn() {
		clickOnElement(deleteBtn);
	}

	public void clickOnDeleteConfirmBtn() {
		clickOnElement(yesBtn);
	}

	public boolean verifyDeletedCompaign() {
		try {
			return (verifyUIElementDisplayed(noDataFoundText));
		} catch (TimeoutException e) {
			return false;
		}
	}
}
