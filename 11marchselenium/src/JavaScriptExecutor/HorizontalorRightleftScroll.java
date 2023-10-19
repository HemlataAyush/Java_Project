package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalorRightleftScroll {
	
	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver chrome driver", "C:\\Program Files\\Java\\jdk-19\\bin");
		
		WebDriver driver = new ChromeDriver();
		
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
