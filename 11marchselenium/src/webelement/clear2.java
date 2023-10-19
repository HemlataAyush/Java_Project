package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear2 {
	
	public static void main (String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver ", "\"C:\\chromedriver_win32.zip\"");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				
			WebElement qrty =	driver.findElement(By.id("email"));
		
			qrty.sendKeys("12344");
			Thread.sleep(2000);
			qrty.clear();
			Thread.sleep(2000);
			
			qrty.sendKeys("2345");
			Thread.sleep(2000);
			qrty.clear();
			
			qrty.sendKeys("dipaligirase03@gmail.com");
			Thread.sleep(2000);
			qrty.clear();
			
			qrty.sendKeys("nutandhomse");
			Thread.sleep(2000);
			qrty.clear();
			
			driver.close();
			driver.quit();
				
	}

}

