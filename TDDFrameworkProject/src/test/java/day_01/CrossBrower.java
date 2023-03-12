package day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrower {
	
	public WebDriver driver;
  @Test
  public void chromeBrowser() {
	  
	  WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  
	  driver.close();
  }
  
  @Test
  public void edgeBroswer()
  {
	  WebDriverManager.edgedriver().setup();
	   driver = new EdgeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();  
	  driver.close();
  }
}
