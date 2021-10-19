package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import POM.FacebookPage;
import POM.SkillraryDemoLoginPage;
import POM.SkillraryLoginPage;
import POM.TestingPage;
import genericLib.BaseClass;

public class FaceBookLike extends BaseClass{
	@Test
	public void tc2() throws IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gerasButton();
		s.skillrarydemoApp();
		
		utilies.switchTabs(driver);
		
		SkillraryDemoLoginPage d=new SkillraryDemoLoginPage(driver);
		utilies.dropDown(d.getCoursedd(),pdata.getPropertyData("coursedd"));
	    
		TestingPage t=new TestingPage(driver);
		WebElement fb = t.getFacebookicon();
		Point loc = fb.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		utilies.scrollBar(driver, x, y);
		t.facebook();
		
		FacebookPage fbp=new FacebookPage(driver);
		fbp.likeButton();
		
		
		
	
	}
	
	

}
