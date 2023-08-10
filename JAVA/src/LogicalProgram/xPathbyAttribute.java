package LogicalProgram;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathbyAttribute{
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("patel.hemlata2712@gmail.com");
	
			
	
	}
}

