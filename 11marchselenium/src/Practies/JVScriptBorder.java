package Practies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JVScriptBorder {

	public static void main(String[] args) {

   WebDriverManager.chromedriver().setup();
   
   WebDriver driver = new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   driver.manage().window().maximize();
   
   driver.get("https://www.facebook.com/");
  WebElement Email = driver.findElement(By.id("email"));
  
     JavascriptExecutor js = (JavascriptExecutor)driver;
     js.executeScript("arguments[0].style.border ='15px.solide.red'", Email);

	}

}
