package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15));

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);

		driver.findElement(By.linkText("Log in"));

		WebElement email = driver.findElement(By.id("Email"));

		driver.navigate().refresh();// to refresh the webpage
		Thread.sleep(1000);

		driver.findElement(By.id("Email")).sendKeys("qspiders77@gmail.com"); // to find email again and perform operation
		Thread.sleep(1000);

		WebElement pass = driver.findElement(By.id("Password"));
		pass.sendKeys("Wakad@123");

		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginButton.click();

	}

}
