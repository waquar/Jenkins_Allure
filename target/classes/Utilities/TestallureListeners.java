import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Attachment;
import checkConnection.Testbase;


public class TestallureListeners implements ITestListener {

	@override
	public void onTestFailure(ITestResult result) {
		saveScreenshotOnFailure(Testbase.getDriver());
		saveLogs(result.getMethod().getConstructorOrMethod().getName());
	
	}
	
	@Attachement(value="Screenshot", type = "image/png")
	public byte[] saveScreenshotOnFailure(WebDriver driver) {
		return ((TakesScreenshot)driver).getScreenshotsAs(OutputType.BYTES);
	}
	
	@Attachement(value="Staketrace", type="text/plain")
	public static String saveLogs(String message) {
		return message;
	}
	

}
