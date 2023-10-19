package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {
	
	public static void main (String [] args) {
System.setProperty("webdriver.chrome.driver ", "\"C:\\chromedriver_win32.zip\"");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fget-started");
		WebElement Input=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		System.out.println(Input.isDisplayed());
		driver.quit();
	
	}

}
