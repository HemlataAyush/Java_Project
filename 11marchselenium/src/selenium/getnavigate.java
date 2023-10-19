package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getnavigate {
	
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome .driver","\"C:\\chromedriver_win32.zip\"");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
   	driver.close();
		
	}

}
