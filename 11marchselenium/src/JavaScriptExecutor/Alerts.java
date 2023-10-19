package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
     System.setProperty("webdriver chrome driver", "C:\\Program Files\\Java\\jdk-19\\bin");
		
	 WebDriver driver = new ChromeDriver();
		
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.amazon.in/");
	 
	 WebElement Account = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
	 
	 Actions act = new Actions(driver);
	 
	 act.moveToElement(Account).build().perform();
	 
	 driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
	 
	 driver.findElement(By.id("ap_email")).sendKeys("velocity@gmail.com");
	 
	 driver.findElement(By.id("continue")).click();
	 
	 driver.findElement(By.id("ap_password")).sendKeys("wetydn");
	 
	 driver.findElement(By.id("signInSubmit")).click();
	 
	 Thread.sleep(3000);
	 
	  boolean Text = driver.findElement(By.xpath("//span[contains(text(),'Your password is incorrect')]")).isDisplayed();
	  
	  System.out.println(Text);
	  
	  //Alerts.GenerateAlerts(driver,)
	 
	 

	}

}
