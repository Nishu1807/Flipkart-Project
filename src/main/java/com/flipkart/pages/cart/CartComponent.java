package com.flipkart.pages.cart;

import org.openqa.selenium.By;

import com.flipkart.pages.Keyword;

public class CartComponent {

	By cart = By.xpath("//a[@class=\"_3ko_Ud\"]");

	By shopping = By.xpath("//button[@class='_2AkmmA _2Z-ax5 _1eFTEo']");

	public void clickOnCart() {
		Keyword.getDriver().navigate().refresh();
		Keyword.getDriver().findElement(cart).click();
	}

	public void clickOnShopNow() throws InterruptedException {
	}

}
