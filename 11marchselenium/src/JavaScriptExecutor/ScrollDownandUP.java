package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownandUP {
	
	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver chrome driver", "C:\\Program Files\\Java\\jdk-19\\bin");
		
		WebDriver driver = new ChromeDriver();
		
		driver .manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver .get("https://www.w3schools.com/");
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		//ScrollDown
		
		Js.executeScript("window.scrollBy(0,9000)", "");
		Thread.sleep(4000);
		
		//ScrollUP
		Js.executeAsyncScript("window.scrollBy(0,-2000)", "");
		
		driver.quit();
		
	}
}
