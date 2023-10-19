package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollByElement {
	public static void main(String [] args) {
//System.setProperty("webdriver chrome driver", "C:\\Program Files\\Java\\jdk-19\\bin");
	WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
	WebElement Name =driver.findElement(By.xpath("//h1[contains(text(),'W3Schools Space')]"));
	
	//scroll by element 
	
	Js.executeScript("arguments[0].scrollIntoView", Name);
	
		
	}

}
