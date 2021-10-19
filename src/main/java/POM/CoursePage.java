package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage {
	
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
   private WebElement selenium;
	
	@FindBy(xpath="(//span[@class='category-name'])[32]")
	private WebElement testing;
	
	@FindBy(xpath="//a[text()='Automation Testing']")
	private WebElement automation;
	
	@FindBy(xpath="//a[text()='X']")
	private WebElement closex;
	
	public CoursePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void corejava() {
		selenium.click();
	}
	
	public void automationTestingbtn() {
		automation.click();
	}

	public WebElement getTesting() {
		return testing;
	}
	
	public void xclose() {
		closex.click();
	}
}
