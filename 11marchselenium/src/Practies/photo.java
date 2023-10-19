package Practies;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class photo {

	public static void main(String[] args) throws IOException, InterruptedException {

   WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.facebook.com/");
   Thread.sleep(5000);
      File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     String img = RandomString.make(4);
     String Name = "fcebook.com";
      
       File Destination = new File("C:\\Users\\hp\\git\\repository2\\11marchselenium\\Screenshot"+img+" "+Name+".JPG");
      FileHandler.copy(file, Destination);

      driver.quit();
	}

}
