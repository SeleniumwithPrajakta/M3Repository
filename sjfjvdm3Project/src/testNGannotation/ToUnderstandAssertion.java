package testNGannotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToUnderstandAssertion {
	@Test
	public void validLoginTC() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");

		String expectedWelcomepageTitle = "Demo Web Shop  "; // title with error
		String expectedLoinPageTitle = "Demo Web Shop. Login"; // title with error

		Assert.assertEquals(driver.getTitle(), expectedWelcomepageTitle, "Welcome Page is not Found!!!");

		driver.findElement(By.linkText("Log in")).click();
		Assert.assertEquals(driver.getTitle(), expectedLoinPageTitle, "Login Page Is Not Found!!!");

		Assert.assertTrue(driver.getTitle().equals(expectedLoinPageTitle), "Login Page Is Not Found!!!");

		driver.findElement(By.id("Email")).sendKeys("qspiders77@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Wakad@123");

		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
	}

}
