package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qofwindowhandle {
public static void main(String[] args) {
	System.setProperty("webDriver.chrome.driver","./drivers.chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://omayo.blogspot.com/");
	WebElement childwindow = driver.findElement(By.xpath("//a[text()='Open a popup window']"));
	Point elementloc = childwindow.getLocation();
	int xaxis = elementloc.getX();
	int yaxis = elementloc.getY();
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
	childwindow.click();
	String parenthandle = driver.getWindowHandle();
	Set<String> allhandle = driver.getWindowHandles();
	for(String wh:allhandle)
	{
		if(!parenthandle.equals(wh))
		{
			driver.switchTo().window(wh).close();
			break;
			
		}
	}
	
	
	
	
	

	
}
}
