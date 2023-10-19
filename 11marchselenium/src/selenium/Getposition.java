package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getposition {
	
	public static void main (String [] args ) throws InterruptedException {
		
		System.setProperty("webdriver.chrome .driver","\"C:\\chromedriver_win32.zip\"");
				
		WebDriver driver =new ChromeDriver();
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(1000);
		
		System.out.println(driver.manage().window().getPosition());
		
		driver.close();
	}		

}
