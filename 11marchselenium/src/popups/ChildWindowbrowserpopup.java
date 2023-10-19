package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class ChildWindowbrowserpopup {
	
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver chrome driver ", "C:\\Program Files\\Java\\jdk-19\\bin");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'click')])[2]")).click();
		
		String Parentwindow = driver.getWindowHandle();
		//2DA5F1804358B09927DEECE137D46E09
		System.out.println(Parentwindow);
		
		Set<String> Childwindows = driver.getWindowHandles();
		
		for(String Childwindow :Childwindows ) {
			if(!Parentwindow.equalsIgnoreCase(Childwindow)) {
				driver.switchTo().window(Childwindow);
				
				String Text1=driver.findElement(By.xpath("//h1[contains(text(),'Selenium automates browsers. ')]")).getText();
				System.out.println(Text1);
				driver.close();
			}
		}
		driver.switchTo().window(Parentwindow);
		String Text2=driver.findElement(By.xpath("//h1[contains(text(),'Automation Demo Site ')]")).getText();
		System.out.println(Text2);
		driver.quit();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}