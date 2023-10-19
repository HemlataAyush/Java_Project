package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	
	public static void main (String [] args ) throws InterruptedException {
		// 1 get method is used to open application or t enter the URL on web browser
		
		// 1 step 
		System.setProperty("webdriver.chrome .driver","\"C:\\chromedriver_win32.zip\"");
				
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		String Title=driver.getTitle();
		
		String ExpectedTitle ="online shopping site in india ;shop online for mobile ,book,watches ,shoes and more-Amazon,in";
		
		if (Title.equals(ExpectedTitle)) {
			System.out.println("correct title");
		}
			else {
				System.out.println("incorrect title");
			}
			
		}
		
	}

