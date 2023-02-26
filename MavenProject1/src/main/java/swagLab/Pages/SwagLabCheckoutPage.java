package swagLab.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.SeleniumUtility;

public class SwagLabCheckoutPage extends SeleniumUtility {

	@FindBy(id = "first-name")
	WebElement firstNameField;

	@FindBy(name = "lastName")
	WebElement lastNameField;

	@FindBy(css = "input[placeholder='Zip/Postal Code']")
	WebElement pincodeField;

	@FindBy(id = "continue")
	WebElement continueBtn;

	@FindBy(id = "finish")
	WebElement finishBtn;

	@FindBy(id = "back-to-products")
	WebElement backToHomeBtn;

	public void enterUserDetails(String firstName, String lastName, String pincode) {
		typeInput(firstNameField, firstName);
		typeInput(lastNameField, lastName);
		typeInput(pincodeField, pincode);
	}

	public void clickOnContinue() {
		clickOnElement(continueBtn);
	}

	public void clickOnFinishBtn() {
		clickOnElement(finishBtn);
	}

	public void clickOnBackToHomeBtn() {
		clickOnElement(backToHomeBtn);
	}

}
