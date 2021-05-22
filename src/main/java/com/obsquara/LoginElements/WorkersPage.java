package com.obsquara.LoginElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UtilityMethods.DropDowns;
import com.UtilityMethods.ExplicitWaits;
import com.UtilityMethods.ScreenShots;
import com.UtilityMethods.UtilityClass;
import com.UtilityMethods.VerifyAttributeValues;

public class WorkersPage {

	WebDriver driver;
	UtilityClass utlObj = new UtilityClass();
	VerifyAttributeValues vav = new VerifyAttributeValues();
	ScreenShots ss = new ScreenShots();
	DropDowns dd = new DropDowns();

	
	
	public WorkersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/payrollapp/worker/index']")
	WebElement workers;
	@FindBy(xpath = "//a[text()='Home']")
	WebElement home;
	@FindBy(id = "workersearch-first_name")
	WebElement Fname;
	@FindBy(xpath = "//button[text()='Search']")
	WebElement search;
	@FindBy(xpath = "//td[text()='Jasmin Gallop']")
	WebElement gridFname;
	@FindBy(xpath = "//a[text()='Create Worker']")
	WebElement createWorker;
	@FindBy(id= "worker-title")
	WebElement createWorkerTitle;
	
	public String getTextOfTitleDropdown()
	{
	String vl = utlObj.getElementText(createWorkerTitle);
	return vl;
	}
	public void selectDropdown(String text) {
		dd.ddVisibleText(createWorkerTitle, text);
	}
	
	public void clickCreatewkerTab() {
		utlObj.clickElement(createWorker);
	}
	public void clickWorkersTab() {
		utlObj.clickElement(workers);
	}

	public String getTextWorkersTab() {
		String st = utlObj.getElementText(workers);
		return st;
	}

	public void clickHomeButton() {
		utlObj.clickElement(home);
	}

	public void enterFirstName(String fname) {
		utlObj.setUserName(Fname, fname);
	}

	public void clickSearch() {
		utlObj.clickElement(search);
	}

	public String getTextOfGridFnameWebElement() {
		String value = utlObj.getElementText(gridFname);
		return value;
	}
	public void getScreenshots() throws Exception {
		ss.screenShotOfFailureCases(driver);
	}
	
}
