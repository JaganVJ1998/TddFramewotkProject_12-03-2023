package day_01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void f() {
	  System.out.println("Test");
  }
  
  @Test
  public void f1()
  {
	  System.out.println("Test 1");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("After method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
	  
  }
  
  

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Before Test");
  }
  
  

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("After Suite");
  }

}
