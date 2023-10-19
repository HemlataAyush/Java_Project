package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	
	public static void main (String [] args) {
		 
		System.setProperty("webDriver .chrome. driver", "\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("dipali");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Rajput");
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("chandraanand appartment karvand naka shirpur");
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("dipaligirase2@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("9373574331");
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Cricket\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Movies\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Hockey\"]")).click();
	     
	  

		 
		 
	 
	     
	     
		
	
	    
	
	

		
	}
}
