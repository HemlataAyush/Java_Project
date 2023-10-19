package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear {
	
	public static void main(String [] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver ", "\"C:\\chromedriver_win32.zip\"");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				
				Thread.sleep(200);
				driver.findElement(By.id("email")).sendKeys("girasedipali");
				Thread.sleep(2000);
				driver.findElement(By.id("email")).clear();
				Thread.sleep(2000);
				driver.findElement(By.id("email")).sendKeys("234345");
					Thread.sleep(2000);
					driver.findElement(By.id("email")).clear();
					
	}
	
}