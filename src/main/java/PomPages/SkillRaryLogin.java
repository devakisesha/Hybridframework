package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryLogin {
	
	@FindBy(xpath="//a[@text()=' GEARS ']")
	private WebElement gears;
	
	@FindBy(xpath="//a[@text()=' SkillRary Demo APP'][2]")
	private WebElement demoapp;
	
	public SkillRaryLogin(WebDriver Driver)
	{
	
	PageFactory.initElements(Driver, this);
	}		
	
	public void gearsbtn()
	{
	gears.click();
	}

	public void demoapp()
	{
		demoapp.click();
	
	}

}