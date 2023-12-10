package com.simplylearn.seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//step 1 : formulate a test domain url & driver path
				String siteUrl = "https://www.google.com/";
				String driverPath = "drivers/windows/geckodriver.exe";
				
				//step 2 : set system properties for selenium driver
				System.setProperty("webdriver.gecko.driver", driverPath);
				
				//step 3 : instantiate selenium webdriver
				WebDriver driver = new FirefoxDriver();
				
				//step 4 : launch browser
				driver.get(siteUrl);
				
				//step 5 : Evaluate the test
				
				//step 6 : Close browser
				driver.close();
		
		
		
		
	}

}
