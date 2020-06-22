package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Keyword {
	private static WebDriver driver;
	static Actions action = null; 
	
	
	/**
	 * this method is used for opening the specified browser<br>
	 * <ul>
	 * <li>Chrome
	 * <li>Firefox
	 * <li>IE
	 * <li>Safari
	 * <ul/>
	 * 
	 * @param browserName(@code String)
	 * @author Nisha Patil
	 * @param browserName 
	 */
	
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		if(null != driver) {
			action = new Actions(driver);
		}
		
	}
	
	/**
	 * This method used for launching currently pointing browser
	 * @param url{@code url}
	 * @author Nisha Patil
	 */
	
	public static void launchUrl() {
		driver.get("https://www.flipkart.com");
		maximizeWindow();
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
		
	}
	
	/**
	 * This method used for close currently open browser
	 * 
	 * @author Nisha Patil
	 */
	
	public static void closeBrowser() {
		driver.close();
	}
	
	/**
	 * This method used for close all open browser
	 * 
	 * @author Nisha Patil
	 */
	
	public static void closeAllBrowser() {
		driver.quit();

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		if(null != driver)
			return;
		Keyword.driver = driver;
	}

	

}
