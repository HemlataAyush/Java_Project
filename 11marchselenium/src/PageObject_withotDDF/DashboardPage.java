package PageObject_withotDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	 WebDriver driver;
	@FindBy(xpath="//p[@class=\"oxd-userdropdown-name\"]")
   WebElement Name;
	
	@FindBy(xpath="//p[@class=\"oxd-text oxd-text--p orangehrm-attendance-card-details\" ]")
	WebElement Time;
	DashboardPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//3 
	public void Namevalidation() {
		String Text = Name.getText();
		if(Text. equals("Ajay Singh")) {
			System.out.println("correct username");
		}
		else {
			System.out.println("incorrect username");
			
		}
	}
	
	public void TimeAt() {
		boolean Time1= Time .isDisplayed();
		System.out.println(Time1);
	}
	
	

}
