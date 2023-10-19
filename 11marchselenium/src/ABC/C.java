package ABC;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C {

	private static final boolean True = false;

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
		   String main =driver.getWindowHandle();
		    System.out.println(main);
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
			

		 Thread.sleep(4000);
		
		   Set<String> CD= driver.getWindowHandles();
		  
		  System.out.println(CD);

		
		  
		  Iterator<String> IT = CD.iterator();
		   String parent = IT.next();
		    String child = IT.next();    
		    System.out.println("Parent id"+parent);
		    System.out.println("child id"+child);
   
		    driver.switchTo().window(parent);
		String  Expected = "OrangeHRM";
		 String   Actual = driver.getTitle();
		 if(Expected.equals(Actual)) {
			Assert.assertTrue(True);
			System.out.println("true");
		 }
		 else {
			 Assert.assertTrue(false);
			 System.out.println("false");
		 }
			 
		  Thread.sleep(3000);
		    driver.switchTo().window(child);
	}

}
