package TestNGPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertioInTestNG {
  @Test
  public void assertionMethod1 () {
	  System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("http://127.0.0.1/login.do;jsessionid=55gfvrdm72w61\n");
	 String actualTitle = driver.getTitle();
	  
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(driver.getTitle(),actualTitle);
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  sa.assertAll();
	  
	  String actualTitleHomePage = driver.getTitle();
	 Assert.assertEquals(driver.getTitle(), actualTitleHomePage);
	 driver.findElement(By.xpath("//a[text()='Logout']")).click();
  }
  
}
