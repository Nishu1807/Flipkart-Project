package com.flipkart.test.accountcreationtest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.flipkart.pages.Keyword;
import com.flipkart.pages.accountcreationpage.AccountCreation;

public class AccountCreationPageTest {
	
	AccountCreation account = PageFactory.initElements(Keyword.getDriver(), AccountCreation.class);
	@Test(priority=0)
	public void enterMobileNumberTest() {
		Keyword.openBrowser();
		Keyword.launchUrl();
		
		account.clickOnCreateAnAccountLink();
		account.enterMobileNumber("8788964271");
		}
	
	@Test(priority=1)
	public void clickOnContinueButtonTest() {
		account.clickOnContinueButton();
	}
	
	@Test(priority=2)
	public void enterOPTTest() {
		account.enterOTP("568974");
	}
	
	@Test(priority=2)
	public void clickAndEnterPasswordTest() throws InterruptedException {
		account.clickAndEnterPassword("Harsh0107@");
	}
	
	@Test(priority=3)
	public void clickOnsignupButtonTest() throws InterruptedException {
		account.clickOnSignupButton();
		Thread.sleep(3000);
		Keyword.closeAllBrowser();
	}
	
}
