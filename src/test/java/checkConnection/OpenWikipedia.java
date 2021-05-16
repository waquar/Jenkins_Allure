package checkConnection;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class OpenWikipedia {
	
	WebDriver driver;
	
	@Test
	public void openAmazon() throws InterruptedException {

		driver.get("https://www.wikipedia.com");
		Thread.sleep(5000);

			
	}

}
