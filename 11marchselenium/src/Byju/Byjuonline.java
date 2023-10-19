package Byju;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Byjuonline {
	
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("Webdriver chrome driver ", "\"C:\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://byjus.com/");
		driver.findElement(By.xpath("//input[@value=\"online\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Girase dipali");
		driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("9373574331");
		driver.findElement(By.xpath("//button[contains(text(),'Send OTP')]")).click();
	    driver.findElement(By.xpath("//input[@data-placeholder=\"Email-id\"]")).sendKeys("girasedipali3@gmail.com");
	
		WebElement State=driver.findElement(By.xpath("//select[@name=\"state\"]"));
		Select S1 = new Select(State);
		//driver.findElement(By.xpath("(//option[@value=\"Maharashtra\"])[1]")).click();
		S1.selectByVisibleText("Maharashtra");
		
		WebElement grade =driver.findElement(By.xpath("//select[@name=\"grade\"]"));
		Select S2 = new Select(grade);
		S2.selectByVisibleText("Class 5");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

}
}