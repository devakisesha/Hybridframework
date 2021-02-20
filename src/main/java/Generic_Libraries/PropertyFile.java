//Class that is used to read the data from the data.properties file
package Generic_Libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile implements Auto_Constant {
	
	public String getData(String keys) throws FileNotFoundException, IOException
	{
		
		Properties p = new Properties();
		p.load(new FileInputStream(propertyfilepath));
		return p.getProperty(keys);
	}

}
