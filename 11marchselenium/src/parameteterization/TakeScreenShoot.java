package parameteterization;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShoot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
     File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     
     File Drstination = new File("C:\\Users\\hp\\git\\repository10\\11marchselenium\\Screenshot.jpg");
        
     FileHandler.copy(file, Drstination);

	}

}
