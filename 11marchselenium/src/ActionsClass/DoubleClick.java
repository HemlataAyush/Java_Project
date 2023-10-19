package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {
	
	public static void main (String [] args) throws InterruptedException {
		
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement Click = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(Click).build().perform();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		driver.quit();
	}
}
