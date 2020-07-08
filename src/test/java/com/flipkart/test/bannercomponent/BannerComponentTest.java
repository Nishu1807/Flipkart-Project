package com.flipkart.test.bannercomponent;

import org.testng.annotations.Test;

import com.flipkart.pages.Keyword;
import com.flipkart.pages.home.BannerComponant;
import com.flipkart.pages.loginpage.LoginPage;

public class BannerComponentTest {

	BannerComponant search= new BannerComponant ();
	LoginPage login=new LoginPage();
	
	@Test(priority=0)
	public void TC_01() throws InterruptedException
	{
	Keyword.openBrowser();
	Keyword.launchUrl();
	login.enterMobileNumber("8788964271");
	login.clickAndEnterPassword("Harsh0107@");
	login.clickOnLoginButton();

	}
	
	@Test
		public void isSearchTextboxDisplayTest() {
		
		search.isSearchTextboxDisplay();
		}
	
	@Test
	public void isSearchTextboxEnableTest()
	{
		search.isSearchTextboxEnable();
	}
	
	@Test
	public void  isTextPresent()
	{
		search.isTextPresent();
	}
	
	@Test(priority=1)
	public void enterTextTest() 
	{
		search.enterText("mobile");
	}
	@Test(priority=2)
	public void clickOnSearcTextboxTest() throws InterruptedException
	{
		
		search.isSearchTextboxClicakble();
	}
	
}
