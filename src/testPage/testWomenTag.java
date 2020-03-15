package testPage;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectPage.womenTagPage;

public class testWomenTag    {


	womenTagPage womenPO;


	public testWomenTag() {
		womenPO= new womenTagPage();
	}

	@Test
	public void verifyclickWomenTag() {

		womenPO.verifywomentag().click();
		String wname=	womenPO.verifywomentag().getText();
		Assert.assertEquals("WOMEN", wname);

	}
	@Test
	public void verifyNumberOfProduct() {
		String productText= womenPO.productCount().getText();
		System.out.println("Product T: "+productText);
		char[] ch=productText.toCharArray();
		for (char c:ch) {
			if(Character.isDigit(c)) {
				System.out.println("product count"+c);
				int b=Integer.parseInt(String.valueOf(c));
			}
			int i=0;
			for(WebElement image:womenPO.image_Count()) {

				i=i+1;
			}
			Assert.assertEquals(i, c);
			
			System.out.println("Number of product: "+i+"Actual product: "+c);
		}
	}






}







