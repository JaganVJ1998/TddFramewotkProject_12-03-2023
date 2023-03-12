package day_01;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Grouping {
	public WebDriver driver;
  
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.decision168.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeBrowser()throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test(priority = 1, groups = "Login")
  public void clickLogin() throws InterruptedException{
		
		driver.findElement(By.xpath("//*[text()='LOG IN']")).click();
		Thread.sleep(3000);
		
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		
		Iterator<String> iterator = allWindows.iterator();
		
		while(iterator.hasNext())
		{
			String chldWindow = iterator.next();
			driver.switchTo().window(chldWindow);
			
			if(!parentWindow.equals(chldWindow))
			{
				driver.findElement(By.xpath("//*[@id='login_email']")).
				sendKeys("Admin123@gmail.com");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id='login_password']")).sendKeys("Adimn");
				Thread.sleep(3000);
			}
			
		}
		
  }
	
	@Test(priority = 2, groups = "Login" , enabled = false)
	public void enabldLogin() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[text()='LOG IN']")).click();
		Thread.sleep(3000);
		
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		
		Iterator<String> iterator = allWindows.iterator();
		
		while(iterator.hasNext())
		{
			String chldWindow = iterator.next();
			driver.switchTo().window(chldWindow);
			
			if(!parentWindow.equals(chldWindow))
			{
				driver.findElement(By.xpath("//*[@id='login_email']")).
				sendKeys("Jeevit123@gmail.com");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id='login_password']")).sendKeys("123566");
				Thread.sleep(3000);
			}
			
		}
	}
	@Test(priority = 2, groups = "Login" , dependsOnMethods = "clickLogin")
	public void invalidLogin() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[text()='LOG IN']")).click();
		Thread.sleep(3000);
		
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		
		Iterator<String> iterator = allWindows.iterator();
		
		while(iterator.hasNext())
		{
			String chldWindow = iterator.next();
			driver.switchTo().window(chldWindow);
			
			if(!parentWindow.equals(chldWindow))
			{
				driver.findElement(By.xpath("//*[@id='login_email']")).
				sendKeys("Jeevit123@gmail.com");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id='login_password']")).sendKeys("123566");
				Thread.sleep(3000);
			}
			
		}
	}
	
	@Test(priority = 4, groups = "Register")
	public void regstration() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[text()='REGISTER']")).click();
		Thread.sleep(3000);
		
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		
		Iterator<String> iterator = allWindows.iterator();
		
		while(iterator.hasNext())
		{
			String chldWindow = iterator.next();
			driver.switchTo().window(chldWindow);
			
			if(!parentWindow.equals(chldWindow))
			{
				driver.findElement(By.xpath("//*[@id='first_name']")).
				sendKeys("Arun");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id='middle_name']")).sendKeys("Kumar");
				Thread.sleep(3000);
			}
			
		}
	
	}
	
}
