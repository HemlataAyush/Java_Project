package WebElement1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementA {
	
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("Webdriver chrome driver", "\"C:\\chromedriver_win32.zip\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("//a[@href=\"https://www.facebook.com/Glvbl90aW1lIjoxNjg3MDU5NjU1LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&ars=facebook_login\"]");
		
		 Thread.sleep(2000);
		
		//TO CLICK ON FORGOTTEN PASSWORD
		 
		 driver.findElement(By.linkText("//a[@href=\"https://www.facebook.com/recover/initiate")).click();
		
		 
	}

}
