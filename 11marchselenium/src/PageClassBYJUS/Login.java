package PageClassBYJUS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Login{

	WebDriver driver;
	
	public Login (WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@id=\"ftc-online\"]")
	public WebElement sessiononline;
	
	@FindBy(xpath = "//input[@name=\"name\"]")
	public WebElement Name;
	
	@FindBy(xpath="//input[@name=\"mobile\"]")
	public WebElement Mobile;
	
	@FindBy(xpath="//button[@class=\"btn\"]")
	public WebElement button;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	public WebElement email;
	
	@FindBy(xpath ="//select[@name=\"state\"]")
	public WebElement State;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	public WebElement sumit;
	
	public void sessiononline(String online ) {
		sessiononline.click();
	}
	public void Name(String name) {
		Name.sendKeys(name);
	}
	public void Mobile(String phone) {
		Mobile.sendKeys(phone);
	}
	public void button(String button1) {
		button.click();
	}
	public void email(String username) {
	     email.sendKeys(username);
	}
	 public void STATE(String state) {
	        Select S1 = new Select(State);
	        S1.selectByVisibleText("Maharashtra");
	 }
	public void sumit(String Sumit) {
		sumit.click();
	}
	public void GOTO() {
		driver.get("https://byjus.com/");
	}
	
	public static void main (String [] args) {
		
		System.setProperty("Webdriver chrome driver", "\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Login LG = new Login(driver);
		LG.GOTO();
		LG.sessiononline.click();
		LG.Name("girase dipali");
		LG.Mobile("9373574331");
		LG.email("girasedipali3@gmail.com");
		LG.button.click();
		LG.STATE("Maharashtra");
		LG.sumit.click();
		
		
		
	}	

}
