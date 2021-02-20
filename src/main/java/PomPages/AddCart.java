package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCart {
	@FindBy(id="add")
	private WebElement addbtn;
	
	public WebElement getAddbtn() {
		return addbtn;
	}

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submitbtn;
	
	@FindBy(xpath="i//[@class=' fa fa-shopping-cart']")
	private WebElement addtocarticon;
	
	@FindBy(xpath="//a[text()='Go to Cart']")
	private WebElement gotocart;
	
	public AddCart(WebDriver Driver){
	PageFactory.initElements(Driver, this);
	}
	
	public void submittocart() {
		submitbtn.click();
	}
	
	public void addtocart() {
		addtocarticon.click();
	}
	
	public void gotocart() {
		gotocart.click();
	}

}