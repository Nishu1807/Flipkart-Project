package com.flipkart.pages.home;

import org.openqa.selenium.By;

import com.flipkart.pages.Keyword;

public class BannerComponant {
 
	public void isSearchTextboxDisplay( )
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
	
	public void isTextPresent()
	{
		if(Keyword.getDriver().getPageSource().contains("Search for products, brands and more")){
			System.out.println("Text is present");
			}else{
			System.out.println("Text is absent");
			}
	}
	
	public void enterText(String value) 
	{
		Keyword.getDriver().findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(value);
		
	}
	public void isSearchTextboxClicakble() throws InterruptedException
	{
	Thread.sleep(5000);

		Keyword.getDriver().findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
	}
	
	
}
