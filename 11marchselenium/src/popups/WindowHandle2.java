package popups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.GetTitle;

public class WindowHandle2 {

	public static void main(String[] args) throws InterruptedException {
		
		  
		System.setProperty("webdriver chrome driver ", "C:\\Program Files\\Java\\jdk-19\\bin");
				
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
				
		driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		 Set<String> ChildWindow = driver.getWindowHandles();
		
		 //First method
		
		 Iterator<String> IT = ChildWindow.iterator();
		 String ParentWindow = IT.next();
		 String ChildWindows = IT.next();
		 
		 System.out.println(ParentWindow);
		 System.out.println(ChildWindows);
        
		 //second way
		 
		 List<String> IT1 = new ArrayList(ChildWindow);
		String Parent = IT1.get(0);
		 String child = IT1.get(1);
		 
		 System.out.println("ParentWindow"+Parent);
		 System.out.println("ChildWindow"+child);
		 
		// ArrayList<String>AL= driver.getWindowHandles();
		 
		 //How to switch selenium focus on child window
		 driver.switchTo().window(ParentWindow);
		 System.out.println("ParentWindow-->"+driver.getTitle());
		 driver.switchTo().window(ChildWindows);
		 System.out.println("ChildWindows-->"+driver.getTitle());
	}

}
