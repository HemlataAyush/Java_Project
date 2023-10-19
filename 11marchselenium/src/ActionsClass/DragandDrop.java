package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	
	public static void main (String [] args) throws InterruptedException {
		//ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement Source = driver.findElement(By.id("box1"));
		
		WebElement Dest =driver.findElement(By.id("box101"));
		
		Actions act = new Actions(driver);
	
	     act.dragAndDrop(Source, Dest).build().perform();
	     
	     Thread.sleep(3000);
	     
	     driver.quit();
	}

}
