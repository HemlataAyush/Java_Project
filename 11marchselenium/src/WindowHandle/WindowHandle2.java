package WindowHandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {
	
	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("Webdriver chrome driver",  "\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Thread.sleep(2000);
		Set<String>windowID=driver.getWindowHandles();
		
		//It is used to store all opened window id in the set data
		
		//First Method
		
		Iterator <String>It = windowID.iterator();
		String Parentwindow=It.next();
		String Childwindow=It.next();
		
		System.out.println("ParentWindow---->"+Parentwindow);
		System.out.println("Childwindow----->"+Childwindow);
		
		//Second Way
		
		List<String>windowList =new ArrayList(windowID);
		
		String parent = windowList.get(0);
		String Child = windowList.get(1);
		
		System.out.println("Parentwindow--->"+parent);
		System.out.println("Childwindow---->"+Child);
		
		//how  to switch selenium focus on child window
		
		driver.switchTo().window(Parentwindow);
		System.out.println("Parentwindow--->"+driver.getTitle());
		
		driver.switchTo().window(Childwindow);
		System.out.println("Childwindow---->"+driver.getTitle());
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
