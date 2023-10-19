package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First1_1 {
	
	public static void main (String [] args) throws InterruptedException {
		
          WebDriverManager.chromedriver().setup();
          
          WebDriver driver = new ChromeDriver();
                
          driver.manage().window().maximize();
                
          driver.get("https://demo.automationtesting.in/Register.html");
          
      //  driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("dipali");
          
          WebElement obj=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")) ;
          
          obj.sendKeys("pavan");
          
          Thread.sleep(1000);
          
          obj.clear();
          
          obj.sendKeys("dipali");
          
          obj.sendKeys("Nisha");
                  
                   
	}
}