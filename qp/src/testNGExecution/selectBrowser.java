package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class selectBrowser {
	static WebDriver driver;
  @Test
  @Parameters({"browser","url","Vusername","Vpassword"})
  public void testMethod(String browserValue,String url,String usn,String pass) {
	  if(browserValue.equalsIgnoreCase("chrome"))
	  {	  
	  System.setProperty("webDriver.chrome.driver.", "./driver/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get(url);
	  driver.findElement(By.name("username")).sendKeys(usn);
	  driver.findElement(By.name("pwd")).sendKeys(pass);
	  driver.findElement(By.id("loginButon")).click();
	  }
	  else if(browserValue.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webDriver.gecko.driver.", "./driver/geckodriver.exe");
		  driver= new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get(url);
		  driver.findElement(By.name("username")).sendKeys(usn);
		  driver.findElement(By.name("pwd")).sendKeys(pass);
		  driver.findElement(By.id("loginButon")).click();
		  
	  }
		  
  }

}
