package textNGListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// declaration

	@FindBy(id = "Email")
	private WebElement emailTB;
	@FindBy(id = "Password")
	private WebElement passwordTB;
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	@FindBy(id = "RememberMe")
	private WebElement remeberMeCheckbox;
	@FindBy(linkText = "Forgot password")
	private WebElement forgotPasswordLink;

	// initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public WebElement getEmailTB() {
		return emailTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getRemeberMeCheckbox() {
		return remeberMeCheckbox;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public void validLoginMethods(String email, String password) {
		emailTB.sendKeys(email);
		passwordTB.sendKeys(password);
		loginButton.click();
	}

	public void invalidLoginMethod(String email, String password) throws InterruptedException {
		emailTB.sendKeys(email);
		passwordTB.sendKeys(password);
		loginButton.click();
		Thread.sleep(2000);
		emailTB.clear();
		passwordTB.clear();

	}

}
