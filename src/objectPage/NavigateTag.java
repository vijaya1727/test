package objectPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class NavigateTag  extends commonFunctions{

	
	public  NavigateTag() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[1]/a")
	private WebElement women;
	
	@FindBy(xpath="//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a")
	private WebElement Dress;
	
	@FindBy(xpath="//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a")
	private WebElement TShirt;
	
	
	
	public WebElement getWomenTag() {
		
		return women;
	}
	
	public WebElement getDreesTag() {
		
		return Dress;
	}
	
	public WebElement getTshirtTag() {
		
		return TShirt;

	}
	
	
	
	
	
	
	
	
	
	
	
}
