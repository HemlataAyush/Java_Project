package Practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popus1 {

	public static void main(String[] args) throws InterruptedException {

      WebDriverManager.chromedriver().setup();
      WebDriver driver =new ChromeDriver();
      driver.get("https://the-internet.herokuapp.com/javascript_alerts");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
      driver.switchTo().alert().accept();

	}

}
