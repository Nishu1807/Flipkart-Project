package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManualKeyword {
	
	public static WebDriver driver;
	static Actions action = null;
	/ndnkn
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		if(null != driver) {
			action = new Actions(driver);
	}
	}
	
	public static void launchUrl() {
		driver.get("https://www.flipkart.com");
	}

}
