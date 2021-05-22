package com.UtilityMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UtilityClass {

	public void launchUrl(WebDriver driver, String url) {
		driver.get(url);
	}

	public String findPageTitle(WebDriver driver) {
		String fpt = driver.getTitle();
		return fpt;
	}

	public String currentUrl(WebDriver driver) {
		String curl = driver.getCurrentUrl();
		return curl;
	}

	public void setUserName(WebElement uName, String usn) {
		uName.sendKeys(usn);
	}

	public void setPassword(WebElement psswd, String pw) {
		psswd.sendKeys(pw);
	}

	public void clickElement(WebElement bttnName) {
		bttnName.click();
	}
	public void navigateToBack(WebDriver driver) {
		driver.navigate().back();
	}
	public void navigateToForward(WebDriver driver) {
		driver.navigate().forward();
	}

	public String getElementText(WebElement user) {

		return user.getText();

	}

	public void pageLoadingWait(WebDriver driver, int time) {

		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}

	public boolean isElementDisplayed(WebElement text) {

		boolean value = text.isDisplayed();
		return value;
	}

	public boolean verifyElementsSelected(WebElement element) {

		boolean value = element.isSelected();
		return value;

	}
	public boolean verifyWebElementIsDisplayed(WebElement element) {

		boolean value = element.isDisplayed();
		return value;

	}
	public boolean verifyWebElementIsEnabled(WebElement element) {

		boolean value = element.isEnabled();
		return value;
	}
	
	public String toolTipWebElement(WebElement elment, String attr) {
		String tp = elment.getAttribute(attr);

		return tp;
	}
	

}
