package textNGListeners;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConst {

	static WebDriver driver;

	@BeforeMethod
	public void browserSetUp() throws IOException {

		// driver.new ChromeDriver;
		// driver.manage().window().maximize();
		// driver.get("");

		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "chrome");
		String url = flib.readPropertyData(PROP_PATH, URL);

		if (browserValue.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browserValue.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else if (browserValue.equalsIgnoreCase("edge"))

		{
			driver = new EdgeDriver();
		} else {
			System.out.println("enter valid browser name");
		}

		// to avoid writing in each and every block

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);

	}

	@AfterMethod
	public void browserTearDown() {
		driver.quit();
	}
}
