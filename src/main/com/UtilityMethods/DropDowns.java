package com.UtilityMethods;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDowns {

  public void ddVisibleText(WebElement dd, String text) {
	  
	  Select s = new Select(dd);
	  s.selectByVisibleText(text);
	  
	  public void drpdownSelectbyValue(WebElement dd, String text) {
		  
		  Select s = new Select(dd);
		  s.selectByValue(value);
		  
	  }
		  public void drpdownSelectbyIndex(WebElement dd, String text) {
			  
			  Select s = new Select(dd);
			  s.selectByIndex(index);
		  
  }
}
