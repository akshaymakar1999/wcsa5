package TestNGPackage;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest {
	static WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		  System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			 driver.get("http://127.0.0.1/login.do;jsessionid=55gfvrdm72w61\n");
	}
	public void failedMethod(String methodName)
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
	     File dest = new File("./screenshot/"+methodName+".png");
		try
		{
			Files.copy(src, dest);
		}
		catch(Exception e)
		{
			
		}
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
