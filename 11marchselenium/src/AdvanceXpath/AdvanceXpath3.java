package AdvanceXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceXpath3 {
public static void main (String [] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		/*Xpath axes air those axes that are used to search for multiple nodes in DDM xml document
		from current node context
		
		those method are mainly used when webelement is not identified with the help of ID,
		tagName, Class, Classname, Partial linkText, linkText,css selector
		
		*/
		
		/*Xpath axes
		 * 1.Self
		 * 2.Parent
		 * 3.Child
		 * 4.Ancestor
		 * 5.Descendant
		 * 6.following
		 * 7.following-sibling
		 * 8.Preceding
		 * 9.Preceding-sibling
		*/
		
		//Self
		String Text = driver.findElement(By.xpath("//a[contains(text(),'JK Lakshmi Cement L')]/self::a")).getText();
		System.out.println(Text);
		
		//parent
		String Text1 = driver.findElement(By.xpath("//a[contains(text(),'JK Lakshmi Cement L')]/parent::td")).getText();
		System.out.println(Text1);
		
		//child
		//i want to find child element
		  List<WebElement> child = driver.findElements(By.xpath("//a[contains(text(),'JK Lakshmi Cement L')]/ancestor::tr/child::td"));
		  System.out.println("Number of child element "+child.size());
		 
		  String Text2 = driver.findElement(By.xpath("//a[contains(text(),'JK Lakshmi Cement L')]/ancestor::tr")).getText();
		  System.out.println(Text2);
	
		
		//System Sy = new System();   //system is a final class so we can not create object
		//String s1 = new String();	
		
		//Descendent
		 List<WebElement> Text3 = driver.findElements(By.xpath("//a[contains(text(),'SBI Life Insurance')]/ancestor::tr/descendant::td"));
		 System.out.println("Number of desecendent node "+Text3.size());
		 
		 //following
		 List<WebElement> Text4 = driver.findElements(By.xpath("//a[contains(text(),'SBI Life Insurance')]/following::tr"));
		 System.out.println("Number of following node "+Text4.size());
		 
		 //Following - sibling
		 List<WebElement> Text5 = driver.findElements(By.xpath("//a[contains(text(),'SBI Life Insurance')]/ancestor::tr/following::tr"));
		 System.out.println("Number of following-sbling node "+Text5.size());
		 
		 //Preceding - Select all the element before the node/document
		 List<WebElement> Text6 = driver.findElements(By.xpath("//a[contains(text(),'SBI Life Insurance')]/ancestor::tr/descendant::td"));
		 System.out.println("Number of Preceding node "+Text6.size());
		 
		 //Preceding -sibling
		List<WebElement> Text7 = driver.findElements(By.xpath("//a[contains(text(),'SBI Life Insurance')]/ancestor::tr/preceding-sibling::tr"));
		 System.out.println("Number of Preceding-sibling node "+Text7.size());
		 driver.quit();
		 
}
}
