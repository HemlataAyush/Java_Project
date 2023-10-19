package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {
	
	
				
	


		
		public static void main (String [] args ) throws InterruptedException {
			// 1 get method is used to open application or t enter the URL on web browser
			
			// 1 step 
			System.setProperty("webdriver.chrome .driver","\"C:\\chromedriver_win32.zip\"");
					
			WebDriver driver =new ChromeDriver();
			
			//step 3 
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(100);
			
			driver.close();
			
		

		
	}

}
