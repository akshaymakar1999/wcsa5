package Actionsclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickandholdmethod {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.xpath("//span[text()='Not now']")).click();
	Actions act = new Actions(driver);
	WebElement watch = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
	act.moveToElement(watch).perform();
	Robot robot = new Robot();
	for(int i=0;i<=1;i++)	
	{robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Band']")).click();
    
	//robot.keyPress(KeyEvent.VK_ENTER );
	//robot.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement target = driver.findElement(By.xpath("//div[text()='Filter by']"));
	for(int i=1;i<=2;i++)
	{
		act.doubleClick(target);
	act.clickAndHold(target).perform();
	}
	Thread.sleep(4000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_C);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_C);
	driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).click();
	

	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	if(driver.findElement(By.xpath("//span[text()='1 Designs']")).isDisplayed())
	{
		Thread.sleep(2000);
		System.out.println("filter is successful");
		driver.quit();
	}
	else
	{
		System.out.println("Exception...!!!");
	}
	
	}
	
	}


