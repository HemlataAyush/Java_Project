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

import net.bytebuddy.utility.RandomString;

import org.openqa.selenium.TakesScreenshot;

public class Screenshot6 {
	
	public static void main (String [] args) throws IOException {
		
		System.setProperty("Webdriver chrome driver", "\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement Facebooklogo = driver.findElement(By.xpath("//img[@ class=\"fb_logo _8ilh img\"]"));
		
		File Source =((TakesScreenshot)Facebooklogo).getScreenshotAs(OutputType.FILE);
		
		String Random =RandomString.make(7);
		String Imagename ="facebook";
		File Dest = new File("C:\\28march evening batch\\11marchselenium\\Screenshot.facebooklogo");
		FileHandler.copy(Source, Dest);
		driver.quit();
		
		
		
	}
		
	}

