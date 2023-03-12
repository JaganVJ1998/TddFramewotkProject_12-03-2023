package day_01;

import org.testng.annotations.Test;

public class Dependency {
 
	@Test
  public void high() {
	  
	  System.out.println("High School");
  }
  
  @Test(dependsOnMethods = "high")  //@Test(dependsOnMethods = {"high"})
  public void higher() {
	  
	  System.out.println("Higher Secondary School");
  }
  
  
  @Test(dependsOnMethods = "higher")
  public void exception()
  {
	  int i = 1/0;
	  System.out.println(i);
  }
  @Test(dependsOnMethods = "exception")
  public void college() {
	  
	  System.out.println("Under Graduate");
  }
}
