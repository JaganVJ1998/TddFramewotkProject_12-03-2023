package day_01;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssert {
	
	public 	WebDriver driver;
	
	@BeforeMethod
	public void setBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test(priority = 1, expectedExceptions = NoSuchElementException.class)
	public void title()throws InterruptedException
	{
		
		
		String title = driver.getTitle();
		System.out.println("Title of the webpoage: " + title);
		assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", title);
		
		String url = driver.getCurrentUrl();
		System.out.println("Current Url of the webpoage: " + url);
		assertEquals("https://www.amazon.in/", url);	
		
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[2]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[3]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[4]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
//		softassert.assertAll();
	}
	
//	@Test(priority = 2)
//	public void clickAmazon()
//	{
//		SoftAssert softassert = new SoftAssert();
//		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[1]")).sendKeys(Keys.ENTER);
//		
//		softassert.assertAll();
//	}
	

}
