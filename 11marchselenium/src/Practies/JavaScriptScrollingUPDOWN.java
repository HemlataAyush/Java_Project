package Practies;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptScrollingUPDOWN {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement Text = driver.findElement(By.xpath("//span[contains(text(),'Frequently repurchased in Drugstore')]"));
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		//ScrollDown
		//JS.executeScript("window.scrollBy(0,400)", "" );
		//ScrollUp
		//JS.executeScript("window.scrollBy(0,-500)", "");
		//ScrollRight
		//JS.executeScript("window.scrollBy(600,0)","");
		//ScrollLeft
		//JS.executeScript("window.scrollBy(-800,0)", "");
		
		//JS.executeScript("arguments[0].scrollIntoView",Text);
		
		JS.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		Thread.sleep(5000);
		JS.executeScript("document.documentElement.scrollTop=0", "");
		Thread.sleep(5000);
		driver.quit();

	}

}
