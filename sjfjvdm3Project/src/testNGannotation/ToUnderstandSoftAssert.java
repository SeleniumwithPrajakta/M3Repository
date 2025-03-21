package testNGannotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToUnderstandSoftAssert {
	@Test
	public void validLoginTC() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");

		String expectedWelcomepageTitle = "Demo Web Shop  "; // title with error
		String expectedLoinPageTitle = "Demo Web Shop. Login"; // title with error

		SoftAssert sa = new SoftAssert();
		sa.assertNotEquals(driver.getTitle(), expectedWelcomepageTitle, "Welcome Page Is Not Found");

		driver.findElement(By.linkText("")).click();

	}

}
