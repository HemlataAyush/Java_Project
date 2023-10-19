package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeybordAction2 {

	public static void main(String[] args) {
	     
		    WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://the-internet.herokuapp.com/key_presses?");
			
			Actions act = new Actions(driver);
			
			act.sendKeys(Keys.BACK_SPACE).build().perform();
			
			System.out.println(driver.findElement(By.id("result")).getText());
			
			act.sendKeys(Keys.TAB).build().perform();
			
			System.out.println(driver.findElement(By.id("result")).getText());
  
			act.sendKeys(Keys.SHIFT).build().perform();
			
			System.out.println(driver.findElement(By.id("result")).getText());
			
			act.sendKeys(Keys.ESCAPE).build().perform();
			
			System.out.println(driver.findElement(By.id("result")).getText());
			
			//driver.quit();
	}

}
