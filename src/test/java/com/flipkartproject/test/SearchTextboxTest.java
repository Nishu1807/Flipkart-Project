package com.flipkartproject.test;

import org.testng.annotations.Test;

import com.flipkart.pages.CustomerCreationPage;
import com.flipkart.pages.Keyword;
import com.flipkart.pages.SearchFunction;

public class SearchTextboxTest {
	
	SearchFunction search= new SearchFunction ();
	CustomerCreationPage customer= new CustomerCreationPage();
	
	@Test
	public void TC_01()
	{
	Keyword.openBrowser();
	Keyword.launchUrl();
	}
	@Test
		public void isSearchTextboxDisplayTest() {
		
		search.isSearchTextboxDisplay();
		}

	@Test
	public void isSearchTextboxEnableTest()
	{
		search.isSearchTextboxEnable();
	}
	
	@Test
	public void  isTextPresent()
	{
		search.isTextPresent();
	}
	@Test
	public void enterTextTest()
	{
		search.enterText();
	}
	@Test
	public void clickOnSearcTextboxTest()
	{
		search.isSearchTextboxClicakble();
	}
	
}
