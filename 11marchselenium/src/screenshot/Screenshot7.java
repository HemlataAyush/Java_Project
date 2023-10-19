package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;


public class Screenshot7 {
 
	public static void main (String [] args) throws IOException {
		
		System.setProperty("Webdriver chrome driver", "\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		WebElement kite = driver.findElement(By.xpath("//h2[contains(text(),'Login to Kite')]"));
		
		File Source =((TakesScreenshot)kite).getScreenshotAs(OutputType.FILE);
		
		File Dest = new File ("C:\\28march evening batch\\11marchselenium\\Screenshot.jpg");
		
		FileHandler.copy(Source, Dest);
		
		driver.quit();
	}
}
