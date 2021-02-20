package PomPages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import Generic_Libraries.Base_Class;

public class TakeCourse extends Base_Class{

	@Test
	public void takejavecourse() throws FileNotFoundException, IOException, InterruptedException {
		SkillRaryLogin S = new SkillRaryLogin(Driver);
		S.searchcourse(p.getData("coursename"));
		SeleniumCourse S1 = new SeleniumCourse(Driver);
		S1.corejavacourse();		
		CoreJavaTraining C = new CoreJavaTraining(Driver);
		U.frame(Driver);
		C.playvideo();
		U.switchbackfromframe(Driver);
		C.takecourse();
		
		
		
		
		
				
				
		
	}
}
