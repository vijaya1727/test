package testPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import objectPage.HomePage;
import objectPage.commonFunctions;

public class TestHomepage {


	HomePage hp;
	commonFunctions cf;
	public TestHomepage() {
		hp=new HomePage();
		cf=new commonFunctions();
	}
	@Test
	public void verifydreesIsDisplay() {
		Assert.assertTrue(cf.elementIsDisplayed(hp.getdress()), "Dress tag Not Displayed");
	}

	@Test
	public void verifywomenIsDisplay() {
		Assert.assertTrue(cf.elementIsDisplayed(hp.getwomen()), "womem tag Not Displayed");
	}

	@Test
	public void verifyTshirtIsDisplay() {
		Assert.assertTrue(cf.elementIsDisplayed(hp.getTshirt()), "T-shirt tag Not Displayed");
	}


}
