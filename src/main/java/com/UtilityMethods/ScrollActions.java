package com.UtilityMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollActions {
	
	public void scrollside(WebDriver driver, int  rpixel) {
	JavascriptExecutor js = (JavascriptExecutor) driver;  
	   js.executeScript("window.scrollBy(0,"+rpixel+")");
	}
	
}
