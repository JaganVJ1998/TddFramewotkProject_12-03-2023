package day_01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	public WebDriver driver;
	
	@BeforeTest
	public void clickBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
	}
	
	@AfterTest(enabled = false)
	public void closeBroswer()
	 {
		driver.close();
	
	 }
	
	@Test
	public void clickHome() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[text()='Home']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
	@Test
	public void closeAD()
	{
		WebElement frame1 = driver.findElement(By.id("aswift_5"));
		driver.switchTo().frame(frame1);
		
		WebElement frame2 = driver.findElement(By.id("ad_iframe"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//*[text()='Close']")).click();
	}
	
	@Test
	@Parameters({"email"})
	public void sendUsername(String email)
	{
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(email);
	}

}
