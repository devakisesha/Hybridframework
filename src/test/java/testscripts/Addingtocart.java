package testscripts;
import Generic_Libraries.Base_Class;
import Generic_Libraries.Utilities;
import PomPages.AddCart;
import PomPages.DemoAppLogin;
import PomPages.SkillRaryLogin;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Addingtocart extends Base_Class{
	
	public void addtocart() throws FileNotFoundException, IOException {
		
		SkillRaryLogin S = new SkillRaryLogin(Driver);
		Utilities U = new Utilities();
		S.gearsbtn();
		S.demoapp();
		U.switchingtab(Driver);
		
		DemoAppLogin L = new DemoAppLogin(Driver);
		U.mouseOver(Driver, L.getCourse());
		L.seleniumcourse();
		
		AddCart a = new AddCart(Driver);
		U.doubleClick(Driver, a.getAddbtn());
		a.submittocart();
		U.alert(Driver);
		a.addtocart();
		a.gotocart();
		Assert.assertEquals(Driver.getTitle(), p.getData("title"));
	}
	

}
