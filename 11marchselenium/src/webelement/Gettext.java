package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {
	
	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver ", "\"C:\\chromedriver_win32.zip\"");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String ExpectedText  ="Facebook helps you connect and share with the people in your life.";
		
		String EXPText="create a page ";
		
		String actualtext=driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]")).getText();
		
		if(ExpectedText.equals(actualtext)) {
			System.out.println("correct text");
		}
		else {
			System.out.println("incorrect text");
			
		}
			
			
			String Text = driver.findElement(By.xpath("//a[@class=\"_8esh\"]")).getText();
			if(EXPText.equals(Text))
				System.out.println("correct text");
			else 
				System.out.println("incorrect text");
			
			driver.quit();
				
				
			}
		
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
	}		
 

