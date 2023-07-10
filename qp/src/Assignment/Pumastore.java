package Assignment;



import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pumastore {
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://in.puma.com/in/en?msclkid=3c9dadd7599613a586a2c9412f7ddc82&utm_aud=OTH&utm_campaign=BS_BNG_SEA-TXT_Brand-Exact&utm_medium=BS&utm_obj=CONV&utm_source=BNG-SEA-TXT");
	WebElement target = driver.findElement(By.xpath("//h3[text()='TRC Blaze Triple Unisex Sneakers']"));
	Point loc = target.getLocation();
	int xaxis = loc.getX();
	int yaxis = loc.getY();
	JavascriptExecutor jsc = (JavascriptExecutor)driver;
	jsc.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
	}

}
