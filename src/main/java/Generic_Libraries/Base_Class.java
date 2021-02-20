//Open and close application and take screenshot methods

package Generic_Libraries;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Class implements Auto_Constant{
	public PropertyFile p = new PropertyFile();
	public WebDriver Driver;
	public Utilities U=new Utilities();
	
@BeforeMethod
public void openApp() throws FileNotFoundException, IOException
{
	System.setProperty("key","value");
	Driver = new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get(p.getData("URL"));
	Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}

@AfterMethod
public void closeApp(ITestResult r) throws IOException
{

	if(r.getStatus()==2)
	{
		String testcasename = r.getName();
		Screenshots s = new Screenshots();
		s.getScreenshots(Driver, testcasename);
		
	}
	Driver.quit();
}

}
