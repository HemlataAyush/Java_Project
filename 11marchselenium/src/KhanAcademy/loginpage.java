package KhanAcademy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {
	
	public static void main(String [] args) {
		
		System.setProperty("Webdriver chrome driver","\"C:\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.khanacademy.org/teacher/dashboard");
			
			
		
	}

}
