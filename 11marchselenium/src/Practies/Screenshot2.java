package Practies;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Screenshot2 {
       static WebDriver driver;
	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();		
		 driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/");
		
		String Filename = "Facebook";
		
		Screenshot2.Screenshot(Filename);	
		
		Screenshot2.Screenshot("Test"+Filename);
		
		Screenshot2.Screenshot("Test1"+Filename);
				
	}
	
	public static void Screenshot(String Filename) throws IOException {
		
	File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	 String Random = RandomString.make(5);
	 
	 File Destination = new File("C:\\Users\\hp\\git\\repository2\\11marchselenium\\Screenshot"+Filename+" "+Random+".jpg");
	
	 FileHandler.copy(Source, Destination);
	 
	}

}
