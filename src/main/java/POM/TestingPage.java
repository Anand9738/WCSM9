package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookicon;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void facebook() {
		facebookicon.click();
	}

	public WebElement getFacebookicon() {
		return facebookicon;
	}

}
