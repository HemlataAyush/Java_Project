package ABC;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New {

	public static void main(String[] args) throws InterruptedException {

     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.redbus.com/");
     //WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Most popular bus routes')]"));
     WebElement bu =driver.findElement(By.id("src"));
     JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].value='" +"pune"+ "'",bu);
    
    
    
  
	}

}
