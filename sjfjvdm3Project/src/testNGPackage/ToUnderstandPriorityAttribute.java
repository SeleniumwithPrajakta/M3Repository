package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUnderstandPriorityAttribute {

	@Test(priority = -1)
	public void logIn() {
		Reporter.log("This is Login method", true);
	}

	@Test(priority = -5)
	public void register() {
		Reporter.log("This is register method", true);
	}

	@Test(priority = 1)
	public void moneyTransfer() {
		Reporter.log("This is Check Account Balance method", true);
	}

	@Test(priority = 5)
	public void transfer() {
		Reporter.log("This is Money Transfe method", true);
	}

	@Test(priority = 10)
	public void logOut() {
		Reporter.log("This is LogOut method", true);
	}
}
