package scripts;

import org.testng.annotations.Test;

import POM.AddtocartPage;
import POM.SkillraryDemoLoginPage;
import POM.SkillraryLoginPage;
import genericLib.BaseClass;

public class AddingTocart extends BaseClass{
	
	@Test
	public void tc1() {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gerasButton();
		s.skillrarydemoApp();
		
		utilies.switchTabs(driver);
		
		SkillraryDemoLoginPage d=new SkillraryDemoLoginPage(driver);
		utilies.mouseHover(driver,d.getCourseTab());
		d.seleniumTrainingBtn();
		
		AddtocartPage a=new AddtocartPage(driver);
		utilies.doubleClick(driver,a.getPlusBtn());
		a.addtocart();
		
		utilies.alertPopupOk(driver);
		
		
		
	}

}
