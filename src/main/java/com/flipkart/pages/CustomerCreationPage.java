package com.flipkart.pages;

import org.openqa.selenium.By;

public class CustomerCreationPage {
	
	By mobileNumber=By.xpath("//input[@class='_2zrpKA _1dBPDZ']");
	
	By clickButton=By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']");
	
	public void enterMobileNumber(String value) {
		//Keyword.driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys(value);
		Keyword.driver.findElement(mobileNumber).sendKeys(value);
		
	}
	
	public void clickOnContinueButton() {
		//Keyword.driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Keyword.driver.findElement(clickButton).click();
	}
		
	
}
