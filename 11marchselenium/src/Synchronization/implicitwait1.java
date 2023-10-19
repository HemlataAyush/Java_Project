package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait1 {
	
	public static void main (String [] args) {
		System.setProperty("Webdriver chrome driver", "\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		
		driver.manage().window().maximize();
		
		String URL ="https://www.w3schools.com/";
		
		driver.get(URL);
		
		driver.findElement(By.id("search2")).sendKeys("Automation");
		
	String element=	driver.findElement(By.xpath("//h1[@class=\"learntocodeh1\"]")).getText();
	System.out.println(element);
		
		driver.quit();

		
	}	

}