package LogicalProgram;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) {
		
	 System.setProperty("webdriver.chrom.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32");
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/login/");
     driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 inputtext _1kbt inputtext _1kbt\"]")).sendKeys("Hemlata Uddhav patel");
     driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("3456789");
     driver.findElement(By.xpath("//a[text()=\"Forgotten account?\"]")).click();
     
	}

}
