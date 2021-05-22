package checkConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class OpenGsmarena {
	
	WebDriver driver;
	
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
	
	
	@Test(description="This test case validates Gsmarena home page")
	@Description("\"This test case validates Gsmarena home page title")
	@Severity(SeverityLevel.NORMAL)
	@Story("[ JIRA ID : SSV2-345 ] validate Gsmarena home page title")
	@Feature("validate correct title")
	@Step("I am validating correct title")
	public void opengsmarena() throws InterruptedException {		
		driver.get("https://www.gsmarena.com");
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(),"GSMArena.com - mobile phone reviews, news, specifications and more...");
	}
	
	

	
	// Using Icontext for setting driver so that everywhere drive reference will be same
	public void setDriver(ITestContext itestcontext, WebDriver driver ) {
		itestcontext.setAttribute("WebDriver", driver);
	}
	
	public static WebDriver getDriver(ITestContext itestcontext ) {
		return (WebDriver) itestcontext.getAttribute("WebDriver");
	}

}
