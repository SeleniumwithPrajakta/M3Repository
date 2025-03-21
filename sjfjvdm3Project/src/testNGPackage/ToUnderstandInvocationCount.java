package testNGPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToUnderstandInvocationCount {

	@Test(invocationCount = 2) // it will be invoked 2 times
	public void launchingSelenium() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://www.selenium.dev/");
	}

	@Test(invocationCount = 1) // it will be invoked 1 time

	public void launchingJavaTPoint() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://www.tpointtech.com/");
	}

}
