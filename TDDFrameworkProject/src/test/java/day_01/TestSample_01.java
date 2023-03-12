package day_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSample_01 {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException{
	  
	//username
			driver.findElement(By.xpath("//*[@name='email']")).sendKeys("8610949349");
			Thread.sleep(3000);
			
			//password
			driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("Admin@123");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
			Thread.sleep(3000);
  }
  
  @Test(enabled = false)
  public void f1() throws InterruptedException{
	  
	//username
	  driver.findElement(By.xpath("//*[@name='email']")).clear();
	  Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@name='email']")).sendKeys("8610949349");
			Thread.sleep(3000);
			
			//password
			driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("Admin@123");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
			Thread.sleep(3000);
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
