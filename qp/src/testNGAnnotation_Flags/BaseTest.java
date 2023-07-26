package testNGAnnotation_Flags;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	static WebDriver driver;
	@BeforeMethod(description="open the browser")
	public void setUp() {
		 System.setProperty("webDriver.chrome.driver.", "./driver/chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://www.google.com");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
