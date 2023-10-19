package Assingnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {
	
	public static void main(String [] args) throws InterruptedException {

      WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
        driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		Thread.sleep(5000);
		WebElement text=driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]"));
        String text1 =text.getText();
        System.out.println(text1);
        Thread.sleep(4000);
        
        driver.switchTo().defaultContent();
        
        driver.findElement(By.xpath("//div[@class=\"header-wrapper\"]")).click();
        
        Thread.sleep(4000);
        driver.quit();
		
	
		
		//driver.switchTo().frame()
		
	}

}
