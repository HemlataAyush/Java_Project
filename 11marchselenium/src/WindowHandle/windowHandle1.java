package WindowHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle1 {
	
	public static void main (String [] args) {
		
		System.setProperty("webdriver chrome driver ", "\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
		
		String WindowID=driver.getWindowHandle();
		
		System.out.println(WindowID);
	}

}
