package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popups2_JS2 {
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("Webdriver chrome driver", "C:\\Program Files\\Java\\jdk-19\\bin");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		boolean Text =driver.findElement(By.xpath("//p[@id=\"result\"]")).isDisplayed();
		
		System.out.println(Text);
		driver.quit();
	}

}
