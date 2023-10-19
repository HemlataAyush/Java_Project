package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait2 {
	
	private static By source;

	public static void main(String [] args) {
		
		System.setProperty("Webdriver chrome driver", "\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver ();
		
		driver .manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String URL ="https://www.facebook.com/";
		
		driver.get(URL);
		By input1 =By.id("email");
		By input2 = By.id("pass");
		
		Waitforfluent(driver,input1).sendKeys("Test");
		Waitforfluent(driver,input2).sendKeys("Test123");
	
		
	}
	
	public static WebElement Waitforfluent(WebDriver driver, final By Source) {
		Wait<WebDriver>MyWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(4))
				.ignoring(NoSuchElementException.class);
		
		WebElement Element = MyWait .until( new Function<WebDriver,WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				 
				return driver .findElement(Source);
			}
		});
		return Element;
		
	}
}
