package popupHadling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alertpopup {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webDriver.edge.driver","/divers/msedgedriver.exe");
	WebDriver	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("file:///C:/Users/manka/OneDrive/Desktop/Alert%20popup.html");
	driver.findElement(By.xpath("//button[text()='click me!']")).click();
	Robot robot = new Robot();
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(2000);
	Alert al = driver.switchTo().alert();
	al.accept();
	}

}
