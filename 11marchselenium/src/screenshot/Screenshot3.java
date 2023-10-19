package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import  org.openqa.selenium.TakesScreenshot;

public class Screenshot3 {
	
	public static void main (String [] args) throws IOException {
		
		System.setProperty("Webdriver. chrome. driver ", "\"C:\\chromedriver.exe\"");
		
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		driver.get("https://kite.zerodha.com/");
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
   File Destination =  new File ("\\28march evening batch\\11marchselenium\\Screenshot.sample 5jpg\"");
	  FileHandler.copy(Source, Destination);
		driver.quit();
		
		
	}

}
