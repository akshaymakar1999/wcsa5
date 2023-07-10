package screenshotmethos;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class creactingobjectofeventfiringwebdriverclass {
	public static void main(String[] args) throws IOException {
		System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.flipkart.com/");
	EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
	File src = edriver.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshot/flipkart3.png");
	Files.copy(src, dest);
	
	}

}
