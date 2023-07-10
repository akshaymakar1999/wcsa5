package DropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getoptionmethod {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");  
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("file:///C:/Users/manka/OneDrive/Desktop/multiple%20dropdown.html");
	     WebElement dropdown = driver.findElement(By.id("menu"));
	    Select sel = new Select(dropdown);
	    List<WebElement> dropdownoption = sel.getOptions();
	    for(int i=0;i<dropdownoption.size();i++)
	    {
	    	String option = dropdownoption.get(i).getText();
	    	System.out.println(option);
	    	Thread.sleep(1000);
	    }
	}

}
