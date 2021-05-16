package checkConnection;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class OpenAmazon extends Testbase{
	
	static WebDriver driver;
	
	
	@BeforeTest
	public void setupBrowser() {
		
		Testbase testbase = new Testbase();
		testbase.initializeDriver();
		driver = getDriver();
	
	}
	
	
	@AfterTest
	public void tearDownBrowser() {	
		driver.quit();	
	}
	
	@Test(description="This test case validates google home page")
	@Description("\"This test case validates google home page title")
	@Severity(SeverityLevel.BLOCKER)
	@Story("[ JIRA ID : SSV2-345 ] validate Gooogle home pae title")
	@Feature("validate wrong title")
	@Step("I am validating wrong title")
	public void openAmazon() throws InterruptedException {
		
		
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
	public void opengoogle() throws InterruptedException {
		
		
		driver.get("https://www.google.com");
		Assert.assertEquals(driver.getTitle(), "Google");		
		Thread.sleep(5000);
		
		
	}
}
