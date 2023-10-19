package Byju;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_link {
	
	public static void main (String [] args) throws IOException {
		
		System.setProperty("Webdriver chrome driver",  "\"C:\\chromedriver.exe\"");
				
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://byjus.com/");
		
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		
		System.out.println("number of link present in "+Links.size());
		
		int BrokenkLinks = 0;
		
		for(WebElement element : Links) {
			
			String url = element.getAttribute("href");
			
			if(url==null || url.isEmpty());
			
			System.out.println("null url ");
		
		URL Link =new URL(url);
		
		HttpURLConnection httpconn =(HttpURLConnection)Link.openConnection();
		
		httpconn.connect();
		
      	int rescode =	httpconn.getResponseCode();
      	
      	if(rescode >=400) {
      		
      		System.out.println(url +"- "+"is broken link ");
      	}
      	else {
      		System.out.println(url+ "-"+" is valid link");
      	}
		
	}
	
	}

	}

	

