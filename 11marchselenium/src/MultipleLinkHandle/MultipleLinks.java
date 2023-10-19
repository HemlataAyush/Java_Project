package MultipleLinkHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleLinks {
	
public static void main(String [] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://byjus.com/");
		
		
		List<WebElement>Links=driver.findElements(By.tagName("a"));
	
		System.out.println("Number of Links---->"+Links.size());
		
		for (WebElement link: Links) {
			    System.out.println(link.getText());
			    System.out.println(link.getAttribute("href"));
		}
		driver.quit();
		
		
		
		
		

}
}