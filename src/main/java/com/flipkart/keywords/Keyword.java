package com.flipkart.keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

	public class Keyword {
	
	
	
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
	 */
	
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		Constants.driver=new ChromeDriver();
//		switch (browserName) {
//		case "Chrome":
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			break;
//			
//		case "Firefox":
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			break;
//			
//		case "IE":
//			WebDriverManager.iedriver().setup();
//			driver = new InternetExplorerDriver();
//			break;
//			
//		case "SAfari":
//			driver = new SafariDriver();
//			break;
//
//		default:
//			System.err.println("Invalid browser name: Please refer java doc");
//			break;
//		}
		
		if(null != Constants.driver) {
			Constants.action = new Actions(Constants.driver);
		}
		
	}
	
	/**
	 * This method used for launching currently pointing browser
	 * @param url{@code url}
	 * @author Nisha Patil
	 */
	
	public static void launchUrl() {
		Constants.driver.get("https://www.flipkart.com");
		maximizeWindow();
	}
	
	public static void maximizeWindow() {
		Constants.driver.manage().window().maximize();
		
	}
	
	/**
	 * This method used for close currently open browser
	 * 
	 * @author Nisha Patil
	 */
	@Deprecated
	public static void closeBrowser() {
		Constants.driver.close();
	}
	
	/**
	 * This method used for close all open browser
	 * 
	 * @author Nisha Patil
	 */
	
	public static void closeAllBrowser() {
		Constants.driver.quit();

	}

	public static WebDriver getDriver() {
		return Constants.driver;
	}

	public static void setDriver(WebDriver driver) {
		if(null != driver)
			return;
		Constants.driver = driver;
	}

	public static String getProperty(String key) {
		String value = null;
		try {
			Constants.fis = new FileInputStream(
					"D:\\workspace\\FlipkartProject\\src\\main\\resources\\config.properties");
			Constants.prop = new Properties();
			Constants.prop.load(Constants.fis);
			value = Constants.prop.getProperty(key);

		} catch (FileNotFoundException e) {
			System.out.println("file is not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Unable to load file");
			e.printStackTrace();
		}

		return value;

	}
	
	public static String getProperty(String key, String filePath) {
		String value = null;
		try {
			Constants.fis = new FileInputStream(filePath);
			Constants.prop = new Properties();
			Constants.prop.load(Constants.fis);
			value = Constants.prop.getProperty(key);
		} catch (FileNotFoundException e) {
			System.out.println("file is no found" + filePath);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("unable to load file" + filePath);
			e.printStackTrace();
		}

		return value;
	}

}
