package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testMethod5 {
  @Test
  public void testMethod5() {
	  long threadId5 = Thread.currentThread().getId();
	  Reporter.log("thread id of testMethod5:"+threadId5,true);
  }
  @Test
  public void testMethod6() {
	  long threadId6 = Thread.currentThread().getId();
	  Reporter.log("thread id of testMethod6:"+threadId6,true);
	  
  }
}
