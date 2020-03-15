package objectPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends commonFunctions {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[1]/a")
	private WebElement women;

	@FindBy(xpath="//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a")
	private WebElement dress;
	
	@FindBy(xpath="//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a")
	private WebElement Tshirt;
	
	public WebElement getwomen() {
		return women;
	}
	
	public WebElement getdress() {
		return dress;
	}
	
	public WebElement getTshirt() {
		return Tshirt;
	}
	
	
	
	
}
