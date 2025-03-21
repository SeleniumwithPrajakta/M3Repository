package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	// declaration
	@FindBy(xpath = "//h1[text()='Shopping cart']/../..//img")
	private WebElement smartphoneCartProuct;

	// initialization
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public WebElement getSmartphoneCartProduct() {

		return smartphoneCartProuct;
	}

}
