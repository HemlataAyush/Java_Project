package Practies;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class listbox1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Hemlata");
		WebElement Day = driver.findElement(By.xpath("//select[@title=\"Day\"]"));		
		Select S1 = new Select(Day);
		S1.selectByVisibleText("14");
		
		WebElement Month = driver.findElement(By.id("month"));
		Select S2 = new Select(Month);
        List<WebElement> month = S2.getOptions(); 
        System.out.println(month.size());
        
        for(int j =0; j<month.size(); j++) {
        	String MonthList = month.get(j).getText();
        	System.out.println(MonthList);
        	
        if(MonthList.equals("Dec")) {
        	month.get(j).click();
        }
        }

		
		WebElement Year = driver.findElement(By.id("year"));
		Select S3 = new Select(Year);
		List<WebElement> year = S3.getOptions();
		System.out.println(year.size());
		
		for(int i=0; i<year.size(); i++) {
			
			String List = year.get(i).getText();
			System.out.println(List);
			
			
			if(List.equals("1996")) {
				year.get(i).click();
			}
		}
		
		

	}

}
