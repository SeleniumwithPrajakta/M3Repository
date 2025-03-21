package textNGListeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListern extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("---test---" + result.getName() + "Started", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("---test---" + result.getName() + "succeeded", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String ltd = LocalDateTime.now().toString();
		String failedmethodname = result.getName();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorshots" + failedmethodname + "/.png");

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		Reporter.log("---test---" + result.getName() + "skipped", true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("---test---" + result.getName() + "failed with success percentage", true);

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("---test---" + result.getName() + "failed with timeout", true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("---test---" + context.getName() + " is Started", true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("---test---" + context.getName() + "finished", true);

	}

}
