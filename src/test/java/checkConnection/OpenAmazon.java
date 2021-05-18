package checkConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

@Listeners(allureListener.class)
public class OpenAmazon{
	
	static WebDriver driver;
	
	
	@BeforeClass
	public void setupBrowser(ITestContext itestcontext) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		this.setDriver(itestcontext, driver);
		driver.manage().window().maximize();
	
	}
	
	
	@AfterClass
	public void tearDownBrowser(ITestContext itestcontext) {	
		driver.quit();	
	}
	
	@Test(description="This test case validates google home page")
	@Description("\"This test case validates google home page title")
	@Severity(SeverityLevel.BLOCKER)
	@Story("[ JIRA ID : SSV2-345 ] validate Gooogle home pae title")
	@Feature("validate wrong title")
	@Step("I am validating wrong title")
	public void openAmazon(ITestContext itestcontext) throws InterruptedException {
		
		
		driver.get("https://www.google.com");
		Assert.assertEquals(driver.getTitle(), "Gooogle");	
		Thread.sleep(5000);
		
		
	}

	@Test(description="This test case validates google home page")
	@Description("\"This test case validates google home page title")
	@Severity(SeverityLevel.NORMAL)
	@Story("[ JIRA ID : SSV2-345 ] validate Gooogle home page title")
	@Feature("validate correct title")
	@Step("I am validating correct title")
	public void opengoogle(ITestContext itestcontext) throws InterruptedException {
		
		
		driver.get("https://www.google.com");
		Assert.assertEquals(driver.getTitle(), "Google");		
		Thread.sleep(5000);
		
		
	}
	
	// Using Icontext for setting driver so that everywhere drive reference will be same
	public void setDriver(ITestContext itestcontext, WebDriver driver ) {
		itestcontext.setAttribute("WebDriver", driver);
	}
	
	public static WebDriver getDriver(ITestContext itestcontext ) {
		return (WebDriver) itestcontext.getAttribute("WebDriver");
	}

}
