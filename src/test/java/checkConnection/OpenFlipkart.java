package checkConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class OpenFlipkart {
	
	WebDriver driver;
	ExtentReports report = new ExtentReports("index1.html");
	
	@BeforeSuite
	public void setupBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	
	@AfterSuite
	public void tearDownBorowser() {	

		driver.quit();
		
	}
	
	@Test
	public void openAmazon() throws InterruptedException {

		ExtentTest logger = report.startTest("Test Started").assignCategory("Regression").assignAuthor("Waquar");
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		
		logger.log(LogStatus.PASS, "Test Case Passed");
		
		report.endTest(logger);
		report.flush();
		report.close();

	}

}
