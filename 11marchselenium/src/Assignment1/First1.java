package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First1 {
	
	public static void main (String [] args)  {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement obj =driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		obj.sendKeys("dipali");
		
		WebElement obj1 =driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]"));
		obj1.sendKeys("Rajput");
		
		WebElement obj2 =driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"));
		obj2.sendKeys("chandraanad appartment karavand naka shirpur");
		
		WebElement obj3 =driver.findElement(By.xpath("//input[@type=\"email\"]"));
		obj3.sendKeys("dipaligirase@gmail.com");
		
		WebElement obj4 =driver.findElement(By.xpath("//input[@type=\"tel\"]"));
		obj4.sendKeys("93724578645");
		
		WebElement obj5 =driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		obj5.click();
		
	   WebElement languageDropdown = driver.findElement(By.id("msdd"));
       languageDropdown.click();
       
       WebElement englishOption = driver.findElement(By.xpath("//a[contains(text(),'Bulgarian')]"));
       englishOption.click();
       
       WebElement Hobbies =driver.findElement(By.xpath("//label[contains(text(),'Cricket')]"));
       Hobbies.click();
       
       WebElement skillsDropdown = driver.findElement(By.id("Skills"));
       skillsDropdown.sendKeys("Java");
       
       WebElement countryDropdown = driver.findElement(By.id("countries"));
       countryDropdown.click();
       
      WebElement SelectCountry = driver.findElement(By.xpath("//span[@role=\"combobox\"]"));
      SelectCountry.click();
       WebElement selectCountryOption = driver.findElement(By.xpath("//li[contains(text(),'India')]"));
       selectCountryOption.click();
       
       //WebElement selectCountry = driver.findElement(By.xpath("//li[text()='Australia']"));
       //selectCountry.click();
       
       WebElement yearDropdown = driver.findElement(By.id("yearbox"));
       Select S1 = new Select(yearDropdown);
       S1.selectByVisibleText("1996");

       WebElement monthDropdown = driver.findElement(By.xpath("//select[@placeholder='Month']"));
       Select S2 = new Select(monthDropdown);
       S2.selectByVisibleText("April");


       WebElement dayDropdown = driver.findElement(By.id("daybox"));
       Select S3 = new Select(dayDropdown);
       S3.selectByVisibleText("12");

       WebElement passwordField = driver.findElement(By.id("firstpassword"));
       passwordField.sendKeys("Password123");

       WebElement confirmPasswordField = driver.findElement(By.id("secondpassword"));
       confirmPasswordField.sendKeys("Password123");

       // Submit the form
       WebElement submitButton = driver.findElement(By.id("submitbtn"));
       submitButton.click();

   }










				
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	}


