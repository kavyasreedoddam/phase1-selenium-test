package com.simplylearn.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandlingExample {

	public static void main(String[] args) {
	
		//step 1 : formulate a test domain url & driver path
		String siteUrl1 = "https://www.google.com/";
		String siteUrl2 = "https://youtube.com/";
		String driverPath = "drivers/windows/chromedriver.exe";
				
		// Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", driverPath);

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get(siteUrl1);

        // Get the current window handle (main window)
        String mainWindowHandle = driver.getWindowHandle();

        // Open a new window using JavaScript (for demonstration purposes)
        ((ChromeDriver) driver).executeScript("window.open('', '_blank');");

        // Get the handles of all open windows
        Set<String> allWindowHandles = driver.getWindowHandles();

        // Switch to the new window
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Perform actions in the new window (e.g., navigate to another website)
        driver.get(siteUrl2);


        // Close the browser
        driver.quit();
	}

}
