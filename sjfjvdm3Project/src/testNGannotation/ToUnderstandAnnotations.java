package testNGannotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToUnderstandAnnotations {
	@BeforeTest
	public void beforeTestMethod() {
		Reporter.log("This is beforeTest method ", true);
	}

	@AfterMethod
	public void afterTestMethod() {
		Reporter.log("This is aftermethod ", true);
	}

	@BeforeSuite
	public void beforesuite() {
		Reporter.log("This is beforeSuite ", true);
	}

	@AfterSuite
	public void aftersuite() {
		Reporter.log("This is afterSuite ", true);

	}

	@BeforeClass
	public void beforeclass() {
		Reporter.log("This is beforeclass ", true);

	}

	@AfterClass
	public void afterclass() {
		Reporter.log("This is afterclass ", true);

	}

	@BeforeMethod
	public void beforemethod() {
		Reporter.log("This is beforemethod ", true);

	}

	@AfterMethod
	public void aftermethod() {
		Reporter.log("This is afterclass ", true);

	}

	@Test
	public void test() {
		Reporter.log("This is @test ", true);

	}

	@Test
	public void test2() {
		Reporter.log("This is @test2 ", true);

	}
}
