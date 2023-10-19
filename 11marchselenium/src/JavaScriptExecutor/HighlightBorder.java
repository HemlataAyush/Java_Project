package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightBorder {
	
	public static void main (String [] args ) {
		System.setProperty("webdriver chrome driver", "C:\\Program Files\\Java\\jdk-19\\bin");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement element = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		WebElement element1 = driver.findElement(By.id("email"));
		
		Js.executeScript("arguments[0].style.border='15px solid red'", element);
		Js.executeScript("arguments[0].style.border='5px solid yellow'", element1);
	}


}
