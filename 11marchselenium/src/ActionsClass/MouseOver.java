package ActionsClass;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {
	
	public static void main (String [] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		WebElement Account =driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
	
		Actions act = new Actions(driver);
		
		act.moveToElement(Account).build().perform();
		
		driver.findElement(By.xpath("(//span[contains(text(),'Sign in')])[1]")).click();
		
		driver.findElement(By.id("ap_email")).sendKeys("velocity@gmail.com");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("qwertyu");
		
		driver.findElement(By.id("signInSubmit")).click();
		
		Thread.sleep(3000);
		boolean Text = driver.findElement(By.xpath("//span[@class=\"a-list-item\"]")).isDisplayed();
        System.out.println(Text);
       
        
	}
}