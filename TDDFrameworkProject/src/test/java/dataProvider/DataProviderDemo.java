package dataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	public WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Test(dataProvider = "TestLogin")
	public void launchOrangeHRM(String username , String Password)throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(Password);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
	}

	@DataProvider(name = "TestLogin")
	public Object[][] loginIn()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		
		data[1][0] = "Arun";
		data[1][1] = "12352Ad";
		
		data[2][0] = "Arun";
		data[2][1] = "12352Ad";
		
		return data;
				
	}
}
