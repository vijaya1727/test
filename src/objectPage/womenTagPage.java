package objectPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class womenTagPage extends commonFunctions {
	

		@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
		private WebElement womenTag;

		@FindBy(xpath="//span[@class='heading-counter']")
		private WebElement NumberOfProduct; 	

		@FindBys(@FindBy(xpath = "//ul[@class='product_list grid row']/li"))
		private List<WebElement> NumberOfProductImage;



		public WebElement verifywomentag() {
			return womenTag;
		}

		public WebElement productCount() {
			return NumberOfProduct;
		}
		
		
		
		
		public List<WebElement> image_Count() {
			return NumberOfProductImage;
			
		}

		public java.util.List<String> imagecount() {
			
			ArrayList<String>list = new ArrayList<String>();
			for (WebElement element : NumberOfProductImage) {
				list.add(element.getText());
			System.out.println("element"+element);
			}
			return list;
		}
		public womenTagPage() {
			PageFactory.initElements(driver, this);

		}

}
