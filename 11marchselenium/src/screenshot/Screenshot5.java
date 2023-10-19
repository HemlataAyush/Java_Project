package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

import org.openqa.selenium.TakesScreenshot;

public class Screenshot5 {
	
	public static void main (String [] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver chrome driver", "\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		
		String Random =RandomString.make(7);
		
		String imagename ="Redbus";
		
		File Dest = new File ("C:\\28march evening batch\\11marchselenium\\Screenshot"+imagename+""+Random+".jpg");
		
		FileHandler.copy(source, Dest);	
		
		driver.quit();
		
	}

}
