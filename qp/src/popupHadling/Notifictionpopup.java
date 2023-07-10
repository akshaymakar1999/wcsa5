package popupHadling;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Notifictionpopup {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter browservalue..!!");
		String browservalue = sc.next();
		if(browservalue.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifictions");
	WebDriver	driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.easemytrip.com/flights.html");
		}
	
	else if(browservalue.equalsIgnoreCase("firefox"))
	{
		System.setProperty("ewbDriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxOptions fo = new FirefoxOptions();
        fo.addArguments("--disable-notifictions");
       WebDriver  driver=new FirefoxDriver(fo);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.easemytrip.com/flights.html");	
	}
	else if(browservalue.equalsIgnoreCase("edge"))
	{
		System.setProperty("webDriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--disable-notifictions");
	WebDriver	driver=new EdgeDriver(eo);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.easemytrip.com/flights.html");
	
	}
	}

}
