package MultipleLinkHandle;

import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLink2 {
	
public static void main(String [] args) {
		
	//	System.setProperty("Webdriver chrome driver", "\"C:\\chromedriver.exe\"");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/");
		
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		System.out.println("toatal number of link--->"+Links.size());
		
		for(WebElement Link:Links) {
			System.out.println(Link.getText());
			System.out.println(Link.getAttribute("href"));
			int Brokenlinks=0;
			
			
		}



}
}