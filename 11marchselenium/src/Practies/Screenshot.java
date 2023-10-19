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

public class Screenshot {

	public static void main(String[] args) throws IOException {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		String Random = RandomString.make(5);
		String IMG = "IRCTC";
	    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File Desctination = new File("C:\\Users\\hp\\git\\repository2\\11marchselenium\\Screenshot"+Random+" " +IMG+" "+"jpg");
        FileHandler.copy(source, Desctination);
	}

}
