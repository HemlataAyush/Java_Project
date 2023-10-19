package MultipleLinkHandle;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLink {
	
	public static void main(String [] args) {
		
		//System.setProperty("Webdriver chrome driver", "\"C:\\chromedriver.exe\"");
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement>Links=driver.findElements(By.tagName("a"));
	
		System.out.println("Number of Links---->"+Links.size());
		
		for (WebElement link: Links) {
			    System.out.println(link.getText());
			    System.out.println(link.getAttribute("href"));
		}
		driver.quit();
		
		
	}
	

}