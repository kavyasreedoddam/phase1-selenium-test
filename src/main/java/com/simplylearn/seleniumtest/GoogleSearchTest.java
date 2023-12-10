package com.simplylearn.seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/** this class demonstrate test script for search on google search engine
 * selenium webdriver
 */
public class GoogleSearchTest {

	public static void main(String[] args) {
		
		//step 1 : formulate a test domain url & driver path
		String siteUrl = "https://www.google.com/";
		String driverPath = "drivers/windows/chromedriver.exe";
		
		//step 2 : set system properties for selenium driver
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		//step 3 : instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();
		
		//step 4 : launch browser
		driver.get(siteUrl);
		
		// step 5 : Evaluate the test
		
		
		// step 6 : close browser
		driver.close();
		
		
		
		
		
		
		
		
		
	}
}
