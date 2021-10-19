package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterPage {
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playBtn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pauseBtn;
	
	@FindBy(xpath="//span[text()='Share via Twitter']")
	private WebElement twitter;
	
	public TwitterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void playbutton() {
		playBtn.click();
	}
	
	public void pausebutton() {
		pauseBtn.click();
	}
	
	public void twitterBtn() {
		twitter.click();
		
		
		
	}

}
