package scrennshot;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class TestClass extends BaseClass {
	
	@Test
	public void launchorangeHRM()throws InterruptedException
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123456");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		
		
	}
	
	@Test
	public void freejobalert()throws InterruptedException
	{
		driver.get("https://www.freejobalert.com/");
		
		String title = driver.getTitle();
		System.out.println("Title" + title);
		assertEquals(true, false);
	}
	

}
