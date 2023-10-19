package iFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe1 {
	public static void main (String [] agrs) {
		//System.setProperty("Webdriver chrome driver","\"C:\\chromedriver_win32.zip\"");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("singleframe");
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("automation");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		
	}

}
