package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popups4 {
	
	public static void main (String [] args) throws InterruptedException {
		
		//System.setProperty("webdriver chrome driver", "C:\\Program Files\\Java\\jdk-19\\bin");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfcbank.com/");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("Test");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		String ExpectedalertMsg ="Please enter your password";
		
		Alert alert = driver.switchTo().alert();
		
		String Alertmessage = alert.getText();
		
		if (ExpectedalertMsg.equals(Alertmessage))
			 System.out.println("correct alert message");
		else 
			System.out.println("incorrect alert message");
		
		Thread.sleep(3000);
		
		alert.accept();
		
		Thread.sleep(3000);
		
		//driver.quit();
		
		
		
		
		
	

	}	
}
