package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoAppLogin {
	
	@FindBy(xpath="//a[@id=\"course\"]")
	private WebElement course;
	
	public WebElement getCourse() {
		return course;
	}
	
	@FindBy(xpath="//a[@text='Selenium Training']")
	private WebElement seleniumtraining;
	
	public DemoAppLogin(WebDriver Driver)
	{
	
	PageFactory.initElements(Driver, this);
	}	
	
	
	public void seleniumcourse() {
		seleniumtraining.click();
		
	}


}
