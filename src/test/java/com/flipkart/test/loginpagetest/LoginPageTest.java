package com.flipkart.test.loginpagetest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.flipkart.pages.Keyword;
import com.flipkart.pages.loginpage.LoginPage;

public class LoginPageTest {
	
	LoginPage login = PageFactory.initElements(Keyword.getDriver(), LoginPage.class);
	
	@Test(priority=0)
	public void enterMobileNumberTest() {
		Keyword.openBrowser();
		Keyword.launchUrl();
		
		login.enterMobileNumber("8788964271");
		}
	
	@Test(priority=1)
	public void clickAndEnterPasswordTest() throws InterruptedException {
		login.clickAndEnterPassword("Harsh0107@");
	}
	
	@Test(priority=2)
	public void clickOnsignupButtonTest() {
		login.clickOnLoginButton();
		Keyword.closeAllBrowser();
	}


}
