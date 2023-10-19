package Webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstProgram1 {
	
	public static void main (String [] args) {
		//System.setProperty("Webdriver chrome driver", "\"C:\\chromedriver.exe\"");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement Element = driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
		
		js.executeScript("arguments[0].scrollIntoView();", Element);
		//first way
		//Question 1 -how many row in table 
		 int Row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		 System.out.println( "total number of Rows ----->"+Row);
		 
		 List<WebElement>Row1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
	     System.out.println("Total numbet of rows ---->"+Row1.size());
	
		
		
	}

	
}
