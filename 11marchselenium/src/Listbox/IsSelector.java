package Listbox;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrom.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
	    boolean B1 = driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
        System.out.println(B1);
        
        driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
        boolean B2 = driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
        System.out.println(B2);
        
        driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
        boolean B3 = driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
        System.out.println(B3);
        driver.quit();

	}


		
		
		
	}
	