package HashMap;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static HashMap<String, String> LoginData() {
		
		HashMap<String,String> HM = new HashMap<>();
		
		HM.put("A", "Ketan:Ketan123");
		HM.put("B", "Rohit:Rohit123");
		HM.put("C", "Raju:Raju123");
		HM.put("D", "Ravi:Ravi123");
		return HM;
		
		 
	}
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		 String Name = LoginTest.LoginData().get("B");
		 
		 String arr[] = Name.split(":");
		 
		 driver.findElement(By.id("email")).sendKeys(arr[0]);
		 
		 driver.findElement(By.id("pass")).sendKeys(arr[1]);
		 
		 driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		 
		 String Act_Title = driver.getTitle();
		 System.out.println(Act_Title);
		 if(Act_Title.equals("Log in to Facebook")) {
			 System.out.println("correct title");
		 }
		 else {
			 System.out.println("incorrect title");
		 }
		 
		 driver.quit();
		
	}
	

}
