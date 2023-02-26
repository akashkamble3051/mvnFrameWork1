package swagLabPages;

import org.openqa.selenium.TimeoutException;
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

	@FindBy(xpath = "//img[@alt='Pony Express']")
	WebElement checkOutConfiramtionImage;

	@FindBy(css = ".summary_subtotal_label")
	WebElement subTotalLabel;

	@FindBy(css = ".summary_tax_label")
	WebElement taxAmountLabel;

	@FindBy(css = ".summary_total_label")
	WebElement totalLabel;

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

	public double[] getSubTotalTaxAndTotalAmountValue() {
		String[] subTotalArr = subTotalLabel.getText().split("\\$");
		String[] taxAmountArr = taxAmountLabel.getText().split("\\$");
		String[] totalAmountArr = totalLabel.getText().split("\\$");

		double[] amountArr = { Double.parseDouble(subTotalArr[1]), Double.parseDouble(taxAmountArr[1]),
				Double.parseDouble(totalAmountArr[1]) };
		return amountArr;
	}

	public boolean verifyPonyImageIsDispalyed() {
		try {
			return verifyUIElementDisplayed(checkOutConfiramtionImage);
		} catch (TimeoutException e) {
			return false;
		}
	}

}
