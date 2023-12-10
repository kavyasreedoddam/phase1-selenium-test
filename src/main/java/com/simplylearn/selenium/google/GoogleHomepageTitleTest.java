package com.simplylearn.selenium.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomepageTitleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//step 1 : formulate a test domain url & driver path
		String siteUrl = "https://www.google.com/";
		String driverPath = "drivers/windows/geckodriver.exe";
				
		//step 2 : set system properties for selenium driver
		System.setProperty("webdriver.gecko.driver", driverPath);
				
		//step 3 : instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();
				
		//step 4 : launch browser
		driver.get(siteUrl);
				
		//step 5 : Evaluate the test
		String title = "Google";
		
		if(siteUrl.equals(driver.getCurrentUrl())) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}
				
		System.out.println("Expected Url :: "+ siteUrl);
		System.out.println("Actual Url :: "+ driver.getCurrentUrl());
				
		//step 6 : Close browser
		driver.close();
				
	}

}
