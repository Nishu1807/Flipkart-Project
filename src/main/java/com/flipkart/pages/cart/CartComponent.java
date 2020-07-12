package com.flipkart.pages.cart;

import org.openqa.selenium.By;


import com.flipkart.pages.Keyword;

public class CartComponent {

	By cart = By.xpath("//a[@class=\"_3ko_Ud\"]");

	By shopping = By.xpath("//button[@class='_2AkmmA _2Z-ax5 _1eFTEo']");
	
	By moblie = By.xpath("//div[text()='Samsung Galaxy A31 (Prism Crush Blue, 128 GB)']");
	
	By addToCart = By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']");

	public void clickOnCart() {
		Keyword.getDriver().navigate().refresh();
		Keyword.getDriver().findElement(cart).click();
	}

	public void clickOnShopNowButton() throws InterruptedException {
		Thread.sleep(3000);
		Keyword.getDriver().findElement(shopping).click();
		
	}
	
	public void clickOnItem() {
		Keyword.getDriver().findElement(moblie).click();
	}
	
	public void clickOnAddToCart() {
		
		Keyword.getDriver().findElement(addToCart).click();
	}
}
