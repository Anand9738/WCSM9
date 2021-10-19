package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {

	@FindBy(id="add")
	private WebElement plusBtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocartbtn;
	
	public AddtocartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getPlusBtn() {
		return plusBtn;
	}
	
	public void addtocart() {
		addtocartbtn.click();
	}
	
}
