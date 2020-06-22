package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage {
//	@FindBy(xpath="//button[contains(@class,'_2AkmmA _29YdH8')]")
//	By loginBoxCloseButton;
//	
//	@FindBy(xpath="//a[contains(text(),'Login')]")
//	WebElement logins;
//	
//	@FindBy(xpath="//div[contains(text(),'Sign Up')]")
//	By signup;
	
	public void loginBoxCloseButton() {
		Keyword.getDriver().findElement(By.xpath("//button[contains(@class,'_2AkmmA _29YdH8')]")).click();
		//Keyword.driver.findElement(loginBoxCloseButton).click();
	}
	public void mouseHoverOnLoginButton() {
		WebElement logins	=Keyword.getDriver().findElement(By.xpath("//a[contains(text(),'Login')]"));
		//Keyword.driver.findElement(login).click();
		Actions acts = Keyword.action.moveToElement(logins);
		acts.perform();
	}
	
	public void clickOnSignUpLink() {
		Keyword.getDriver().findElement(By.xpath("//div[contains(text(),'Sign Up')]")).click();
		//Keyword.driver.findElement(signup).click();
	}
	
	

}
