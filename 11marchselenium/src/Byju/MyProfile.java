package Byju;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyProfile {
	
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("Webdriver chrome driver ", "\"C:\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://byjus.com/");
		//driver.findElement(By.xpath("")).click();
	  driver.findElements(By.xpath("(//img[@class=\"hidden-xs\"])[1]"));
	 


}
}