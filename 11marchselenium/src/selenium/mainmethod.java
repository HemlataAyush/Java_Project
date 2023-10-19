package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webDriver.chrome.driver","\"C:\\chromedriver_win32.zip\"");
		WebDriver driver =new ChromeDriver();
		
	//	driver.get("https://chromedriver.chromium.org/");
		driver.get("https://www.redbus.in/");
		driver.get("https://www.facebook.com/");
		
		// System----class name 
		//set property ---method name
		//Webdriver--version of selenium
		// chrome --name of the browser 
		// value-- path of chromedriver.exe file 
		
		
	}

}
