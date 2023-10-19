package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class permissionpopup {
	
	public static void main (String [] args ) throws InterruptedException {
		
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
	    //System.setProperty("Webdriver chrome driver ", "C:\\Program Files\\Java\\jdk-19\\bin");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfcbank.com/");
		
		Thread.sleep(2000);
		
		driver.quit();
	
	}
	

}
