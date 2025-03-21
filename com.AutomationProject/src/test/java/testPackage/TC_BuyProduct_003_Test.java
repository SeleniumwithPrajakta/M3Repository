package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomPackage.CheckoutPage;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;

public class TC_BuyProduct_003_Test extends BaseTest {
	@Test
	public void BuyProductMethod() throws EncryptedDocumentException, IOException {

		WelcomePage wp = new WelcomePage(driver);
		wp.getElectronicsLink().click();

		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getcellPhoneLink().click();

		ep.getSmartPhoneAddToCartButton().click();

		ShoppingCartPage sp = new ShoppingCartPage(driver);
		sp.getCheckoutButton().click();

		sp.getTermsandOfServicesCheckbox().click();
		sp.getCheckoutButton().click();

		CheckoutPage cp = new CheckoutPage(driver);
		cp.buyProduct();

	}
}
