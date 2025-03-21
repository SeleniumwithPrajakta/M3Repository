package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	// Declaration
	// @annotaion infomation given to compiler and end user
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;
	@FindBy(xpath = "//span[text()='Wishlist'")
	private WebElement whishlistLink;
	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksLink;
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computersLink;
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicsLink;

	// Initialization
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCarLink() {
		return shoppingCartLink;
	}

	public WebElement getWhishlistLink() {
		return whishlistLink;
	}

	public WebElement getBooksList() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

}
