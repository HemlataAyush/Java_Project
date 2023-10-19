package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle3 {

	public static void main(String[] args) throws InterruptedException {
		
		  
		System.setProperty("webdriver chrome driver ", "C:\\Program Files\\Java\\jdk-19\\bin");
						
		WebDriver driver = new ChromeDriver();
						
		driver.manage().window().maximize();
						
		driver.get("https://hrm.flourisense.in/web/index.php/auth/login");

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Set<String> WindowID = driver.getWindowHandles();
		
		Iterator<String> It=  WindowID.iterator();
		
	    String ParentWindow = It.next();
	    String ChildWindow = It.next();
	    
	    System.out.println("ParentWindow"+ParentWindow);
	    System.out.println("ChildWindow"+ChildWindow);
	    
	    driver.switchTo().window(ParentWindow);
	    System.out.println("Parentwindow"+driver.getTitle());
	    driver.switchTo().window(ChildWindow);
	    System.out.println("childwindow"+driver.getTitle());
	    
	    driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("patel.hemlata2712@gmail.com");
	    
	    driver.findElement(By.id("Form_submitForm_action_request")).click();
	    
	    driver.switchTo().window(ParentWindow);
	    
	    driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	    
	    driver.quit();
	}

}
