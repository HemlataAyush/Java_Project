package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mock1 {
	
	public static void main (String [] args) {
		
		System.setProperty("Webdriver chrome driver", "\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	
}
}