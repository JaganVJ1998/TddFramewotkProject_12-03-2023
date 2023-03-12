package day_01;

import org.testng.annotations.Test;

public class Exception {
 
	
	@Test(expectedExceptions = ArithmeticException.class)
  public void f() {
	  
	  int sv = 1/0;
	  System.out.println(sv);
	  
  }
}
