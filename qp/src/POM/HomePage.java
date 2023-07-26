package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//A[@class='content tt_selected selected']/descendant::IMG")private WebElement timeTrackModule;
	@FindBy(xpath="//A[@class='content tasks']/descendant::IMG[@class='sizer']")private WebElement taskModule;
	@FindBy(xpath="//A[@class='content reports']/descendant::IMG[@class='sizer']")private WebElement reportsModule;
	@FindBy(xpath="//A[@class='content users']/descendant::IMG[@class='sizer']")private WebElement userModule;
	@FindBy(xpath="//A[@class='content calendar']/descendant::IMG[@class='sizer']")private WebElement workScheduleModule;
	@FindBy(xpath="//A[@class='content administration']/descendant::IMG[@class='sizer']")private WebElement settingsModule;
	@FindBy(xpath="//a[.='Logout']")private WebElement logOutLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getTimeTrackModule() {
		return timeTrackModule;
	}

	public WebElement getTaskModule() {
		return taskModule;
	}

	public WebElement getReportsModule() {
		return reportsModule;
	}

	public WebElement getUserModule() {
		return userModule;
	}

	public WebElement getWorkScheduleModule() {
		return workScheduleModule;
	}

	public WebElement getSettingsModule() {
		return settingsModule;
	}

	public WebElement getLogOutLink() {
		return logOutLink;
	}
	
	public void clickOntimeTrackModule()
	{
		timeTrackModule.click();
	}
	public void clickOntaskModule()
	{
		taskModule.click();
	}
	public void clickOnreportsModule()
	{
		reportsModule.click();
	}
	public void clickOnuserModule()
	{
		userModule.click();
	}
	public void clickOnworkScheduleModule()
	{
		workScheduleModule.click();
	}
	public void clickOnSettingsModule()
	{
		settingsModule.click();
	}
	public void clickOnlogOutLink()
	{
		logOutLink.click();
	}
	
}
