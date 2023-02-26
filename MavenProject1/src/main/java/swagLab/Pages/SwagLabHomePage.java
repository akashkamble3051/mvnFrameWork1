package swagLab.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.SeleniumUtility;

public class SwagLabHomePage extends SeleniumUtility {

	@FindBy(xpath = "//select[@data-test='product_sort_container']")
	WebElement sortOption;

	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	WebElement onesieAddToCartBtn;

	@FindBy(className = "shopping_cart_container")
	WebElement cartBtn;

	@FindBy(id = "react-burger-menu-btn")
	WebElement burgerMenu;

	@FindBy(xpath = "//*[text()='Logout']")
	WebElement logoutBtn;

	public void sortProductPriceAscending() {
		selectElementFromDropDown("selectbyvisibletext", sortOption, 0, "", "Price (low to high)");
	}

	public void addToCartAndMovetoCartPage() {
		clickOnElement(onesieAddToCartBtn);
		clickOnElement(cartBtn);
	}

	public void logout() {
		clickOnElement(burgerMenu);
		clickOnElement(logoutBtn);
	}
}
