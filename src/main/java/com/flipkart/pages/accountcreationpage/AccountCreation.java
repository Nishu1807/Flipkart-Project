package com.flipkart.pages.accountcreationpage;

import org.openqa.selenium.By;

import com.flipkart.pages.Keyword;

public class AccountCreation {
	
	By createLink=By.cssSelector("a[href='/account/login?signup=true']");
	
	By mobileNumber=By.xpath("//input[@class='_2zrpKA _1dBPDZ']");
	
	By clickButton=By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']");
	
	By otp=By.xpath("//input[@maxlength=\"6\"]");
	
	
	By password=By.xpath("//input[@type='password']");
	
	By signup=By.xpath("//button[@class=\"_2AkmmA _1LctnI _7UHT_c\"]");
	
	
	public void clickOnCreateAnAccountLink() {
		Keyword.getDriver().findElement(createLink).click();
	}
	
	public void enterMobileNumber(String value) {
		Keyword.getDriver().findElement(mobileNumber).sendKeys(value);	
	}
	
	public void clickOnContinueButton() {
		Keyword.getDriver().findElement(clickButton).click();
	}
	
	public void enterOTP(String value) {
		Keyword.getDriver().findElement(otp).sendKeys(value);
	}
	
	public void clickAndEnterPassword(String value) throws InterruptedException {
		Thread.sleep(2000);
		Keyword.getDriver().findElement(password).click();
		Keyword.getDriver().findElement(password).sendKeys(value);
	}
	
	public void clickOnSignupButton() {
		Keyword.getDriver().findElement(signup).click();
	}

}
