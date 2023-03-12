package day_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter {
	
	public WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	}
	
	@Test
	@Parameters({"email", "password"})
	public void add(String email, String password) throws InterruptedException
	{
		//username
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys(email);
		Thread.sleep(3000);
		
		//password
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys(password);
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
