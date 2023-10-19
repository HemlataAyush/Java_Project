package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldownanduppp {
	public static void main (String [] args ) {
		System.setProperty("webdriver chrome driver",  "\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement Name = driver .findElement(By.xpath("//h1[contains(text(),'W3Schools Spaces')]"));
		
		//scrollby element
		js.executeScript("arguments[0].scrollIntoView();", Name);
		
		
	}

}
