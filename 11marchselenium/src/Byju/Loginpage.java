package Byju;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Loginpage {
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("Webdriver chrome driver ", "\"C:\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://byjus.com/");
		driver.findElement(By.xpath("//input[@id=\"ftc-offline\"]")).click();
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
		
		//driver.findElement(By.xpath("//option[contains(text(),'Class 5')]")).click();
		driver.findElement(By.xpath("//button[@id=\"ftcOfflineScheduleClass\"]")).click();
	WebElement city =	driver.findElement(By.xpath("//select[@name=\"city-offline\"]"));
	Select S3= new Select(city);
	S3.selectByVisibleText("Pune");
	
	
	    WebElement Center =driver.findElement(By.xpath("//select[@name=\"center-offline\"]"));
	    Select S4 = new Select(Center);
	    S4.selectByVisibleText("Pune-Pimpri");
	    
	    Thread.sleep(10000);
        
        driver.findElement(By.xpath("//input[@type=\"date\"]")).click();
        WebElement time = driver.findElement(By.xpath("//select[@name=\"slot-offline\"]"));
        Select S5 = new Select(time);
        S5.selectByVisibleText("12 PM - 2 PM");
         Thread.sleep(5000);
        
        driver.findElement(By.xpath("//button[contains(text(),'Schedule a Free Offline Class')]")).click();
        
        String ActualText = driver.findElement(By.xpath("//span[contains(text(),'Your Doubt Session is Booked!')]")).getText();

          Thread.sleep(10000);
              
            System.out.println (ActualText);
            
           
    
        
        

	

	}
}