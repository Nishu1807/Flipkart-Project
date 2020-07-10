package flipkart.test.cart.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.flipkart.pages.Keyword;
import com.flipkart.pages.cart.CartComponent;
import com.flipkart.pages.home.BannerComponant;
import com.flipkart.pages.loginpage.LoginPage;


public class CartComponentTest {
	
	LoginPage login = PageFactory.initElements(Keyword.getDriver(), LoginPage.class);

	CartComponent cart = PageFactory.initElements(Keyword.getDriver(), CartComponent.class);
	
	BannerComponant banner = PageFactory.initElements(Keyword.getDriver(), BannerComponant.class);
	
	@Test(priority=0)
	public void clickOnCartTest() throws InterruptedException {
		Keyword.openBrowser();
		Keyword.launchUrl();
		
		login.enterMobileNumber("8788964271");
		try {
			login.clickAndEnterPassword("Harsh0107@");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		login.clickOnLoginButton();
		Thread.sleep(2000);
		
		cart.clickOnCart();
	}
	
	@Test(priority=1)
	public void clickOnShopNowButtonTest() {
		try {
			cart.clickOnShopNowButton();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=2)
	public void clickOnSearchTextboxTest() throws InterruptedException {
		
		
		banner.enterText("Samsung Mobile");
		try {
			banner.isSearchTextboxClicakble();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
