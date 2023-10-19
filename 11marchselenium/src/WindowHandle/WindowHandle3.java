package WindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle3 {
	
	public static void main(String [] args) throws InterruptedException {
		
	//	System.setProperty("webdriver chrome driver ",  "\"C:\\chromedriver.exe\"");
	    WebDriverManager.chromedriver().setup();
		
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
			
			Thread.sleep(3000);
			Set<String>WindowID=driver.getWindowHandles();
			Iterator<String>it =WindowID.iterator();
			
			String ParentWindow = it.next();
			String ChildWindow = it.next();
		 
			System.out.println("Parentwindow--->"+ParentWindow);
			System.out.println("Childwindow---->"+ChildWindow );
			
			driver.switchTo().window(ParentWindow);
			System.out.println("Parentwindow"+driver.getTitle());
			driver.switchTo().window(ChildWindow);
			System.out.println("ChildWindow"+driver.getTitle());
			
			driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("Test@gmail.com");
			driver.findElement(By.id("Form_submitForm_action_request")).click();
			
			driver.switchTo().window(ParentWindow);
			
			driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys("Test123");
			
			driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Test1234");
			
	        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	        driver.quit();
	        
		
		
			
			
			
			
			
			
			
			
			
			
			
	}

}
