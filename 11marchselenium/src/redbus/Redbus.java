package redbus;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Locaters.Sendkeys;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import io.opentelemetry.sdk.metrics.internal.view.DropAggregation;

public class Redbus {
	@SuppressWarnings("deprecation")
	public static void main (String [] args ) throws InterruptedException {
		
		//System.setProperty("webdriver chrome driver", "\"C:\\chromedriver.exe\"");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("src")).sendKeys("pune");
		Thread.sleep(4000);
	    List <WebElement> Cityfrom = driver.findElements(By.xpath("//text[@class=\"placeHolderMainText\"]"));
	     Thread.sleep(3000);
	     System.out.println(Cityfrom.size());
	     Thread.sleep(4000);
	     for(int i=0; i<Cityfrom.size(); i++) {
	    	 System.out.println(Cityfrom.get(i).getText());
	    	 if(Cityfrom.get(i).getText().contains("Warje")) {
	    		 Thread.sleep(3000);
	    		 Cityfrom.get(i).click();
	    		break;
	    	 }
	     }
	     Thread.sleep(3000);
	     System.out.println();
	     driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Bangalore");
	     Thread.sleep(4000);
	    List<WebElement> Destination = driver.findElements(By.xpath("//li[@class=\"sc-iwsKbI jTMXri\"]"));
		Thread.sleep(3000);
		System.out.println(Destination.size());
		Thread.sleep(4000);
		for(int j=0; j<Destination.size(); j++) {
			 String List2 = Destination.get(j).getText();
			 System.out.println(List2);
			if(List2.contains("Madiwala")) {
				Thread.sleep(3000);
				Destination.get(j).click();
				break;
			}
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Date')])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'19')]")).sendKeys("19");
	  
		
		
		
	
		
		
		
		
	}

}
