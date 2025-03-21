package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	// declaration
	@FindBy(xpath = "//h1[text()='Shopping cart']/../..//img[@title='Show details for Smartphone']")
	private WebElement smartphoneCartProuct;
	@FindBy(xpath = "//h1[text()='Shopping cart']/../..//img[@title='Show details for Smartphone']/../..//input[@name='removefromcart']")
	private WebElement smartphoneCheckbox;

	@FindBy(name = "updatecart")
	private WebElement updateshoppingcartButon;

	@FindBy(id = "termsofservice")
	private WebElement termsandOfServicesCheckbox;

	@FindBy(id = "checkout")
	private WebElement checkoutButton;

	public WebElement getSmartphoneCartProuct() {
		return smartphoneCartProuct;
	}

	public void setSmartphoneCartProuct(WebElement smartphoneCartProuct) {
		this.smartphoneCartProuct = smartphoneCartProuct;
	}

	public WebElement getSmartphoneCheckbox() {
		return smartphoneCheckbox;
	}

	public void setSmartphoneCheckbox(WebElement smartphoneCheckbox) {
		this.smartphoneCheckbox = smartphoneCheckbox;
	}

	public WebElement getUpdateshoppingcartButon() {
		return updateshoppingcartButon;
	}

	public void setUpdateshoppingcartButon(WebElement updateshoppingcartButon) {
		this.updateshoppingcartButon = updateshoppingcartButon;
	}

	public WebElement getTermsandOfServicesCheckbox() {
		return termsandOfServicesCheckbox;
	}

	public void setTermsandOfServicesCheckbox(WebElement termsandOfServicesCheckbox) {
		this.termsandOfServicesCheckbox = termsandOfServicesCheckbox;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

	public void setCheckoutButton(WebElement checkoutButton) {
		this.checkoutButton = checkoutButton;
	}

	// initialization
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public WebElement getSmartphoneCartProduct() {

		return smartphoneCartProuct;
	}

}
