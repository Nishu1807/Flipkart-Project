package com.flipkart.pages.loginpage;

import org.openqa.selenium.By;

import com.flipkart.pages.Keyword;

public class LoginPage {
	
	By mobileNumber=By.xpath("//input[@class='_2zrpKA _1dBPDZ']");
	
	By password=By.xpath("//input[@type='password']");
	
	By login=By.xpath("//button[@class=\"_2AkmmA _1LctnI _7UHT_c\"]");
	
	public void enterMobileNumber(String value) {
		Keyword.getDriver().findElement(mobileNumber).sendKeys(value);	
	}
	
	public void clickAndEnterPassword(String value) throws InterruptedException {
		Thread.sleep(2000);
		Keyword.getDriver().findElement(password).click();
		Keyword.getDriver().findElement(password).sendKeys(value);
	}
	
	public void clickOnLoginButton() {
		Keyword.getDriver().findElement(login).click();
	}

}
