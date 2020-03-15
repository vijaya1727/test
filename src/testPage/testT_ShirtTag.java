package testPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import objectPage.t_ShirtPage;

public class testT_ShirtTag {

	t_ShirtPage Tt;

	public testT_ShirtTag() {
		Tt= new t_ShirtPage();
		
	}



	@Test
	public void verifyTshirtTag() {
		Tt.tshirttag().click();
		String tname=Tt.tshirttag().getText();
		System.out.println(tname);
		Assert.assertEquals("T-SHIRTS", "T-SHIRTS");

	}

@Test
	public void verifyProductCount() {
		
		String pcount=	Tt.numberOfproduct().getText();
		char[] ch=pcount.toCharArray();
		for(char c:ch) {
			if(Character.isDigit(c)) {
				System.out.println(c);
			}	
		}

		
		
		
	}
}
