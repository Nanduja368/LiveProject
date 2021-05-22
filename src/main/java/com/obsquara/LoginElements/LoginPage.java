package com.obsquara.LoginElements;

//import package com.obsquara.LoginElements.UtilityClass	;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
//import org.testng.annotations.Test; Page factory -- Page title // Current URl

import com.UtilityMethods.UtilityClass;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;
	UtilityClass utlObj = new UtilityClass();

	@FindBy(name = "LoginForm[username]")
	WebElement uName;
	@FindBy(xpath = "//input[@id='loginform-password']")
	WebElement psswd;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	@FindBy(xpath = "//a[text()='Carol Thomas']")
	WebElement user;
	@FindBy(xpath = "//p[text()='Incorrect username or password.']")
	WebElement errMsgLogin;
	@FindBy(xpath = "//label[@class='class-remember']")
	WebElement remembermetext;
	@FindBy(xpath = "//div[contains(text(),'If you forgot your password you can')]")
	WebElement frgetPassMsg;
	@FindBy(xpath = "//h1[text()='Login']")
	WebElement headingText;
	@FindBy(xpath = "//p[text()='Incorrect username or password.']")
	WebElement forgetUnamePaswd;
	@FindBy(xpath = "/a[text()='reset it']")
	WebElement resetit;
	
	public void clickReset() {
		utlObj.clickElement(resetit);
	}

public boolean webElementIsDisplayed() {
	boolean value = utlObj.isElementDisplayed(forgetUnamePaswd);
	return value;
	
}
	public void navigateUrl(String url) {
		utlObj.launchUrl(driver, url);
	}

	public String pageTitle() {
		String ptitle = utlObj.findPageTitle(driver);
		return ptitle;
	}

	public String expectedCurrentUrl() {
		String currenturl = utlObj.currentUrl(driver);
		return currenturl;
	}

	public void enterUserName(String un) {
		utlObj.setUserName(uName, un);
	}

	public void enterPassword(String entpss) {
		utlObj.setPassword(psswd, entpss);
	}

	public void clickLogin() {
		utlObj.clickElement(login);
	}

	public String verifyUser() {
		String actualUser = utlObj.getElementText(user);
		return actualUser;
	}

	public String getErrorLoginMsg() {
		String actualErrLogin = utlObj.getElementText(errMsgLogin);
		return actualErrLogin;
	}

	public void addImplicitWait(int waitTime) {
		utlObj.pageLoadingWait(driver, waitTime);
	}

	public boolean verifyHeadingLogin() {
		boolean headVal = utlObj.isElementDisplayed(headingText);
		return headVal;

	}

	public boolean foregtPasswdMsg() {
		boolean fpm = utlObj.isElementDisplayed(frgetPassMsg);
		return fpm;
	}

	public boolean rmbrMeText() {
		boolean rm = utlObj.isElementDisplayed(remembermetext);
		return rm;
	}

}
