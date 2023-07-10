package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");  
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("file:///C:/Users/manka/OneDrive/Desktop/multiple%20dropdown.html");
	     WebElement dropdown = driver.findElement(By.id("menu"));
	    Select sel = new Select(dropdown);
	    sel.selectByIndex(2);
	    
	    
	     
		 
	}

}
