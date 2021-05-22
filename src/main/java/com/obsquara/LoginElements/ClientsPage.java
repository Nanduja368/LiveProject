package com.obsquara.LoginElements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UtilityMethods.ScrollActions;
import com.UtilityMethods.UtilityClass;
import com.UtilityMethods.VerifyAttributeValues;
import com.UtilityMethods.WebElementListText;

public class ClientsPage {
	WebDriver driver;

	public ClientsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	ScrollActions Sc = new ScrollActions();
	UtilityClass utlObj = new UtilityClass();
	WebElementListText welt = new WebElementListText();
	VerifyAttributeValues vavObj = new VerifyAttributeValues();

	@FindBy(xpath = "//a[@href='/payrollapp/client/index']")
	WebElement clientTab;
	@FindBy(xpath = "//a[@href='/payrollapp/client/index']/..")
	WebElement client;

	@FindBy(xpath = "//a[text()='Create Client']")
	WebElement createClient;

	@FindBy(id = "client-direct_client")
	WebElement directClient;

	@FindBy(xpath = "//a[@href='/payrollapp/client/view?id=3']")
	WebElement eyeOpen;

	public String getTooltipEyeicon(){
		String tp = utlObj.toolTipWebElement(eyeOpen, "title");
		return tp;
	}

	public void addImplicitWait(int waitTime) {
		utlObj.pageLoadingWait(driver, waitTime);
	}

	public void clickClientTab() {
		utlObj.clickElement(clientTab);
	}

	public boolean getAttributeClientTab() {
		boolean value = vavObj.getElementAttribute(client, "class", "active");
		return value;
	}

	public void clickCreateClient() {
		utlObj.clickElement(createClient);
	}

	public void clickDirectClient() {

		utlObj.clickElement(directClient);
	}

	public void scrollPage(int rpixel) {
		Sc.scrollside(driver, rpixel);
	}

	public boolean elementDirectClientSelected() {
		boolean value = utlObj.verifyElementsSelected(directClient);
		return value;
	}

	public void NaviBack() {
		utlObj.navigateToBack(driver);
	}

	public void NaviForward() {
		utlObj.navigateToBack(driver);
	}

	public void clickEditOnTheGrid(String Value) {

		String clientId = "//table[@class='table table-striped table-bordered']//tr//td[1]";

		List<String> clientIdText = welt.WebElementListToText(driver, clientId);

		for (int j = 0; j < clientIdText.size(); j++) {

			if (clientIdText.get(j).contentEquals(Value)) {
				j = j + 1;
				String desiredEditIcon = "//table[@class='table table-striped table-bordered']//tr[" + j
						+ "]//td//a[@title='Update']";
				WebElement editIcon = driver.findElement(By.xpath(desiredEditIcon));
				editIcon.click();

			}
		}

	}
}
