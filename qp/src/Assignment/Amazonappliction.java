package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonappliction {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webDriver.chrome.driver","./drivers.chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("vivo mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[text()='Vivo Y16 (Drizzling Gold, 3GB RAM, 64GB Storage) with No Cost EMI/Additional Exchange Offers']")).click();
		Thread.sleep(5000);
		String paranthandle = driver.getWindowHandle();
		Set<String> allhandle = driver.getWindowHandles();
		for(String wh:allhandle)
		{
			if(!paranthandle.equals(wh))
			{
			driver.switchTo().window(wh);
			break;
			}
			
		}
		Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='contextualIngressPtLabel_deliveryShortLine']")).click();
	driver.findElement(By.xpath("//input[@id='GLUXZipUpdateInput']")).sendKeys("411033");
	Thread.sleep(2000);
       Robot robot = new Robot();
       robot.keyPress(KeyEvent.VK_TAB);
       robot.keyRelease(KeyEvent.VK_TAB);
       
       robot.keyPress(KeyEvent.VK_ENTER);
       robot.keyRelease(KeyEvent.VK_ENTER);
       Thread.sleep(2000);
	WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	addtocart.click();
     //Thread.sleep(4000);
	//WebElement cart = driver.findElement(By.xpath("//form[@id='attach-view-cart-button-form']"));
	//cart.click();
	
		
		
	}

}
