package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1 {
	
public static void main(String [] args) throws InterruptedException {
		
		
		System.setProperty("webdriver. chrome driver ", "\"C:\\chromedriver_win32.zip\"");
		
                WebDriver driver= new ChromeDriver();
                driver.get("https://www.facebook.com/");
                
                driver.manage().window().maximize();
                driver.findElement(By.xpath("//input[@id=\"email\"]")).click();
                driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("dipaligirase@gmail.com");
                
                driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("12334");
                
                driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
               Thread.sleep(2000);
                driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("Rohit");
		          driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Rajput");
		 	       driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("9373574331");
		            driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("12345");
	            
	       driver.findElement(By.id("day")).click();
	    driver.findElement(By.xpath("//option[@value=\"5\"]")).click();
	     
	     
	    driver.findElement(By.id("month")).click();
	    driver.findElement(By.xpath("//option[contains(text(),'Apr')]")).click();
	     
	     
	    driver.findElement(By.id("year")).click();
	   driver.findElement(By.xpath("//option[@value=\"1996\"]")).click();
	   
	   driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
	   boolean B1 = driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
	   System.out.println(B1);
	   
	   driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
	   boolean  B2 =   driver.findElement(By.xpath("//input[@value=\"2\"]")).isSelected();
	   System.out.println(B2);
	   
	   driver.findElement(By.xpath("//input[@value=\"-1\"]")).click();
	   boolean B3 = driver.findElement(By.xpath("//input[@value=\"-1\"]")).isSelected();
	   System.out.println(B3);
	   
	   WebElement obj =   driver .findElement(By.xpath("//select[@name=\"preferred_pronoun\"]"));
	   obj.click();
	   
	  WebElement dropdown = driver.findElement(By.xpath("value=\"1\""));
	  dropdown.isSelected();
	     
	          
	         
	  
	    		
	         
      
}      
	      

}
