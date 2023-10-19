package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowpopoporFileuploadpopup {
	
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("Webdriver. chrome .driver",  "\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("C:\\Users\\hp\\git\\repository2\\11marchselenium\\Excel_sheet\\new excel.xlsx");
		
		driver.findElement(By.id("file-submit")).click();
		
		String Text = driver.findElement(By.xpath("//h3[contains(text(),'File Uploaded!')]")).getText();
		
		System.out.println(Text);
		Thread.sleep(3000);
		
	}
	
	

}