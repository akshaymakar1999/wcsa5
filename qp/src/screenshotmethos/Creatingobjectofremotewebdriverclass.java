package screenshotmethos;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Creatingobjectofremotewebdriverclass {
	public static void main(String[] args) throws IOException {
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
	RemoteWebDriver 	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.flipkart.com/");
	File src = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshot/flipkart2.png");
	Files.copy(src, dest);
	}

}
