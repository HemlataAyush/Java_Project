package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
	public static void main (String [] args ) throws InterruptedException {
		
		System.setProperty("webdriver.chrome .driver","\"C:\\chromedriver_win32.zip\"");
				
		WebDriver driver =new ChromeDriver();
		
	driver.get("https://www.orangehrm.com/blog/web-based-hr-management/");
	
	Dimension D1= new Dimension(80,700);
	
	driver.manage().window().setSize(D1);
	
	Thread.sleep(1000);
	
	System.out.println(driver.manage().window().getSize());
	
	driver.close();
	
	}
}
