package LogicalProgram;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathbyAttribute1 {

	public static void main(String[] args) throws InterruptedException {
		
	//Syntax - //driver.findelement(By.path("Xpath expression);
		
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(400);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 inputtext _1kbt inputtext _1kbt\"]")).sendKeys("Hemlata Patel");
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Hemlata.patel2412@gmail.com");
        driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("1234");
        driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("1345678909");	
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();	
        driver.findElement(By.xpath("//div[@class=\"_9ay7\"]")).click();
        
        Thread.sleep(4000);
        driver.close();
	}

}
