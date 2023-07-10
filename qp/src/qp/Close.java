package qp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "./driver/chromeDriver.exe");
		 WebDriver driver=new ChromeDriver();
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);

	     driver.close();
	}

}
