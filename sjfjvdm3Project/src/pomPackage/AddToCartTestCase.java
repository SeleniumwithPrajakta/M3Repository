package pomPackage;

import java.io.IOException;

public class AddToCartTestCase extends BaseTest {
	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.browserSetUp();

		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink();

		Flib flib = new Flib();
		String email = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 0);
		String password = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 1);

		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethods(email, password);

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

		if (sp.getSmartphoneCartProduct().isDisplayed()) {
			System.out.println("Product is added to cart");

		} else {
			System.out.println("Product is not added to cart ");

		}

	}
}
