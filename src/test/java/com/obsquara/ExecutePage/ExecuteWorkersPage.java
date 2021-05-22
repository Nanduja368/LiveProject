package com.obsquara.ExecutePage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.UtilityMethods.ExcelRead;
import com.UtilityMethods.ScreenShots;
import com.obsquara.LoginElements.ClientsPage;
import com.obsquara.LoginElements.LoginPage;
import com.obsquara.LoginElements.WorkersPage;

public class ExecuteWorkersPage extends BaseClass {
	LoginPage lp;
	ClientsPage cp;
	ExcelRead xlre;
	WorkersPage wp;

	/*
	 * @BeforeTest public void hitUrl() {
	 * lp.navigateUrl("https://www.qabible.in/payrollapp/");
	 * lp.enterUserName(xlre.readExcelData(1, 0));
	 * lp.enterPassword(xlre.readExcelData(1, 1)); lp.clickLogin();
	 * lp.addImplicitWait(5); }
	 * 
	 * 
	 * @Test public void testCase1VerifytheWorkersTabText() throws IOException { cp
	 * = new ClientsPage(driver); lp = new LoginPage(driver); xlre = new
	 * ExcelRead(); wp = new WorkersPage(driver);
	 * lp.navigateUrl("https://www.qabible.in/payrollapp/");
	 * lp.enterUserName(xlre.readExcelData(1, 0));
	 * lp.enterPassword(xlre.readExcelData(1, 1)); lp.clickLogin();
	 * lp.addImplicitWait(5); wp.clickWorkersTab(); // cp.getAttributeClientTab();
	 * Assert.assertEquals(wp.getTextWorkersTab(), "Workers",
	 * "Text of the tab is not workers");
	 * 
	 * }
	 * 
	 * @Test public void testCase2VerifyHomeButtonClick() throws IOException { cp =
	 * new ClientsPage(driver); lp = new LoginPage(driver); xlre = new ExcelRead();
	 * wp = new WorkersPage(driver);
	 * lp.navigateUrl("https://www.qabible.in/payrollapp/");
	 * lp.enterUserName(xlre.readExcelData(1, 0));
	 * lp.enterPassword(xlre.readExcelData(1, 1)); lp.clickLogin();
	 * lp.addImplicitWait(5); wp.clickWorkersTab(); wp.clickHomeButton();
	 * Assert.assertEquals(lp.pageTitle(), "Payroll Application",
	 * "Application didnt navigate to Dashboard");
	 * 
	 * }*/
	 

	@Test
	public void testCase3VerifySearchFunctionality() throws Exception {
		lp = new LoginPage(driver);
		wp = new WorkersPage(driver);
		xlre = new ExcelRead();
		
		lp.navigateUrl("https://www.qabible.in/payrollapp/");
		lp.enterUserName(xlre.readExcelData(1, 0));
		lp.enterPassword(xlre.readExcelData(1, 1));
		lp.clickLogin();
		lp.addImplicitWait(5);
		wp.clickWorkersTab();
		lp.addImplicitWait(5);
		wp.enterFirstName("jasm");
		wp.clickSearch();
		//lp.addImplicitWait(5);
		Thread.sleep(3000);
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(wp.getTextOfGridFnameWebElement(), "Jasmin Gallop", "Search result is incorrect");
		wp.getScreenshots();
	}

	/*@Test
	public void testCase4VerifySearchFunctionality() throws IOException {
		lp = new LoginPage(driver);
		wp = new WorkersPage(driver);
		xlre = new ExcelRead();

		lp.navigateUrl("https://www.qabible.in/payrollapp/");
		lp.enterUserName(xlre.readExcelData(1, 0));
		lp.enterPassword(xlre.readExcelData(1, 1));
		lp.clickLogin();
		lp.addImplicitWait(5);
		wp.clickWorkersTab();
		lp.addImplicitWait(5);
		wp.clickCreatewkerTab();
		lp.addImplicitWait(5);
		wp.selectDropdown("Mrs");
		Assert.assertEquals(wp.getTextOfTitleDropdown(), "Mrs", "Mrs is not selected in the drop down");
	} */

}
