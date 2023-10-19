package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {
	
	public static void main(String [] args) {
		
		System.setProperty("webDriver.chrome.driver", "\"C:\\chromedriver_win32.zip\"");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.className("db")).sendKeys("pune");
		driver.findElement(By.id("dest")).sendKeys("mumbai");
		
		driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();
	}
}
