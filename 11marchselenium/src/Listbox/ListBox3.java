package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3 {

public static void main (String [] args) throws InterruptedException {
	//without 
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
     	
     	String DOB ="23/Mar/2019";
     	String [] Date=DOB.split("/");
     	//0-23
     	//1-4
     	//2-2019
     	
     	ListBox(Day,Date[0]);
     	ListBox(Month,Date[1]);
     	ListBox(Year,Date[2]);
     	
     	//ListBox(Day,"22");
     	//ListBox(Month,"3");
     	//ListBox(Year,"2019");
     	

     	
  
     	
     	

}

private static void ListBox(WebElement element, String Text) {
	

	Select Select1 = new Select(element);
	Select1.selectByVisibleText(Text);
	
}
}
