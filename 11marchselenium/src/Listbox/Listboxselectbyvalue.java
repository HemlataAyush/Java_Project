package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxselectbyvalue {

		public static void main (String [] args) throws InterruptedException {
				//without select class
				System.setProperty("webdriver.chrom.driver",  "\"C:\\chromedriver_win32.zip\"");
			
			         WebDriver driver=new ChromeDriver(); 
			         driver.get("https://www.facebook.com/");
			         
			         driver.manage().window().maximize();
			         
			         driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
			         Thread.sleep(2000);
			         driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("Rohit");
			          driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Rajput");
			 	       driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("9373574331");
			            driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("12345");
			            
			         WebElement Day=   driver.findElement(By.id("day"));
			   	     
			   	 WebElement Month  =    driver.findElement(By.id("month"));
			   	   
			   	WebElement Year=    driver.findElement(By.id("year"));
			   	
			   	Select Select1 = new Select(Day);
			   Select1.	selectByValue("4");
			    
			   Select Select2 = new Select(Month);
			   Select2.selectByValue("1");
			   
			   Select Select3 = new Select(Year);
			   Select3.selectByValue("1999");
			      
			      
			        
			       
			   	    
		    
			   	          
  	        
			   	  
			            
		              
	
	
		}
	}


