package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandle {
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","./drivers.chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://omayo.blogspot.com/");
	//get the handle or addr.
	String parenthandle = driver.getWindowHandle();
	System.out.println("addres of parent window:"+parenthandle);
	driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
	String childwindow = driver.getWindowHandle();
	System.out.println("addres of child window:"+childwindow);
	Set<String> allwindow = driver.getWindowHandles();
	for(String wh:allwindow)
	{
		System.out.println(wh);
	}
	} 

}
