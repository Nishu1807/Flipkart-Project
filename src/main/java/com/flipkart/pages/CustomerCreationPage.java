package com.flipkart.pages;

import org.openqa.selenium.By;

public class CustomerCreationPage {
	
	By mobileNumber=By.xpath("//input[@class='_2zrpKA _1dBPDZ']");
	
	By clickButton=By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']");
	
//	By otp=By.xpath("//input[@maxlength=\"6\"]");
//	By passwd=By.xpath("//input[@type=\"password\"]");
	
	By password=By.xpath("//input[@type='password']");
	
	By login=By.xpath("//button[@class=\"_2AkmmA _1LctnI _7UHT_c\"]");
	
	public void enterMobileNumber(String value) {
		Keyword.getDriver().findElement(mobileNumber).sendKeys(value);	
	}
	
	public void clickOnContinueButton() {
		Keyword.getDriver().findElement(clickButton).click();
	}
	
//	public void enterOTP(String value) {
//		Keyword.driver.findElement(otp).sendKeys(value);
//	}
//		
//	public void setPassword(String value) {
//		Keyword.driver.findElement(passwd).sendKeys(value);
//	}
	
	public void clickAndEnterPassword(String value) throws InterruptedException {
		Thread.sleep(2000);
		Keyword.getDriver().findElement(password).click();
		Keyword.getDriver().findElement(password).sendKeys(value);
	}
	
	public void clickOnLoginButton() {
		Keyword.getDriver().findElement(login).click();
	}
	
}
