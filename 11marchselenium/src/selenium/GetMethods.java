package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	
	// 1 get method is used to open application or t enter the URL on web browser
		
		public static void main (String [] args ) throws InterruptedException {
	
		System.setProperty("webdriver.chrome .driver","\"C:\\chromedriver_win32.zip\"");
				
		WebDriver driver =new ChromeDriver();
		
		//step 3 
		driver.get("https://www.facebook.com/");
		
		Thread. sleep  (10000);
		
		driver.close();
		
		
	}

}
