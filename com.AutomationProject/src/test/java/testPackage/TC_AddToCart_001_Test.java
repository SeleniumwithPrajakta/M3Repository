package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseTest;
import genericLibrary.Flib;
import pomPackage.ElectronicsPage;
import pomPackage.LoginPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;

public class TC_AddToCart_001_Test extends BaseTest {
	@Test
	public void saddtoCart() throws IOException {

		WelcomePage wp = new WelcomePage(driver);

		wp.getElectronicsLink().click();

		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getcellPhoneLink().click();

		ep.getSmartPhoneAddToCartButton().click();

		wp.getShoppingCarLink().click();

		ShoppingCartPage sp = new ShoppingCartPage(driver);

		/*
		 * boolean result = sp.getSmartphoneCartProduct().isDisplayed();
		 * System.out.println(result);
		 */

		/*
		 * if (sp.getSmartphoneCartProduct().isDisplayed()) {
		 * System.out.println("Product is added to cart");
		 * 
		 * } else { System.out.println("Product is not added to cart ");
		 * 
		 * }
		 */

		// using assertion

		SoftAssert sa = new SoftAssert();

	}
}
