package day_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
	
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
	public void add() throws InterruptedException
	{
		//username
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("8610949349");
		Thread.sleep(3000);
		
		//password
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("Admin@123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		Thread.sleep(3000);
	}
	
	
	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		//username
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("8610949349");
		Thread.sleep(3000);
		
		//password
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("Admin@123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		Thread.sleep(3000);
	}
	

	@Test(priority = 2)
	public void login1() throws InterruptedException
	{
		//username
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("8611549349");
		Thread.sleep(3000);
		
		//password
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("Admin@123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		Thread.sleep(3000);
	}

	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
