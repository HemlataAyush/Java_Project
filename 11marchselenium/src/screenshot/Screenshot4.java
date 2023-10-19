package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot4 {
	
	public static void main (String [] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver chrome driver","\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	 File Source  =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	 File Destination = new  File ("C:\\28march evening batch\\11marchselenium\\Screenshot dipali.jpg");
	 
	 FileHandler.copy(Source, Destination);
	 Thread.sleep(200);
	 driver.quit();
	 
	}

}
