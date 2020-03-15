package objectPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class commonFunctions {

	public  static WebDriver  driver;


	public  commonFunctions() {

		if (driver==null) {

			System.setProperty("webdriver.chrome.driver",
					"E:\\Softwares\\Educational\\Selenium\\Webdriver\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			//driver.get("http://automationpractice.com/index.php");	
			driver.navigate().to("http://automationpractice.com/index.php");
		}
	}

	public boolean elementIsDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	public String  getTitle() {
		String name=driver.getTitle();
		return name;
	}

	public WebElement actionMethod(WebElement element) {
		Actions actions= new Actions(driver);
		actions.moveToElement(element).build().perform();
		return element;
	}
	public String getAttributeValue(WebElement element,String value) {
		String AttributeValue=	element.getAttribute(value);
		return AttributeValue;
	}

	public String getTxt(WebElement element) {
		String text=element.getText();
		return text;
	}

	public void tearDown() {
		driver.quit();
	}




}
