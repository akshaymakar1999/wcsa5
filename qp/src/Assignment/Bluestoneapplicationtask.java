package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestoneapplicationtask {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.xpath("//span[text()='Not now']")).click();
	WebElement offers = driver.findElement(By.xpath("//span[text()='Offers ']"));
	Actions act = new Actions(driver);
	act.moveToElement(offers).perform();
	Robot robot = new Robot();
	for(int i=0;i<2;i++)
	{
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	Thread.sleep(1000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	if(driver.findElement(By.xpath("//div[text()='Why Gold Mine Plan?']")).isDisplayed())
	{
		Thread.sleep(2000);
		System.out.println("done..!");
		driver.quit();
	}
	else
	{
		System.out.println("not done");
	}
	
	}

}
