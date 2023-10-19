package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alllocators {
	
	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrom.driver",  "\"C:\\chromedriver_win32.zip\"");
	
	         WebDriver driver=new ChromeDriver(); 
	         
	         driver.manage().window().maximize();
	         
	         driver.get("https://login.yahoo.com/account/create?.intl=in");
	         
	         //xPath
	         driver.findElement(By.xpath("//input[@id=\"usernamereg-firstName\"]")).sendKeys("dipali");
	         driver.findElement(By.xpath("//input[@id=\"usernamereg-lastName\"] ")).sendKeys("Rajput");
	         Thread.sleep(200);
	         //name
	         driver.findElement(By.name("password")).sendKeys("dipu");
	         Thread.sleep(200);
	         driver.findElement(By.id("usernamereg-show-button")).click();
	         Thread.sleep(200);
	         driver.findElement(By.id("usernamereg-userId")).sendKeys("dipaligirase@gmail.com");
	         Thread.sleep(200);
	         driver.findElement(By.name("mm")).sendKeys("november");
	         Thread.sleep(200);
	     //    driver.findElement(By.name("dd")).sendKeys("sunday");
	         driver.findElement(By.id("usernamereg-day")).sendKeys("monday");
	         driver.findElement(By.name("yyyy")).sendKeys("1999");
	         driver.findElement(By.className("oneid-error-message")).click();
	         driver.findElement(By.className("submit")).click();
	         
	         
	}

}
