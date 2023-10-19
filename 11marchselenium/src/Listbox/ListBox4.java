package Listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox4 {
	
	public static void main(String [] args) throws InterruptedException {
		
		//step 1 
		//System.setProperty("webdriver.chrome.driver", "\"C:\\chromedriver.exe\\");
		WebDriverManager.chromedriver().setup();
		//step 2 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.id("fromCity")).sendKeys("Bangalore");
		Thread.sleep(5000);
	   List<WebElement> List1 =driver.findElements(By.xpath("//p[@class=\"font14 appendBottom5 blackText\"]"));
	   Thread.sleep(4000);
		for(int i=0; i< List1.size(); i++) {
		String  Element1 = List1.get(i).getText();
		System.out.println(Element1);
		   if(Element1.contains("Bengaluru")) {
			   List1.get(i).click();
			   break;
		   }
		}
		
		System.out.println();
		Thread.sleep(5000);
		driver.findElement(By.id("toCity")).sendKeys("Delhi");
		List<WebElement> List2 = driver.findElements(By.xpath("//p[@class=\"font14 appendBottom5 blackText\"]"));
	    for(int j=0; j<List2.size(); j++) {
	    String	Elements2 =List2.get(j).getText();
	    System.out.println(Elements2);
	    if(Elements2.contains("New Delhi")) {
	    	List2.get(j).click();
	    	break;
	    }
	    }
	    driver.findElement(By.xpath("//span[contains(text(),'Departure')]")).click();
	    driver.findElement(By.xpath("//div[contains(text(),'October 2023')]")).click();
	   List<WebElement> Date = driver.findElements(By.xpath("(//div[@class=\"dateInnerCell\"])"));
	    for(int k=0; k<Date.size(); k++) {
	    	String ele = Date.get(k).getText();
	    	System.out.println(ele);
	    	if(ele.contains("20")) {
	    		Date.get(k).click();
	    	}
	    }
	}

}
