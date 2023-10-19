package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox1_1 {
	
	public static void main(String [] args) throws InterruptedException {
		
		
		System.setProperty("webdriver. chrome driver ", "\"C:\\chromedriver_win32.zip\"");
		
                WebDriver driver= new ChromeDriver();
                
                driver.get("https://www.instagram.com/accounts/login/");
                driver.manage().window().maximize();
                Thread.sleep(2000);
                
             driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("girasedipali");
             
              driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("1234");
              
              driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
              driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
              
             
             
         
               
	}              

}
