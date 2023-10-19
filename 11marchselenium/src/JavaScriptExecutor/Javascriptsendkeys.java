package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptsendkeys {

	public static void main(String[] args) {
		
    // System.setProperty("webdriver chrome driver", "C:\\Program Files\\Java\\jdk-19\\bin");
		WebDriverManager.chromedriver().setup();
	 WebDriver driver =  new  ChromeDriver();
		
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.facebook.com/");
	 
	 WebElement Username = driver.findElement(By.id("email"));
	 
	 WebElement Password = driver.findElement(By.id("pass"));
	 
	 JavascriptExecutor JS = (JavascriptExecutor)driver;
	 
	// JS.executeScript("document.getElementById('email').value='Test12';");
	// JS.executeScript("document.getElementById('pass').value='Test1234';");
	 
	 //SecondWay
	 
	 JS.executeScript("arguments[0].value='"+ "Test" +"';", Username);
	 JS.executeScript("arguments[0].value='"+ "Test123" +"';", Password);
		

	}

}
