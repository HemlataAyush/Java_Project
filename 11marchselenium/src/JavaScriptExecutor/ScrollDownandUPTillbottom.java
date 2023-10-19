package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownandUPTillbottom {
	
	public static void main (String [] args) throws InterruptedException {
		
System.setProperty("webdriver chrome driver", "C:\\Program Files\\Java\\jdk-19\\bin");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		//srolldown 
		
		Js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
		Thread.sleep(4000);
		
		//ScrollUp
		Js.executeScript("document.documentElement.scrollTop=0", "");
		
		driver.quit();
		
	}

}
