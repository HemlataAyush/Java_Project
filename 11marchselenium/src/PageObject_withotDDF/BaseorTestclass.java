package PageObject_withotDDF;

import java.util.concurrent.TimeUnit;

import javax.security.auth.spi.LoginModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseorTestclass {
	
	public static void main( String [] args) {
		
		System.setProperty("Webdriver.chrome.driver", "\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	           Loginpage LP = new Loginpage(driver);
	           
	           LP.GoTo();
	           LP.Usermail("Admin");
	           LP.password("admin123");
	            LP.Button.click();
	          
	           
	           DashboardPage DP = new DashboardPage(driver);
	           DP.Namevalidation();
	           DP.TimeAt();
	           
	           My_INFO inf = new My_INFO(driver);
	           inf.firstname("paul");
	           inf.lastname("collings");
	           inf.middlename("Ankush");
	           inf.GOTO();
	           inf.click();
	           
	           driver.quit();
	}

}
