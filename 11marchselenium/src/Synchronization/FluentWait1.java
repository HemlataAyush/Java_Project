package Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait1 {
	
	public static void main (String [] args) {
		
		System.setProperty("Webdriver chrome driver","\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		String URL ="https://www.facebook.com/";
		
		//System.out.println(URL);
		
		driver .get(URL);
		//fluent wait 
		//waiting for 20 second for an element to be present on the page .checking for its present
		//once every 5 seconds
		
		Wait<WebDriver>MyWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(4)).ignoring(NoSuchElementException.class);
		//usage of fluent wait 
		  WebElement Element =MyWait.until(new Function<WebDriver,WebElement>() {
			  
			  public WebElement apply (WebDriver driver) {
				  
				  return driver .findElement(By.id("email"));
			  }
			  
			  
		  });
		  Element.sendKeys("Test123");
			}
	}


