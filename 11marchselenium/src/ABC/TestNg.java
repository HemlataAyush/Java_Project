package ABC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg {
       WebDriver driver;
       @BeforeClass
	public void Priority() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 		
	}
	
		@Test(priority = 1)
		public void TC2() {

	      driver.findElement(By.id("email")).sendKeys("hemlatat");
		}
		@Test(priority =3)
		public void TC3() {
			driver.findElement(By.id("pass")).sendKeys("patel");
		}
		@Test(priority =3)
		public void A(){
		boolean	img = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]")).isDisplayed();
			
		}
		@AfterClass
		public void tearwown() {
			driver.quit();
		}

	
	
}
