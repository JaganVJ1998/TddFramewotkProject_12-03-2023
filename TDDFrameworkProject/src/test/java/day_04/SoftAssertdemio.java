package day_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertdemio {

	public 	WebDriver driver;
	SoftAssert softassertassert = new SoftAssert();
	
	@BeforeMethod
	public void setBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com//");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	@Test
	public void title()throws InterruptedException
	{
	
		String actualtitle = driver.getTitle();
		System.out.println("Title: " + actualtitle);
		
		String exceptedTitle = "Facebook – log in or sign up1231459919";
		softassertassert.assertEquals(true, false);
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("12545@gmaiul.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Admin");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@name='login']")).click();
		softassertassert.assertAll();
		
//		driver.findElement(By.xpath("//*[@name='login']")).sendKeys(Keys.ENTER);
//		
//		driver.findElement(By.xpath("//*[@name='login']")).sendKeys(Keys.RETURN);

	}
}
