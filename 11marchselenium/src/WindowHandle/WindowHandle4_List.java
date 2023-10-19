package WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle4_List {
	
public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver chrome driver ",  "\"C:\\chromedriver.exe\"");
		
		
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
			
			driver.switchTo().frame("iframeResult");
			
			driver.findElement(By.xpath("//a[contains(text(),'Visit W3Schools.com!')]")).click();
			
			
}		

}
