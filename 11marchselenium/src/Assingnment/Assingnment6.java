package Assingnment;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assingnment6 {
	//2 get the current window handle and write to the console window it must be first window handle 
	public static void main (String [] args) throws InterruptedException {
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		
		String Window =driver.getWindowHandle();
		
		System.out.println(Window);
		
		//3locate the visit link and click it
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//a[contains(text(),'Visit W3Schools.com!')]")).click();
		
		
	
		//4 get all window handles and hold them in a list
		Set<String>window1 = driver.getWindowHandles();
		
		
		ArrayList<String> handlewindow =new ArrayList(window1);
		
		String parent=handlewindow.get(0);
		String Child =handlewindow.get(1);
		
		System.out.println("parentwindow---->"+parent);
		System.out.println("childwindow----->"+Child);
		
		driver.switchTo().window(parent);
		System.out.println("parentwindow--->"+driver.getTitle());
		
		driver.switchTo().window(Child);
		System.out.println("Childwindow--->"+driver.getTitle());
		
	     Thread.sleep(3000);
		
	     //6
	     driver.switchTo().window(parent);
	     System.out.println("Parent---->"+parent);
	     Thread.sleep(3000);
	     driver.switchTo().window(Child);
	     System.out.println("child---->"+Child);
	     Thread.sleep(3000);
	     
	     //7
	     String SecondWindows = driver.getWindowHandle();
	     System.out.println("secondwindows---->"+SecondWindows);
	     
	     //8
	    boolean Text1 = driver.findElement(By.xpath("//a[@title=\"w3schools.com Home\"]")).isDisplayed();
	    System.out.println(Text1);
	    
	    //9
	          driver.switchTo().window(parent);
	          System.out.println("Firstwindow---->"+parent);
	          Thread.sleep(200);
	          
	          //10
	          String Fwindow = driver.getWindowHandle();
	          System.out.println("Firstwindow--->"+Fwindow);
	          Thread.sleep(200);
	          //11
	          String output = driver.findElement(By.xpath("//button[contains(text(),'Run ')]")).getText();
	          System.out.println(output);
	          
	          driver.quit();
	          
	
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
		
	
		
		
		
		
	
		
		
		
		
	}
	

}
