package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumCourse {
	
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
	private WebElement coursejava;
	
	public SeleniumCourse(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
		
	}

	public void corejavacourse()
	{
		coursejava.click();
	}
	}
}
