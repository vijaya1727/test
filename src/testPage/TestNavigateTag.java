package testPage;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.Test;

import objectPage.NavigateTag;
import objectPage.commonFunctions;

public class TestNavigateTag {
	
	NavigateTag nt;
	commonFunctions cf;
	
	public TestNavigateTag() {		
		nt=new NavigateTag();
		cf=new commonFunctions();
	}

	
	@Test
	public void verifyWomenTag() {
	nt.getWomenTag().click();	
	Assert.assertTrue(cf.getTitle().contains("Women"), "Women Tag Test Case Failed!!!");
	cf.driver.navigate().back();
	//cf.tearDown();
	}
	
	@Test
	public void verifyDressTag() {
	nt.getDreesTag().click();
	Assert.assertTrue(cf.getTitle().contains("Dress"), "Dress Tag Test Case Failed!!!");
	cf.driver.navigate().back();
	}
	
	@Test
	public void verifyTshirtTag() {
	nt.getTshirtTag().click();
	Assert.assertTrue(cf.getTitle().contains("T-shirts")," T-Shirt Tag Test Case Failed!!!");
	cf.driver.navigate().back();

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
