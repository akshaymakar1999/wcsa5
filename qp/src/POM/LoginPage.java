package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// it is webelement repository
	
	@FindBy(xpath = "//*[@name='username']")private WebElement usnTB;
	@FindBy(xpath="//*[@name='pwd']")private WebElement pssTB;
	@FindBy(xpath="*//[contain(@class,'intial')]")private WebElement loginButton;
	@FindBy(id="keepLooggedInCheckBox")private WebElement checkBox;
	@FindBy(partialLinkText="Actimind Inc.")private WebElement actiMindLink;
	
	//intialization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPssTB() {
		return pssTB;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getActiMindLink() {
		return actiMindLink;
	}

	
	//operational methods
	
	public void validLoginMethod(String validUsername,String validPassword)
	
	{
		usnTB.sendKeys(validUsername);
		pssTB.sendKeys(validPassword);
		
		
	}
	
	
	
	
	
	
	
	
}
