package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait2 {
	static WebDriver driver;
	
	public static void main (String [] args) {
		
		System.setProperty("webdriver chrome driver","\"C:\\chromedriver.exe\"");
		
	    driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		WebDriverWait MyWait =  new WebDriverWait(driver,Duration.ofSeconds(20));
		
		WebElement Element = MyWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("src")));
		
		By input1 = By.id("src");// local variable intiatization
		Waitforelement(driver, input1, 30).sendKeys("pune");
		
		By input2=By.id("dest");
		Waitforelement(driver,input2,30).sendKeys("Mumbai");
		
	}
	  public static WebElement Waitforelement(WebDriver driver,By Locator, int timeout) {
		  WebDriverWait MyWait =new WebDriverWait(driver,Duration.ofSeconds(timeout));
		  
		  MyWait.until(ExpectedConditions.presenceOfElementLocated(Locator));
		  
		  
		return driver.findElement(Locator);
		  
	  }


}
