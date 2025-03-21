package pomPackage;

import java.io.IOException;

public class validLogin extends BaseTest {
	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.browserSetUp();

		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();

		Flib flib = new Flib();
		String email = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 0);
		String password = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 1);

		LoginPage lp = new LoginPage(driver); // create the object of loginpage class
		// lp.validLoginMethods(email, password);

		// to perform login

		lp.getEmailTB().sendKeys(email);
		lp.getPasswordTB().sendKeys(password);
		lp.getLoginButton().click();

		// lp.getEmailTB().sendKeys(args);

	}

}
