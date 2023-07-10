package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestonewebsite {
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[text()='Coins ']"));
		act.moveToElement(element).perform();
		driver.findElement(By.xpath("//span[text()='1 gram' and @class='prcs-d' and @data-p='gold-coins-22-weight-1gms,m']")).click();
		driver.close();
		
	}

}
