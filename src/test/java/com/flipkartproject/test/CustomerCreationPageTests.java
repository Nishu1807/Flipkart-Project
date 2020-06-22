package com.flipkartproject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.flipkart.pages.CustomerCreationPage;
import com.flipkart.pages.HomePage;
import com.flipkart.pages.Keyword;

public class CustomerCreationPageTests {
	
	HomePage home=PageFactory.initElements(Keyword.getDriver(), HomePage.class);
	CustomerCreationPage customer= new CustomerCreationPage();//PageFactory.initElements(Keyword.driver, CustomerCreationPage.class);
	String browserName = null;
	
	@Test(priority=0)
	public void enterMobileNumberTest() {
		Keyword.openBrowser();
		Keyword.launchUrl();
		home.loginBoxCloseButton();
		home.mouseHoverOnLoginButton();
		home.clickOnSignUpLink();
		
		customer.enterMobileNumber("8788964271");
		}
	
	@Test(priority=1)
	public void clickOnContinueButtonTest() {
		customer.clickOnContinueButton();
	}
	
//	@Test
//	public void enterOPTTest() {
//		customer.enterOTP("568974");
//	}
//	
//	@Test
//	public void setPasswordTest() {
//		customer.setPassword("Harsh");
//	}
	
	@Test(priority = 2)
	public void clickAndEnterPasswordTest() {
		try {
			customer.clickAndEnterPassword("Harsh0107@");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=3)
	public void clickOnLoginButtonTest() throws InterruptedException {
		customer.clickOnLoginButton();
		Thread.sleep(3000);
		Keyword.closeAllBrowser();
	}
	
}
