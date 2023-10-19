package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox2 {

	public static void main (String [] args) throws InterruptedException {
			//without select class
		//	System.setProperty("webdriver.chrom.driver",  "\"C:\\chromedriver_win32.zip\"");
		  WebDriverManager.chromedriver().setup();
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
		        	Select Select1=new Select(Day);
		        	//selectByvisibleText(String text)
		        	Select1.selectByVisibleText("4");
		        	
		        	Select Select2 =new Select(Month);
		        	//selectByvisibleText	(String Text)
		        	Select2.selectByVisibleText("Mar");
		        	
		        	Select Select3=new Select(Year);
		        	//selectByvisibletext (String TexT)
		        Select3.selectByVisibleText("2022");
		        
		        driver.quit();
		   	    
		   	    
		   	          
		   	        
		   	  
		            
	              

	}
}