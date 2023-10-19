package FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement1 {

	public static void main(String[] args) throws InterruptedException {

     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.amazon.in/");
     
     WebElement SearchBox = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
    
     SearchBox.sendKeys("Onepluse");
     
     Thread.sleep(4000);
     
     
	}

}
