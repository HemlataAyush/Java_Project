package Locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
	
	public static void main (String [] args) {
	
			System.setProperty("webdriver.chrome.driver ", "\"C:\\chromedriver_win32.zip\"");
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			
		
	}

	
				
	
	

}
