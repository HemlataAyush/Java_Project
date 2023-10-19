package PageObject_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectWithDDF {
	
	WebDriver driver;

	public PageObjectWithDDF(WebDriver driver) {
		
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//input[@id=\"email\"]")
			 public WebElement usermail;
	 
	 @FindBy(xpath="//input[@id=\"pass\"]")
	  public WebElement userpass;
	 
	 @FindBy(xpath="//button[@type=\"submit\"]")
	 public WebElement button;
	 
	 public void usermail(String email) {
		 usermail.sendKeys(email);
	 }
	 public void userpass(String pass) {
		 userpass.sendKeys(pass);
	 }
	 public void login() {
		 button.click();
	 }
	 public void GoTO() {
		 driver.get("https://www.facebook.com/");
	 }
		 
	 
			 
}
