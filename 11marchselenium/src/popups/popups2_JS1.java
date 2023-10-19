package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popups2_JS1 {
	
	public static void main (String [] args) throws InterruptedException {
		
		//Javascript alert && confirmation popups
		
		//System.setProperty("Webdriver chrome driver ","C:\\Program Files\\Java\\jdk-19\\bin");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// Alert A1 = new Alert();
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		boolean Text =driver.findElement(By.xpath("//p[@id=\"result\"]")).isDisplayed();
		
		System.out.println(Text);
		driver.quit();
	}

}
