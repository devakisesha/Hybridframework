package Generic_Libraries;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots implements Auto_Constant{
	
	public String getScreenshots(WebDriver Driver, String FailedTC) throws IOException
	{
		Date d = new Date();
		String date = d.toString().replaceAll(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot)Driver; 
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(screenshot+date+FailedTC+".png");
		FileUtils.copyFile(src, dest);
		return date;
	}

}
