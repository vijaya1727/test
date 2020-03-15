package objectPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class t_ShirtPage extends commonFunctions {

	public t_ShirtPage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement Tshirttag;

	@FindBy(className="heading-counter")
	private WebElement productcount;
	
	

	public WebElement tshirttag() {
		return Tshirttag;
	}

	public WebElement numberOfproduct() {

		return productcount;
	}



}
