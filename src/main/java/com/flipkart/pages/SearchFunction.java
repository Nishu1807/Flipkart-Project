package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchFunction {
	
	

	public void isSearchTextboxDisplay()
	{
		
		if( Keyword.getDriver().findElement(By.xpath("//input[@class=\"LM6RPg\"]")).isDisplayed()){
			System.out.println("Element is Displayed");
			}else{
			System.out.println("Element is Not Displayed");
			}
	
	}
	
     public void isSearchTextboxEnable()
	{
		
		if(Keyword.getDriver().findElement(By.xpath("//input[@class=\"LM6RPg\"]")).isEnabled()){
			System.out.println("Element is Enable");
			}else{
			System.out.println("Element is Disabled");
			}
				
	}
	public void isSearchTextboxClicakble()
	{
		Keyword.getDriver().findElement(By.xpath("//button[@class=\"vh79eN\"]")).click();
		
		
	}
	public void isTextPresent()
	{
		if(Keyword.getDriver().getPageSource().contains("Search for products, brands and more")){
			System.out.println("Text is present");
			}else{
			System.out.println("Text is absent");
			}
	}
	
	public void enterText()
	{
		Keyword.getDriver().findElement(By.xpath("//input[@class=\"LM6RPg\"]")).sendKeys("mobile");
		
	}
	
				
	}


