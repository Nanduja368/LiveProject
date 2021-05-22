package com.UtilityMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {
	

		WebDriverWait wait;

		public void explicitWaitElementToBeClickable(WebDriver driver, long time, WebElement el)

		{
			wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.elementToBeClickable(el));

		}

		public void explicitWaitForalertIsPresent(WebDriver driver, int time) {
			wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.alertIsPresent());

		}

		
	}



