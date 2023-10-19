package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBOxredbus {
	
	public static void main(String [] args) {
		
		System.setProperty("webDriver chrome driver", "\"C:\\chromedriver_win32.zip\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("pune");
		
		
	}

}
