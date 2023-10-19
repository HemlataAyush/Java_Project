package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetcurrentURL {
	public static void main (String [] args ) {
		
		System.setProperty("webdriver.chrome .driver","\"C:\\chromedriver_win32.zip\"");
				
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		String URL = driver.getCurrentUrl();
		
		System.out.println(URL);
		
		if (URL.equals("https://www.amazon.in/"))
		   System.out.println("correct URL");
		   else {
			   System.out.println("incorrect URL");
		   }
		
		
		driver.close();
	}

}
