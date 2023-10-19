package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class secondprogram {
	
	public static void main(String [] args) {
	
	//System.setProperty("webdriver.chrom.driver","\"C:\\chromedriver.exe\"");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
 
 driver.get("https://www.w3schools.com/html/html_tables.asp");
 
 JavascriptExecutor JS = (JavascriptExecutor) driver;
 
WebElement Element = driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
 
 JS.executeScript("arguments[0].scrollIntoView();", Element);
  
 //first way
 //Question1 - how many row in table
  int Row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
  System.out.println("Total no of Row ---"+Row);
  
  //second way
  List<WebElement> Row1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
  System.out.println("Total no of Row ---"+ Row1.size());
  
  // how many col in the table
  
  int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
  System.out.println("Total no of col ---"+col);
  
  //find out specific data
  //retrive method
  
  String Country = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[4]/td[3]")).getText();
  System.out.println(Country);
  
  for(int i = 2; i <= Row; i++) {
	  for(int j =1; j<= col; j++) {
		 String data = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
	   
	  
	   if(data.equals("Mexico")) {
		  
		  System.out.println("Row Number : "+ i +" : "+" Col Number"+ j +" ");
	  
	   break;
  }
  }
}
}
}


