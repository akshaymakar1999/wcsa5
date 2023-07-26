package testNGAnnotation_Flags;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchTestCase extends BaseTest {

	@Test(description= "testcase1")
	public void search1() throws InterruptedException
	{
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
	}
	@Test(description= "testcase2")
	public void search2() throws InterruptedException
	{
		driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
		Thread.sleep(2000);
	}
	@Test(description= "testcase3")
	public void search3() throws InterruptedException
	{
		driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
		Thread.sleep(2000);
	}
}
