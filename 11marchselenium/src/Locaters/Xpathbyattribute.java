package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyattribute {
	
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver ", "\"C:\\chromedriver_win32.zip\"");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
    //  driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("girasedipali03gmail.com");
       
  //   driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123");
     
   //  driver.findElement(By.xpath("//button[@id=\"loginbutton\"]")).click();
     driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
        
      
	}

}
