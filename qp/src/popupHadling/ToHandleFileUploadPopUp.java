package popupHadling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopUp {
public static void main(String[] args) throws IOException {
	System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://omayo.blogspot.com/");
	Actions act=new Actions(driver);
	WebElement uploadButton=driver.findElement(By.xpath("//h2[text()='UploadFile']"));
	uploadButton.click();
	File file = new File("./autoItPrograms/omayofileuplod.exe");
	
	
	Runtime.getRuntime().exec("./autoItPrograms/");
	
	
	
			
}
}
