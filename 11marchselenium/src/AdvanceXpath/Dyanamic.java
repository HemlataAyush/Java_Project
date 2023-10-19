package AdvanceXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dyanamic {

	public static void main(String[] args) {

  WebDriverManager.chromedriver().setup();
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.superbmytrip.com/");
  driver.findElement(By.xpath("//input[@id=\"txtFromCity\"]")).clear();
  driver.findElement(By.xpath("//input[@id=\"txtFromCity\"]")).sendKeys("Bangalore");

	}

}
