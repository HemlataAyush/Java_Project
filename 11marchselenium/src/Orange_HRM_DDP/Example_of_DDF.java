package Orange_HRM_DDP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_of_DDF {
	
	public static void main(String [] args) throws IOException {
		
		System.setProperty("Webdriver chrome driver", "\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		String path ="C:\\28march evening batch\\11marchselenium\\Excel.file\\Orenge_HRM.xlsx";
		
		FileInputStream File = new FileInputStream(path);
		
		String UserName = WorkbookFactory.create(File).getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(UserName);
				
		
		FileInputStream File1 = new FileInputStream(path);
		
		String password = WorkbookFactory.create(File1).getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		FileInputStream File2 =new FileInputStream(path);
		
		String Name = WorkbookFactory.create(File2).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String UName = driver.findElement(By.xpath("//p[contains(text(),'Paul Collings')]")).getText();
		
		System.out.println(Name);
	    if(UName.equals(Name)) {
	  System.out.println("correct user name or login successfully");
		} else 
			System.out.println("incorrect username or password");
	}		
		
	}


