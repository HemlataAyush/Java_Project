package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbycontain {
	
	public static void main(String [] args) {
System.setProperty("webdriver.chrome.driver ", "\"C:\\chromedriver_win32.zip\"");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("dipaligirase03@gmail");

		driver.findElement(By.xpath("//input[contains(@class,\'inputtext _55r1 _6luy _9npi\')]")).sendKeys("123");
		driver.findElement(By.xpath("//button[contains(@class,\'_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy\')]")).click();
		
	
		
	}

}
