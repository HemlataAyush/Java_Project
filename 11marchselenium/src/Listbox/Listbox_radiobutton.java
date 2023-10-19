
package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox_radiobutton {
	public static void main ( String [] args ) throws InterruptedException {
		
		System.setProperty("webdriver .chrome driver","\\\"C:\\\\chromedriver_win32.zip\\\"");
		
		    WebDriver driver = new ChromeDriver();
		    
		    driver.manage().window().maximize();
            driver.get("https://www.facebook.com/");
		       
	        
	        driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).isSelected();
	        driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("dipaligirase@gmail.com");
	        
	        driver.findElement(By.xpath("//input[@type=\"password\"]")).isSelected();
	        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("1234");
	        
	        
	        driver.findElement(By.xpath("//a[contains(@class,'42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")).click();
	        Thread.sleep(2000);
	         driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("dipali");
	         driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Rajput");
	         driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("9601005247");
	         driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]")).sendKeys("pavan143");
	         driver.findElement(By.id("day")).click();
	            driver.findElement(By.xpath("//option[@value=\"3\"]")).click();
	            
	            driver.findElement(By.id("month")).click();
	            driver.findElement(By.xpath("//option[contains(text(),'May')]")).click();
	            
	            driver.findElement(By.id("year")).click();
	            driver.findElement(By.xpath("//option[@value=\"2020\"]")).click();
	      
	            driver.findElement(By.xpath("//input[@id=\"u_2_5_nd\"]")).click();
	              boolean B4 = driver.findElement(By.xpath("//input[@id=\"u_2_5_nd\"]")).isSelected();
	           System.out.println(B4);
	            
	          driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
	          boolean x2 = driver.findElement(By.xpath("//input[@value=\"2\"]")).isSelected();
	          System.out.println(x2);
	          
	          
	        
	        
	            
	         
	}
}