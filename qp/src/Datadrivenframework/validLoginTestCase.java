package Datadrivenframework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validLoginTestCase {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webDriver.chrome.driver","./drivers.chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do;jsessionid=55gfvrdm72w61");
		
		Flib flib = new Flib();
		String validUsername = flib.readEXcelDataString("./data/ActiTimeTestData.xlsx", "validcreds", 1, 0);
		String validPassword = flib.readEXcelDataString("./data/ActiTimeTestData.xlsx", "validcreds", 1, 1);
		
		driver.findElement(By.name("username")).sendKeys(validUsername);
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		driver.findElement(By.id("loginButton")).click();
		
	}

}
