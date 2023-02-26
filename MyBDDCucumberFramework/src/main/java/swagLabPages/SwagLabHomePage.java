package swagLabPages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class SwagLabHomePage extends SeleniumUtility {
	WebDriver driver;

	public SwagLabHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@data-test='product_sort_container']")
	WebElement sortOption;

	@FindBy(xpath = "(//button[text()='Add to cart'])[1]")
	WebElement productAddToCartBtn;

	@FindBy(className = "shopping_cart_container")
	WebElement cartBtn;

	@FindBy(id = "react-burger-menu-btn")
	WebElement burgerMenu;

	@FindBy(xpath = "//*[text()='Logout']")
	WebElement logoutBtn;

	@FindBy(xpath = "(//div[@class='inventory_item_name'])[1]")
	WebElement productName;

	public void sortProductPriceAscending() {
		selectElementFromDropDown("selectbyvisibletext", sortOption, 0, "", "Price (low to high)");
	}

	public void sortProductPriceDescending() {
		selectElementFromDropDown("selectbyvisibletext", sortOption, 0, "", "Price (high to low)");
	}

	public String getProductName() {
		return productName.getText();
	}

	public boolean verifyProductInCart(String productName) {
		try {
			return verifyUIElementDisplayed(driver.findElement(By.xpath("//*[text()='" + productName + "']")));
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void addProductToCart() {
		clickOnElement(productAddToCartBtn);
	}

	public void navigateToCartPage() {
		clickOnElement(cartBtn);
	}

	public void logout() {
		clickOnElement(burgerMenu);
		clickOnElement(logoutBtn);
	}
}
