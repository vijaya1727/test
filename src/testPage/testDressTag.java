package testPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import objectPage.commonFunctions;
import objectPage.dressTagPage;

public class testDressTag {


	dressTagPage dt;
	commonFunctions cf;
	public testDressTag() {
		dt=new dressTagPage();
		cf=new commonFunctions();
	}


	@Test(priority=0)
	public void verifyDressTag() {
		dt.dressTag();
		Assert.assertTrue(cf.getTitle().contains("Dress"), "This is not Dress Page");;
	}

	@Test(priority=1)
	public void verifyProductCount() {
		Assert.assertTrue(dt.visibleCount()==dt.actualDressCount(), "Condition Failed!!!");
	}

	@Test(priority=2)
	public void verifyAddtoCart() {
		dt.addtoCart();

	}
	@Test(priority=3)
	public void verifyEmailSuscription() {
		dt.emailsubscription("vaildmailidsssss@gmail.com");
		Assert.assertTrue(dt.newLetterMessage().contains("successfully"), "You have not Suscribed NewsLetter");
	}




}
