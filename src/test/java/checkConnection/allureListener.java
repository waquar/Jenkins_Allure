package checkConnection;

import java.io.ByteArrayInputStream;
import java.util.UUID;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import io.qameta.allure.Allure;

public class allureListener extends TestListenerAdapter {

	@Override
	public void onTestFailure(ITestResult result) {	
		
		System.out.println("Execution on Test Failure");
		
		WebDriver driver = OpenAmazon.getDriver(result.getTestContext());
		
		try {
			Allure.addAttachment(UUID.randomUUID().toString(), new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}


		
		
}



