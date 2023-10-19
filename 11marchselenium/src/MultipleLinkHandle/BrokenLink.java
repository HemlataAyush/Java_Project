package MultipleLinkHandle;

import java.io.IOException;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {
	
public static void main(String [] args) throws IOException {
		
		//System.setProperty("Webdriver chrome driver", "\"C:\\chromedriver.exe\"");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");	
		List<WebElement>Links=driver.findElements(By.tagName("a"));		
		System.out.println("Number of Links---->"+Links.size());		
		int Brokenlinks = 0;		
		for(WebElement element : Links) {			
			String url = element.getAttribute("href");			
			if (url==null||url.isEmpty()) {
				System.out.println("URL is Empty or null");
			}
			URL Link = new URL (url);			
			HttpsURLConnection httpscode = (HttpsURLConnection) Link.openConnection();
			httpscode.connect();			
			if(httpscode.getResponseCode()>=400) {
				System.out.println(httpscode.getResponseCode()+"-->"+url+"is--->Broken Link");
				Brokenlinks++;
			}
			else {
				System.out.println(httpscode.getResponseCode()+"--->"+url+"Valid link");
				
			}			
			
			
		}
		System.out.println("Number of broken link "+Brokenlinks);

}
				
}

