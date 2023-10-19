package Byju;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrom.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32");;
	    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://byjus.com/");
		
		driver.findElement(By.xpath("(//input[@name=\"session_type_selection\"])[2]")).click();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Hemlatapatel");
		driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("9373574331");
		driver.findElement(By.xpath("//button[contains(text(),'Send OTP')]")).click();
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("patel.hemlata2712@gmail.com");
	 
		WebElement State = driver.findElement(By.xpath("//select[@name=\"state\"]"));
        Select S1 = new Select(State);
        S1.selectByVisibleText("Karnataka");
        
      WebElement Class = driver.findElement(By.xpath("//select[@name=\"grade\"]"));
      Select S2 = new Select(Class);
      S2.selectByVisibleText("Class 4");
    
      
       driver.findElement(By.id("ftcOfflineScheduleClass")).click();
       
       
       WebElement City = driver.findElement(By.xpath("(//select[@class=\"form-control\"])[5]"));
         Select S3 = new Select(City);
         S3.selectByVisibleText("Bengaluru");
         
        WebElement Centre = driver.findElement(By.xpath("//select[contains(text(),'Select Centre')]"));
        Select S4 = new Select(Centre);
        S4.selectByVisibleText("Bangalore-Rajarajeshwari nagar");
           
        Thread.sleep(10000);
        
         driver.findElement(By.xpath("//input[@type=\"date\"]")).click();
         WebElement time = driver.findElement(By.xpath("//select[@name=\"slot-offline\"]"));
         Select S5 = new Select(time);
         S5.selectByVisibleText("12 PM - 2 PM");
          Thread.sleep(5000);
         
         driver.findElement(By.xpath("//button[contains(text(),'Schedule a Free Offline Class')]")).click();
         
         String ActualText = driver.findElement(By.xpath("//span[contains(text(),'Your Doubt Session is Booked!')]")).getText();

           System.out.println(ActualText);
             
            
     
        
	}

}
