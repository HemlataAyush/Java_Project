package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) {
	
       WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement Email = driver.findElement(By.id("email"));
		
		WebElement Password = driver.findElement(By.id("pass"));
		
		Email.sendKeys("HEMLATAPATEL");
		Actions act = new Actions(driver);
		
		//control+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
        //CONTROL+C
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		act.sendKeys(Keys.TAB).build().perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.sendKeys(Keys.CONTROL).build().perform();
		
		if(Email.getAttribute("value").equals(Password.getAttribute("value"))) {
			System.out.println("Correct Copied");
		}else {
			System.out.println("Incorrect copied");
		}
		
	}

}
