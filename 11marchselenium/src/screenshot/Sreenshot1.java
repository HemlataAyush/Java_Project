package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sreenshot1 {
	
	public static void main(String [] args) throws IOException {
		System.setProperty("Webdriver chrome driver",  "\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id");
		
		// take screenshot and copy object
		
		File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//System.out.println(Source)
		
		File Destination = new File ("\\28march evening batch\\11marchselenium\\Screenshot.sample4 jpg\sample.jpg");
		FileHandler.copy(Source, Destination);
		driver.quit();
		
		
	}

}
