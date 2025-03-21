package readExcelData;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin extends BaseTest implements IAutoConst {
	public static void main(String[] args) throws IOException, InterruptedException {

		Flib flib = new Flib();
		BaseTest bt = new BaseTest();
		bt.browserSetUp();

		driver.findElement(By.linkText("Log in")).click();
		int rc = flib.lastRowCount(EXCEL_PATH, INVALID_LOGINCREDS);
  
		for (int i = 0; i <= 4; i++) {

			String email = flib.readExcelData(EXCEL_PATH, INVALID_LOGINCREDS, i, 0);
			String password = flib.readExcelData(EXCEL_PATH, INVALID_LOGINCREDS, i, 1);

			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("Email")).clear();
			driver.findElement(By.id("Password")).clear();
		}
		Thread.sleep(1000);
		

	}
}
