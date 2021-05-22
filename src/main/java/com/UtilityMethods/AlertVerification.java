package com.UtilityMethods;

import org.openqa.selenium.WebDriver;

public class AlertVerification {

	public void acceptAlertMethod(WebDriver driver) {
		
		driver.switchTo().alert().accept();
		
	}

	public String getTextOfAlert(WebDriver driver) {
		// TODO Auto-generated method stub
		String txt = driver.switchTo().alert().getText();
		return txt;
	}
}
