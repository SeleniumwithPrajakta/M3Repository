package pomPackage;

import java.io.IOException;

public class InvalidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.browserSetUp();

		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();

		Flib flib = new Flib();
		int rc = flib.lastRowCount(EXCEL_PATH, INVALID_LOGINCREDS);

		LoginPage lp = new LoginPage(driver);

		for (int i = 0; i <= rc; i++) {
			String email = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, i, 0);
			String password = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, i, 1);

			// LoginPage lp = new LoginPage(driver); // create the object of loginpage class
			lp.invalidLoginMethod(email, password);
		}
	}

}
