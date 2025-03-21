package testPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseTest;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;

public class TC_RemoveProductFromCart_002_Test extends BaseTest {
	@Test
	public void removeProductfromCart() {
		WelcomePage wp = new WelcomePage(driver);

		wp.getElectronicsLink().click();

		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getcellPhoneLink().click();

		ep.getSmartPhoneAddToCartButton().click();

		wp.getShoppingCarLink().click();

		ShoppingCartPage sp = new ShoppingCartPage(driver);
		sp.getSmartphoneCheckbox().click();

		sp.getUpdateshoppingcartButon().click();

		SoftAssert sa = new SoftAssert();
		try {
			sa.assertEquals(sp.getSmartphoneCartProduct().isDisplayed(), true, "Product is removed from cart");
		} catch (Exception e) {
			Reporter.log("Product sremoved from cart", true);
		}
		sa.assertAll();

	}
}
