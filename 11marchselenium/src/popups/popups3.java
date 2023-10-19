package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popups3 {
	
	public static void main (String [] args) throws InterruptedException {
		
		//javascript alert &confirmation popup
		
		//System.setProperty("Webdriver chrome driver","C:\\Program Files\\Java\\jdk-19\\bin");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		
		Thread.sleep(2000);
		
		Alert Text = driver.switchTo().alert();
		
		System.out.println("Alert Message---->"+Text.getText());
		Thread.sleep(2000);
		
		Text.sendKeys("welcome");
		Thread.sleep(2000);
		Text.accept();
		
		Thread.sleep(2000);
		driver.quit();
	
		
		
	}

}