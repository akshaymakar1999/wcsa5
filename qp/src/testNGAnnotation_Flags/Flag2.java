package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
//it is use to disable and enable the method/testcase
	@Test(description="login method!!", enabled=true)
	public void method1()
	{
		Reporter.log("method from flag2",true);
	}
	
	@Test(description="logout method!!",enabled=true)
	public void method2()
	{
		Reporter.log("method from flag2",true);
	}
	
}
