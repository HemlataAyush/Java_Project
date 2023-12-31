package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseRightClickorContextClick {
	
	public static void main (String [] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().fullscreen();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement element = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(element).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[contains(text(),'Copy')])[2]")).click();
			
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		act.contextClick(element).build().perform();
		
		Thread.sleep(3000);
		
	    driver.findElement(By.xpath("(//span[contains(text(),'Paste')])[2]")).click();
	    
	    System.out.println(driver.switchTo().alert().getText());
	   
	    driver.switchTo().alert().accept();
		
	   // driver.quit();
	}
}
