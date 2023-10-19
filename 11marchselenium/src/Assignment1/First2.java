package Assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First2 {
	
	 public static void main (String [] args)  {

	
	//System.setProperty("webdriver chrome driver ", "\"C:\\chromedriver.exe\"");
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Register.html");
	
	
	

}
}