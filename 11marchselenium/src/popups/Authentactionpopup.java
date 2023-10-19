package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentactionpopup {
	
	public static void main (String [] args) throws InterruptedException {
		//System.setProperty("Webdriver chrome driver","C:\\Program Files\\Java\\jdk-19\\bin");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//driver.switchTo().alert().sendKeys("admin");
		//driver.switchTo().activeElement().sendKeys("admin");
		
	    String Text =driver.findElement(By.xpath("//p[contains(text(),' Congratulations! You must have the proper credentials.' )] ")).getText();
	    
	    System.out.println(Text);
	    Thread.sleep(4000);
	    driver.quit();
		
	}
	
	

}
