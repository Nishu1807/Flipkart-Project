package com.flipkartproject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.flipkart.pages.CustomerCreationPage;
import com.flipkart.pages.HomePage;
import com.flipkart.pages.Keyword;
import com.flipkart.pages.ManualKeyword;

public class CustomerCreationPageTests {
	
	HomePage home=PageFactory.initElements(Keyword.driver, HomePage.class);
	CustomerCreationPage customer= new CustomerCreationPage();//PageFactory.initElements(Keyword.driver, CustomerCreationPage.class);
	@Test(priority=0)
	public void enterMobileNumberTest() throws InterruptedException {
		String browserName = null;
		Keyword.openBrowser();
		Keyword.launchUrl();
		
		home.loginBoxCloseButton();
		home.mouseHoverOnLoginButton();
		home.clickOnSignUpLink();
		
		customer.enterMobileNumber("8788964271");
		

			
		//Keyword.closeBrowser();
		
	}
	@Test(priority=1)
	public void clickOnContinueButtonTest() {
		customer.clickOnContinueButton();
	}
	
	

}
