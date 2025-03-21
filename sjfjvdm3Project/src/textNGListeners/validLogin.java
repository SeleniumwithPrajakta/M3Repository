package textNGListeners;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners
public class validLogin extends BaseTest {
	@Test
	public void validLogin() throws IOException {

		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();

		Flib flib = new Flib();
		String email = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 2, 4);
		String password = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 3, 4);

		LoginPage lp = new LoginPage(driver); // create the object of loginpage class
		// lp.validLoginMethods(email, password);

		// to perform login

		lp.getEmailTB().sendKeys(email);
		lp.getPasswordTB().sendKeys(password);
		lp.getLoginButton().click();

		// lp.getEmailTB().sendKeys(args);

	}

}
