package ABC;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {

	public static void main(String[] args) throws IOException {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.makemytrip.com/");
   List<WebElement> Links = driver.findElements(By.tagName("a"));
   System.out.println(Links.size());
   int Brokenlink =0;
  
       for(WebElement S: Links) {
    	  String url = S.getAttribute("href");
    	  if(url==null || url.isEmpty()) {
    		  System.out.println("null or empty");
    	  }
    		URL   Link = new URL(url);
    		 HttpsURLConnection http = (HttpsURLConnection)Link.openConnection();
    		  http.connect();
    		  if(http.getResponseCode()>400) {
    			  System.out.println(http.getResponseCode()+"valid");
    		  }
    		  else {
    			  System.out.println(http.getResponseCode()+"broken link");
    		  }
    		  
    	  }
    	 System.out.println("Borkenlink"+Brokenlink); 
    	 
       }

	}


