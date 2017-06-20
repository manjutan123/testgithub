package gitTest;

import org.junit.Assert;
import org.testng.annotations.Test;

import org.testng.asserts.*;


public class FirstTestng {
  @Test
  public void f1()
  {
	  Assert.assertEquals(10, 40);
  }
  
  @Test
  public void f2()
  {
	  Assert.assertEquals(10, 10);
  }
}
