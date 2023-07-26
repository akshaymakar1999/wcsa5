package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class usersPage {
	
	@FindBy(xpath ="//input[@value='Create New User']")private WebElement userListCreatenewUserButton;
	@FindBy(xpath = "//*[@name='username']")private WebElement userTB;
	@FindBy(xpath = "//*[@name='passwordText']")private WebElement passTB;
	@FindBy(xpath = "//*[@name='passwordTextRetype']")private WebElement rePassTB;
	@FindBy(name =  "firstName")private WebElement fsName;
	@FindBy(xpath = "//*[@name='lastName']")private WebElement lsName;
	@FindBy(xpath = "//*[@id='right12']")private WebElement modifyTimeTaskCB;
	@FindBy(xpath = "(//TR[contains(@valign,'top')])[1]/TD[4]/TABLE/TBODY/TR[2]/TD[1]")private WebElement manageCPCB;
	@FindBy(xpath = "//input[@type='submit']")private WebElement createButton;
	
	
	public usersPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}


	public WebElement getCreateUser() {
		return userListCreatenewUserButton;
	}


	public WebElement getUserTB() {
		return userTB;
	}


	public WebElement getPassTB() {
		return passTB;
	}


	public WebElement getRePassTB() {
		return rePassTB;
	}


	public WebElement getFsName() {
		return fsName;
	}


	public WebElement getLsName() {
		return lsName;
	}
	
	
	public WebElement getModifyTimeTaskCB() {
		return modifyTimeTaskCB;
	}


	public WebElement getManageCPCB() {
		return manageCPCB;
	}


	public WebElement getCreateButton() {
		return createButton;
	}


	public void createManager(String username,String password,String fsname,String lsname) throws InterruptedException
	{
		Thread.sleep(2000);
		userListCreatenewUserButton.click();
		userTB.sendKeys(username);
		passTB.sendKeys(password);
		rePassTB.sendKeys(password);
		fsName.sendKeys(fsname);
		lsName.sendKeys(lsname);
		modifyTimeTaskCB.click();
		manageCPCB.click();
		createButton.click();
		
	}
	

}
