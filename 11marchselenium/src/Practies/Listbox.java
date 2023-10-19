package Practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listbox {

	public static void main(String[] args) throws InterruptedException {

     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/");
     driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
     Thread.sleep(4000);
     driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Hemlata");
     driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Patel");
     driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("patel.hemlata2712@gmail.com");
     driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("Hemlata@2712#");
       WebElement Day = driver.findElement(By.id("day"));

      
       Select S1 = new Select(Day);
         List<WebElement> List1 = S1.getOptions();
         System.out.println(List1.size());
         
         for(int i=0; i< List1.size(); i++) {
        	 String DayList = List1.get(i).getText();
        	 System.out.println(DayList);
        	
        	 if(DayList.equals("27")) {
        		 List1.get(i).click();
        	 }
         }
      
       
      WebElement Month = driver.findElement(By.id("month"));
      Select S2 = new Select(Month);
      List<WebElement> List2 = S2.getOptions();
      System.out.println(List2.size());
      
      for(int j=0; j< List2.size(); j++) {
    	  String MonthList = List2.get(j).getText();
    	  System.out.println(MonthList);
    	  
      if(MonthList.equals("Dec")) {
    	List2.get(j).click();
      }
      
      
      }
      
      WebElement Year = driver.findElement(By.id("year"));
      Select S3 = new Select(Year);

     List<WebElement> List3 = S3.getOptions();
     System.out.println(List3.size());
     
     for(int k=0; k< List3.size(); k++) {
    	 List3.get(k).click();
     }
      
       driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
      
      
     
     

	}

}
