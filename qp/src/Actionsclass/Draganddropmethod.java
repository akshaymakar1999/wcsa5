package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddropmethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions act = new Actions(driver);
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement dest1 = driver.findElement(By.xpath("//ol[@id='loan']"));
		Thread.sleep(2000);
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dest2 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		
		WebElement src3 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dest3 = driver.findElement(By.xpath("//ol[@id='bank']"));
		
		WebElement src4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement dest4 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		act.dragAndDrop(src1, dest1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src2, dest2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src3, dest3).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src4, dest4).perform();
		
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//a[text()='Perfect!']")).isDisplayed())
		{
			System.out.println("drag and drop is done..!");
			Thread.sleep(2000);
			driver.quit();
			
		}
		else
		{
			System.out.println("Exception..!");
		}
	}

}
