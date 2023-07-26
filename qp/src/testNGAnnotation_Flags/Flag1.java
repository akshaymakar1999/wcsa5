package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	//it is describe method or test case
	@Test(description="Login Method!!!")
	public void method1()
	{
		Reporter.log("method1 from flag1");
	}
	@Test(description="Logout method!!")
	public void method2()
	{
		Reporter.log("method2 from flag1");
	}

}
