package testNGdataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Loginwithdataprovider {

	@DataProvider(name = "logincreds")
	public String[][] dataProviderMethod() {
		String[][] data = { { "admin123@gmail.com", "manager@123" }, { "manager123@gmail.com", "data@123" },
				{ "querty123@gmail.com", "ytrevq4564" } };

		return data;
	}

	@Test(dataProvider = "logincreds")
	public void invalidloginTC(String email, String password) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");

		driver.findElement(By.linkText("log in")).click();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
	}
}
