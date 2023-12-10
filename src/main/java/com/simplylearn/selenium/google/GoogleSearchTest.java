package com.simplylearn.selenium.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/** this class demonstrate test script for search on google search engine
 * selenium webdriver
 */
public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		
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
		//locate search box
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium documentation");
		searchBox.submit();
		
		//add delay
		Thread.sleep(2000);
		
		String expectedTitle = "selenium documentation - Google Search";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("test is passed! ");
		} else {
			System.out.println("test is failed! ");
		}
		
		System.out.println("Expected Title: "+ expectedTitle);
		System.out.println("Actual Title:  "+ actualTitle);
		
		
		// step 6 : close browser
		driver.close();
		
		
		
		
		
		
		
		
		
	}
}
