package Orange_HRM_DDP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myinfo {
	
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("Webdriver chrome driver", "\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
		
	   driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
	   
	   driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	   
	     Thread.sleep(200);
	     
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
	     
	     driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("dipali Rajput");
	     
	     driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("989898");
	     
	     driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div"));
	     
	 String driver1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).getText();
	     
	     driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")).click();
	     
	     driver.quit();
	}
	

}
