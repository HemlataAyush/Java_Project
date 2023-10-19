package PageObject_withotDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_INFO {
	
	WebDriver driver;
	
	public  My_INFO (WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//input[@name=\"firstName\"]")
	public WebElement firstname;
	
	@FindBy(xpath="//input[@name=\"middleName\"]")
	public WebElement middlename;
	
	@FindBy(xpath="//input[@name=\"lastName\"]")
	public WebElement lastname;
	
	@FindBy(xpath="//a[@class=\"oxd-main-menu-item active\"]")
	public WebElement click;
	
	public void firstname(String Name) {
		firstname.sendKeys(Name);
	}
	public void middlename(String middle) {
		middlename.sendKeys(middle);
	}
	public void lastname(String last) {
		lastname.sendKeys(last);
	}
	public void GOTO() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
		
		
	}
	public void click() {
		click.click();
	}
	
	
	
	

}
