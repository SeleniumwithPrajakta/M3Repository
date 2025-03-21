package pomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.BaseTest;
import genericLibrary.Flib;
import genericLibrary.SelectUtility;

public class CheckoutPage extends BaseTest {

	@FindBy(id = "")
	private WebElement countryDD;

	@FindBy(id = "")
	private WebElement cityTB;

	@FindBy(id = "")
	private WebElement address1TB;

	@FindBy(id = "")
	private WebElement pincodeTB;

	@FindBy(id = "")
	private WebElement phoneNoTB;

	@FindBy(xpath = "")
	private WebElement billingAddressConinueButton;

	@FindBy(xpath = "")
	private WebElement shippingAddressContinueButton;

	@FindBy(xpath = "")
	private WebElement shippingMethodContinueButton;

	@FindBy(xpath = "")
	private WebElement paymentMethodContinueButton;

	@FindBy(xpath = "")
	private WebElement paymentInfoContinueButton;

	@FindBy(xpath = "")
	private WebElement confirmOrderConfirmButton;

	@FindBy(xpath = "")
	private WebElement orderProcessedText;

	// intialization

	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public WebElement getCountryDD() {
		return countryDD;
	}

	public void setCountryDD(WebElement countryDD) {
		this.countryDD = countryDD;
	}

	public WebElement getCityTB() {
		return cityTB;
	}

	public void setCityTB(WebElement cityTB) {
		this.cityTB = cityTB;
	}

	public WebElement getAddress1TB() {
		return address1TB;
	}

	public void setAddress1TB(WebElement address1tb) {
		address1TB = address1tb;
	}

	public WebElement getPincodeTB() {
		return pincodeTB;
	}

	public void setPincodeTB(WebElement pincodeTB) {
		this.pincodeTB = pincodeTB;
	}

	public WebElement getPhoneNoTB() {
		return phoneNoTB;
	}

	public void setPhoneNoTB(WebElement phoneNoTB) {
		this.phoneNoTB = phoneNoTB;
	}

	public WebElement getBillingAddressConinueButton() {
		return billingAddressConinueButton;
	}

	public void setBillingAddressConinueButton(WebElement billingAddressConinueButton) {
		this.billingAddressConinueButton = billingAddressConinueButton;
	}

	public WebElement getShippingAddressContinueButton() {
		return shippingAddressContinueButton;
	}

	public void setShippingAddressContinueButton(WebElement shippingAddressContinueButton) {
		this.shippingAddressContinueButton = shippingAddressContinueButton;
	}

	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}

	public void setShippingMethodContinueButton(WebElement shippingMethodContinueButton) {
		this.shippingMethodContinueButton = shippingMethodContinueButton;
	}

	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}

	public void setPaymentMethodContinueButton(WebElement paymentMethodContinueButton) {
		this.paymentMethodContinueButton = paymentMethodContinueButton;
	}

	public WebElement getPaymentInfoContinueButton() {
		return paymentInfoContinueButton;
	}

	public void setPaymentInfoContinueButton(WebElement paymentInfoContinueButton) {
		this.paymentInfoContinueButton = paymentInfoContinueButton;
	}

	public WebElement getConfirmOrderConfirmButton() {
		return confirmOrderConfirmButton;
	}

	public void setConfirmOrderConfirmButton(WebElement confirmOrderConfirmButton) {
		this.confirmOrderConfirmButton = confirmOrderConfirmButton;
	}

	public WebElement getOrderProcessedText() {
		return orderProcessedText;
	}

	public void setOrderProcessedText(WebElement orderProcessedText) {
		this.orderProcessedText = orderProcessedText;
	}

	// business logic

	public void buyProduct() throws EncryptedDocumentException, IOException {
		SelectUtility su = new SelectUtility();
		su.selectByVisibleTextMethod(countryDD, "India");

		Flib flib = new Flib();
		int rn = flib.randomNumber();
		String city = flib.readExcelData(EXCEL_PATH_MAIN, "buyproductdetails", 1, 0);
		String address1 = flib.readExcelData(EXCEL_PATH_MAIN, "buyproductdetails", 1, 1);
		String pin = flib.readExcelData(EXCEL_PATH_MAIN, "buyproductdetails", 1, 2);
		String phone = flib.readExcelData(EXCEL_PATH_MAIN, "buyproductdetails", 1, 3);

		String phoneNo = phone + "" + rn;

		cityTB.sendKeys(city);

	}

}
