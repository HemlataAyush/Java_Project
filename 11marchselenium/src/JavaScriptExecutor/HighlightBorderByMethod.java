package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightBorderByMethod {
	
	public static void main (String [] args ) {
		System.setProperty("webdriver chrome driver", "C:\\Program Files\\Java\\jdk-19\\bin");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement element = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		WebElement element1 = driver.findElement(By.id("email"));
	    WebElement element2 = driver.findElement(By.id("pass"));
	    
	    HighlightBorderByMethod.drawborder(driver, element);
	    HighlightBorderByMethod.drawborder(driver, element1);
	    HighlightBorderByMethod.drawborder(driver, element2);
	}
	
	public static void drawborder(WebDriver driver, WebElement element) {
	
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		Js.executeScript("arguments[0].style.border='15px solid red'", element);
		Js.executeScript("arguments[0].style.background='Yellow'", element);
	}


}
