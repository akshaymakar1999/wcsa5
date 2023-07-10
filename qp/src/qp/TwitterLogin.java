package qp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterLogin {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webDriver.chrome.driver", "./drivers/chromeDriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://twitter.com/i/flow/login");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[contains(@name,'text')]")).sendKeys("1234567890");
    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
    


	}

}
