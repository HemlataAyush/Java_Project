package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2_2 {
	
	public static void main (String [] args, int j) throws InterruptedException {
		
       System.setProperty("webdriver.chrome driver",  "\"C:\\chromedriver_win32.zip\"");
       
       WebDriver driver = new ChromeDriver();
       
      driver.manage().window().maximize();
       
       driver.get("https://www.facebook.com/");
       
        
        driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).isSelected();
        driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("dipaligirase@gmail.com");
        
        driver.findElement(By.xpath("//input[@type=\"password\"]")).isSelected();
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("1234");
        
        
        driver.findElement(By.xpath("//a[contains(@class,'42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")).click();
        Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("dipali");
         driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Rajput");
         driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("9601005247");
         driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]")).sendKeys("pavan143");
         
            driver.findElement(By.id("day")).click();
            driver.findElement(By.xpath("//option[@value=\"3\"]")).click();
            
            driver.findElement(By.id("month")).click();
            driver.findElement(By.xpath("//option[contains(text(),'May')]")).click();
            
            driver.findElement(By.id("year")).click();
            driver.findElement(By.xpath("//option[@value=\"2020\"]")).click();
            driver.close();
            
        WebElement Day =    driver.findElement(By.id("day"));
            
          WebElement Month =  driver.findElement(By.id("month"));
           WebElement year = driver.findElement(By.id("year"));
           
           //	Question 1
           //How will u get the total no size of list
           
          Select S1 = new Select(Day);
          List<WebElement>ListDay =S1.getOptions();
           System.out.println("Totalday--->"+ListDay.size());
           
           //Question 2
           //how will u print all the values
           for (int i=0; i <ListDay.size();i++) {
        	    String Dayvalues =ListDay.get(i).getText();
        	    //1= 1.gettext();
        	    System.out.println(Dayvalues);
        	    
        	    //question 3
        	//   How will u select specified values from the dropdown 
        	    if(Dayvalues.equals("14")) {
        	    	
          	ListDay.get(i).click();
        	   }
        	   
        }
           
           //select month
           Select S2 = new Select(Month);
           List<WebElement>Monthvalues = S2.getOptions();
           System.out.println("Total month --->"+Monthvalues.size());
           
           System.out.println();
           
           for( j=0;j<Monthvalues.size();j++);
		String months =Monthvalues.get(j).getText();
		
		System.out.println(months);
		if(months.equals("may")) {
			
			Monthvalues.get(j).click();
			
		}
           
           
           
           
           
           
           
           
           
           
            
 
       
      
             
	}

}
