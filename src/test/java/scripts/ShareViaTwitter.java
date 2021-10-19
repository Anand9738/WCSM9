package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import POM.CoursePage;
import POM.SkillraryLoginPage;
import POM.TwitterPage;
import genericLib.BaseClass;

public class ShareViaTwitter extends BaseClass {
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.serachtextbox(pdata.getPropertyData("text"));
		s.goButton();
		
		CoursePage c=new CoursePage(driver);
		Thread.sleep(3000);
		c.xclose();
		utilies.mouseHover(driver,c.getTesting());
		c.automationTestingbtn();
		c.corejava();
		
		TwitterPage t=new TwitterPage(driver);
		utilies.switchFrame(driver);
		t.playbutton();
		Thread.sleep(10000);
		t.pausebutton();
		utilies.switchBackFrame(driver);
		t.twitterBtn();
	}

}
