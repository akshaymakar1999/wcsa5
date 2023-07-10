package qp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpkartLogin {

	public static void main(String[] args) {
		  System.setProperty("webDriver.chrome.driver", "./drivers/chromeDriver.exe");
		    WebDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.flipkart.com/");
		    driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("hp laptop");
		    

	}

}
