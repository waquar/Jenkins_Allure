package checkConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class OpenGsmarena {
	
	WebDriver driver;
	
	@Test
	public void opengsmarena() throws InterruptedException {		
		driver.get("https://www.gsmarena.com");
		Thread.sleep(5000);
	}
	
	public static void filldata(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("waquar");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@title='Search']")).clear();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("alam");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Google Search'][1]")).click();
		
		
	}

}
