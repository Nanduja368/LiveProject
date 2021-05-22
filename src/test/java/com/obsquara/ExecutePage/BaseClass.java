package com.obsquara.ExecutePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {

	WebDriver driver;

	@BeforeMethod
	public void browserOpen() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nanduja.CN\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@AfterMethod
	public void browserClose() {
		driver.quit();

	}
}
