package MultipleLinkHandle;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class acv {

	public static void main(String[] args) throws IOException {

    WebDriverManager.chromedriver().setup();
    
    WebDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("https://www.facebook.com/");
    
    List<WebElement> Link = driver.findElements(By.tagName("a"));
    System.out.println(Link.size());
    int BrokenLink =0;
    for(WebElement element : Link ) {
    	String url = element.getAttribute("href");
    	
    	if(url ==null || url.isEmpty()) {
    		System.out.println("is null and Empty");
    	}
    	
    	URL Links = new URL(url);
    	HttpsURLConnection httpscode = (HttpsURLConnection)Links.openConnection();
    	httpscode.connect();
    	if(httpscode.getResponseCode()>=400) {
    		System.out.println(httpscode.getResponseCode()+"-->"+url+"Broken Link");
    		BrokenLink++;
    	}else {
    		System.out.println(httpscode.getResponseCode()+"-->"+url+"Valid Link");
    	}
    }
    System.err.println(BrokenLink);
    driver.quit();
	}

}
