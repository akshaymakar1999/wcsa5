package Javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrollleft {
	public static void main(String[] args) {
		System.setProperty("webDriver.microsoftedge.driver", "./drivers/microsoftedgedriver.exe");
		WebDriver	driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://dashboards.handmadeinteractive.com/jansonlove");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(-1000,0)");
	}

}
