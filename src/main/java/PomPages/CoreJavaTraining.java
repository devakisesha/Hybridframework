package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaTraining {
	
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbtn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//a[@text=' TAKE THIS COURSE ']")
	private WebElement takecourse;
	
	public CoreJavaTraining(WebDriver Driver)
	{
	PageFactory.initElements(Driver,this);	
	}
	
	public void playvideo() throws InterruptedException
	{
		playbtn.click();
		Thread.sleep(10);
		pausebtn.click();
		
	}
	
	public void takecourse() {
		
		takecourse.click();
	}
}


