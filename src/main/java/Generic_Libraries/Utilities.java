//Methods to handle all the WebElements of the WebApplication

package Generic_Libraries;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utilities {
	public void dropDown(WebElement ele, String text)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	public void mouseOver(WebDriver Driver, WebElement ele)
	{
		Actions a = new Actions(Driver);
		a.moveToElement(ele).perform();
	}
	
	public void doubleClick(WebDriver Driver, WebElement ele)
	{
	    Actions a = new Actions(Driver);
	    a.doubleClick(ele).perform();
	}

	public void frame(WebDriver Driver)
	{
		
		Driver.switchTo().frame(0);
	}
	
	public void switchbackfromframe(WebDriver Driver)
	{
		
		Driver.switchTo().defaultContent();
	}
	
	public void alert(WebDriver Driver)
	{
		Driver.switchTo().alert().accept();
		
	}
	
	public void buttons(WebDriver Driver, WebElement ele)
	{
	    Actions a = new Actions(Driver);
	    a.click(ele);
	}

	public void links(WebDriver Driver, WebElement ele)
	{
		Actions a = new Actions(Driver);
		a.click(ele);
	}
	
	public void switchingtab(WebDriver Driver) {
		Set<String> child = Driver.getWindowHandles();
		for(String b:child) {
				Driver.switchTo().window(b);
		}
	}
	
	public void frames(WebDriver Driver)
	{
	Driver.switchTo().frame(0);	
	}
	
	public void switchbacktoframe(WebDriver Driver) {
		Driver.switchTo().defaultContent();
		
	}


}