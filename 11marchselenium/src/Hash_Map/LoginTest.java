package Hash_Map;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static HashMap<String ,String>Logindata(){
		HashMap<String,String>HM = new HashMap<String,String>();
		HM.put("A", "Mangal:Ketan123");
		HM.put("B", "Ankush:Ketan123");
		HM.put("c", "Dipali:Ketan123");
		HM.put("D", "Ketan:Ketan123");
		return HM;
		
	}
	
	public static void main (String [] args) {
		
		//System.setProperty("Webdriver chrome driver", "\"C:\\chromedriver.exe\"");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String Name = LoginTest.Logindata().get("B");
		
		String arr [] = Name.split(";");
		
		driver.findElement(By.id("email")).sendKeys(arr[0]);
		driver.findElement(By.id("pass")).sendKeys(arr[0]);
		
		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
		
		String str = driver.getTitle();
		
		if (str.equals("Log in to Facebook"));
		
	}

}
