package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import net.bytebuddy.utility.RandomString;

public class Screenshot8 {
	
	static WebDriver driver;
	
	public static void main (String [] args) throws IOException {
		
		
		//System.setProperty("webdriver chrome driver","\"C:\\chromedriver.exe\"");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		String Filename ="kite";
		
		Screenshot8.TakesScreenshot(Filename);
		Screenshot8.TakesScreenshot("Test"+Filename);
		Screenshot8.TakesScreenshot("Take1"+Filename);
		driver.quit();
		
		
	}
	
	public static void TakesScreenshot(String Filename) throws IOException {
    File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String Random =RandomString .make(5);
	File Dest = new File("C:\\Users\\hp\\git\\repository2\\11marchselenium\\Screenshot"+Filename+" "+Random+".jpg");

	
	FileHandler.copy(source, Dest);
	
	
	}

}