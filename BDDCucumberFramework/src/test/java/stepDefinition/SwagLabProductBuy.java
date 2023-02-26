package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import swagLabPages.SwagLabCartPage;
import swagLabPages.SwagLabCheckoutPage;
import swagLabPages.SwagLabHomePage;
import swagLabPages.SwagLabLoginPage;
import utility.ExcelUtility;
import utility.SeleniumUtility;

public class SwagLabProductBuy extends SeleniumUtility {
	WebDriver driver;
	SwagLabLoginPage swgLogin;
	SwagLabHomePage swgHome;
	SwagLabCartPage swgCart;
	SwagLabCheckoutPage swgCheckout;
	String xlPath = "./src/main/resources/SwagLabLoginData.xlsx";
	String productName;

	@Given("User opens the browser and SwagLab application using data provided on {string} sheet")
	public void user_opens_the_browser_and_swag_lab_application_using_data_provided_on_sheet(String xlSheet)
			throws IOException {
		driver = setUp(ExcelUtility.getCellData(xlPath, xlSheet, 1, 1),
				ExcelUtility.getCellData(xlPath, xlSheet, 1, 0));
		swgLogin = new SwagLabLoginPage(driver);
		swgHome = new SwagLabHomePage(driver);
		swgCart = new SwagLabCartPage(driver);
		swgCheckout = PageFactory.initElements(driver, SwagLabCheckoutPage.class);
	}

	@When("User enter username and password provided on {string} sheet")
	public void user_enter_username_and_password_provided_on_sheet(String xlSheet) throws IOException {
		swgLogin.swgLabEnterUserNameAndPassword(ExcelUtility.getCellData(xlPath, xlSheet, 1, 2),
				ExcelUtility.getCellData(xlPath, xlSheet, 1, 3));
	}

	@When("User click on the login button after enter data from sheet")
	public void user_click_on_the_login_button_after_enter_data_from_sheet() {
		swgLogin.clickOnSwgLabLoginBtn();
	}

	@When("User sort the product list in ascending order of price")
	public void user_sort_the_product_list_in_ascending_order_of_price() throws InterruptedException {
		swgHome.sortProductPriceAscending();
		Thread.sleep(3000);
	}

	@When("User sort the product list in descending order of price")
	public void user_sort_the_product_list_in_descending_order_of_price() throws InterruptedException {
		swgHome.sortProductPriceDescending();
		Thread.sleep(3000);
	}

	@When("User add the lowest price product in the cart")
	public void user_add_the_lowest_price_product_in_the_cart() {
		productName = swgHome.getProductName();
		swgHome.addProductToCart();
	}

	@When("User navigate to cart page")
	public void user_navigate_to_cart_page() {
		swgHome.navigateToCartPage();
	}

	@Then("Lowest price product should be added to the cart")
	public void lowest_price_product_should_be_added_to_the_cart() {
		Assert.assertTrue(swgHome.verifyProductInCart(productName));
	}

	@When("User click on checkout button")
	public void user_click_on_checkout_button() {
		swgCart.clickOnCheckOutBtn();
	}

	@When("User enter firstname, lastname and zip code provide on {string} sheet")
	public void user_enter_firstname_lastname_and_zip_code_provide_on_sheet(String xlSheet) throws IOException {
		swgCheckout.enterUserDetails(ExcelUtility.getCellData(xlPath, xlSheet, 1, 4),
				ExcelUtility.getCellData(xlPath, xlSheet, 1, 5), ExcelUtility.getCellData(xlPath, xlSheet, 1, 6));
		swgCheckout.clickOnContinue();
	}

	@Then("Verify the total amount is addition of item cost and tax amount")
	public void verify_the_total_amount_is_addition_of_item_cost_and_tax_amount() {
		double[] amountArr = swgCheckout.getSubTotalTaxAndTotalAmountValue();
		Assert.assertEquals(amountArr[2], (amountArr[0] + amountArr[1]));
	}

	@When("User click on the finish button")
	public void user_click_on_the_finish_button() {
		swgCheckout.clickOnFinishBtn();
	}

	@Then("Order confirmation message should be displayed")
	public void order_confirmation_message_should_be_displayed() {
		Assert.assertTrue(swgCheckout.verifyPonyImageIsDispalyed());
		tearDown();
	}

	@When("User add the highest price product in the cart")
	public void user_add_the_highest_price_product_in_the_cart() {
		productName = swgHome.getProductName();
		swgHome.addProductToCart();
	}

	@Then("Highest price product should be added to the cart")
	public void highest_price_product_should_be_added_to_the_cart() {
		Assert.assertTrue(swgHome.verifyProductInCart(productName));
	}
}
