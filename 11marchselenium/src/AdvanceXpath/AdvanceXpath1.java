package AdvanceXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceXpath1 {
	
	public static void main (String [] args) {
		
		//Step 1:
		//System.setProperty("webdriver.chrome.driver",null)
		
    WebDriverManager.chromedriver().setup();
		
	WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	driver.get("https://demo.automationtesting.in/Register.html");
		
		//Absoulte xpath
		
	driver.findElement(By.xpath("(/html/body/section/div/div/div[2]/form/div/div/input)[1]")).sendKeys("Hemlata");
		
    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div/div[2]/input")).sendKeys("Patel");
	
		//Relative xpath
	 driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Uddhav");
	 
	 driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("2712");
	
	 
	}
	

}
