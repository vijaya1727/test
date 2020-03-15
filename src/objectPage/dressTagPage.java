package objectPage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class dressTagPage extends commonFunctions {


	public dressTagPage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//*[@id=\'block_top_menu\']/ul/li[2]/a")
	private WebElement DressTag;

	@FindBy(xpath="//*[@class='heading-counter']")
	private WebElement VisibleNumberOfDress;

	@FindBys(@FindBy(xpath="//*[@class='product_list grid row']/li"))
	private List<WebElement>ActualNumberOfDress;

	@FindBy(xpath="//ul[@class='product_list grid row']/li[1]/div/div[2]/div[2]/a[1]/span")
	private WebElement firstProduct;

	
	@FindBy(xpath="//ul[@class='product_list grid row']/li[1]")
	private WebElement AddtoCart;

	@FindBy(xpath="//*[@id='layer_cart']/div/div/div[4]/a/span")
	private  WebElement proceedToCheckout;

	@FindBy(xpath="//td[@class='cart_quantity text-center']/input[2]")
	private WebElement NumberOfQty;

	@FindBy(id="cart_quantity_up_3_13_0_0")
	private WebElement IncreaseCount;

	@FindBy(id="newsletter-input")
	private WebElement Email;

	@FindBy(xpath="//*[@id=\'columns\']/p")
	private WebElement Newsletter;
	
	@FindBy(xpath="//button[@class='btn btn-default button button-small']")
	private WebElement NewsLetterClickBtn;

	public WebElement dressTag() {
		DressTag.click();	
		return DressTag;
	}
	public int visibleCount() {
		return Integer.parseInt(VisibleNumberOfDress.getText().split(" ")[2]);
	}
	public int actualDressCount() {
		return ActualNumberOfDress.size();
	}
	public void addtoCart() {
		actionMethod(AddtoCart);
		firstProduct.click();
		proceedToCheckout.click();

		int a=Integer.parseInt(getAttributeValue(NumberOfQty, "value"));
		if(a==1) {
			for(int i=0;i<=1;i++) {
				IncreaseCount.click();
			}
		}
	}
	public String emailsubscription(String email) {
		Email.sendKeys(email);
		NewsLetterClickBtn.click();
		return email;
	}

	public String newLetterMessage() {
		 String message=Newsletter.getText();
		 return message;
	}






























	/*public List<WebElement> getSize(){

		int visibleproductcount = 0;
		String vt=dt.visibleText().getText();
		System.out.println(vt);


		char[] ch=vt.toCharArray();
		for (char c:ch) {
			if (Character.isDigit(c)) {
				System.out.println("Number of visible product count: "+c);
				visibleproductcount=Character.getNumericValue(c);
			}

		}
		int ActCount =0;
		for (WebElement act:dt.actualDress()) {
			ActCount=ActCount+1;
		}
		System.out.println("Number of actual count :"+ActCount);

		Assert.assertEquals(visibleproductcount, ActCount);
	}
		return Size;
	}*/






}
