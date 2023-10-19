package PageObject_withDDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Based_class {
	
	public static void main (String [] args) {
		
		System.setProperty("Webdriver chrome driver", "\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		PageObjectWithDDF pdf = new PageObjectWithDDF(driver);
		
		  pdf.GoTO();
		  pdf.login();
		  pdf.usermail("email");
		  pdf.userpass("dipali123");
		  pdf.button.click();
		  
		  

}
}