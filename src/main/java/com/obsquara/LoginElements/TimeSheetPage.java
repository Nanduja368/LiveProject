package com.obsquara.LoginElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.UtilityMethods.Alert;
import com.UtilityMethods.AlertVerification;
import com.UtilityMethods.ExplicitWaits;
import com.UtilityMethods.UtilityClass;

public class TimeSheetPage {
	
	ExplicitWaits ew = new ExplicitWaits();
	UtilityClass utlObj = new UtilityClass();
	WebDriver driver;
	AlertVerification av = new AlertVerification();	
	public TimeSheetPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//a[text()='TimeSheet']")WebElement TimesheetTab;
	@FindBy (xpath="//button[@value='playslip']") WebElement GeneratePayslip; 
	
	public void clickTimesheetTab() {
		utlObj.clickElement(TimesheetTab);
	}
	
	public void clickGeneratePayslipButton() {
		utlObj.clickElement(GeneratePayslip);
		
	}
   public void acceptAlert() {
	   av.acceptAlertMethod(driver);
   }
   
   public boolean GeneratePayslipElementIsEnabled() {
	 boolean value =  utlObj.verifyWebElementIsEnabled(GeneratePayslip);
	return value;
	   
   }
   
   public void waitTillAlertAppears(int time)
   {
	   ew.explicitWaitForalertIsPresent(driver, time);
   }
   
   public String getTextOfAlert()
   {
	   String text = av.getTextOfAlert(driver);
	   return text;
   }
}
