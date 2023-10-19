package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled {
	public static void main (String [] args) {
		System.setProperty("webdriver.chrome.driver ", "\"C:\\chromedriver_win32.zip\"");
		
				WebDriver driver =new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				
				Boolean B1 = driver.findElement(By.xpath("//button[@id=\"loginbutton\"]")).isDisplayed();
				
				System.out.println(B1);
				
				
				
	}				

}
