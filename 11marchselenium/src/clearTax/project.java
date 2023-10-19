package clearTax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project {
	
	public static void main (String [] args) {
		
		System.setProperty("Webdriver chrome driver",  "\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://cleartax.in/?");
	}

}
