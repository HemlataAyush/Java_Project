package popups;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {

	public static void main(String[] args) {
       
		System.setProperty("webdriver chrome driver ", "C:\\Program Files\\Java\\jdk-19\\bin");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
		
		 String WindowID = driver.getWindowHandle();
		 
		 //By using getWindowhandle mathod we can get the ID of the browserwindow
		 System.out.println(WindowID);
	}

}
