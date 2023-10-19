package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HorizontalRight {
	
	public static void main (String [] args) throws InterruptedException {
		
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);
		
		driver.manage().window().maximize();
		
		driver.get("https://blog.hubspot.com/website/horizontal-scrolling");
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		//ScrollDown 
		Js.executeScript("window.scrollBy(10000,0)", "");
		
		Thread.sleep(2000);
		
		//ScrollUP
		Js.executeScript("window.scrollBy(-2000,0)", "");
		
		driver.quit();
	
	}

}
