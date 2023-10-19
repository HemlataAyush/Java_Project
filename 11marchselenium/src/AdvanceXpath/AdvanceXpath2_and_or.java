package AdvanceXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class AdvanceXpath2_and_or{
public static void main (String [] args) {
		
		ChromeDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//Xpath with or
		
		// A            B               Result
		// False       False          No element
		// True        False          Return true 
		// False       True           Return true
		// True        True           Return true
		
		//driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Ankush");
		//driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Rajput");
		
		//1   False         False         No element
	   
	 //	driver.findElement(By.xpath("//input[@placeholder=\"First Nam\" or @type=\"te\"]")).sendKeys("Test");
		
		//2  True    False     Retrun True
		
	   driver.findElement(By.xpath("//input[@placeholder=\"First Name\" or @type=\"te\"]")).sendKeys("Test");
 
		//3  False     True    Retrun True
		driver.findElement(By.xpath("//input[@placeholder=\"First Nam\" or @type=\"text\"]")).sendKeys("Test");
		 
		//4   True     True    Retrun True
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\" or @type=\"te\"]")).sendKeys("Test");
		 
       //Xpath  with   and
     
	//   A         B           Result
	//  False	  False        No Elements
	//  True	  False        No Elements
	//  False	  True         No Elements
	//  True	  True	       Return true
		
		//driver.findElement(By.xpath("//input[@placeholder=\"First Nam\" and @type=\"te\"]")).sendKeys("Test");

		//driver.findElement(By.xpath("//input[@placeholder=\"First Name\" and @type=\"te\"]")).sendKeys("Test");

		//driver.findElement(By.xpath("//input[@placeholder=\"First Nam\" and @type=\"text\"]")).sendKeys("Test");

		driver.findElement(By.xpath("//input[@placeholder=\"First Name\" and @type=\"text\"]")).sendKeys("Test");
}
}
