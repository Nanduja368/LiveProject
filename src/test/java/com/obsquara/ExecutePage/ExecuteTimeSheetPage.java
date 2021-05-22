package com.obsquara.ExecutePage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.UtilityMethods.ExcelRead;
import com.UtilityMethods.UtilityClass;
import com.obsquara.LoginElements.ClientsPage;
import com.obsquara.LoginElements.LoginPage;
import com.obsquara.LoginElements.TimeSheetPage;


public class ExecuteTimeSheetPage extends BaseClass {
	LoginPage lp;
	ClientsPage cp;
	ExcelRead xlre;
	TimeSheetPage ts;

	/*@Test
	public void testCase1VerifyTimeSheetTabText() throws IOException {
		lp = new LoginPage(driver);
		ts = new TimeSheetPage(driver);
		xlre = new ExcelRead();
		lp.navigateUrl("https://www.qabible.in/payrollapp/");
		lp.enterUserName(xlre.readExcelData(1, 0));
		lp.enterPassword(xlre.readExcelData(1, 1));
		lp.clickLogin();
		lp.addImplicitWait(5);
		ts.clickTimesheetTab();
		lp.addImplicitWait(5);
		Assert.assertEquals(lp.pageTitle(), "Timesheets", "Not navigated to Time sheet page");
		

	}
	
	@Test
	public void testCase2GeneratePaySlipButtonDisableDruingBillGeneration() throws IOException {
		lp = new LoginPage(driver);
		ts = new TimeSheetPage(driver);
		xlre = new ExcelRead();
		lp.navigateUrl("https://www.qabible.in/payrollapp/");
		lp.enterUserName(xlre.readExcelData(1, 0));
		lp.enterPassword(xlre.readExcelData(1, 1));
		lp.clickLogin();
		lp.addImplicitWait(5);
		ts.clickTimesheetTab();
		lp.addImplicitWait(5);
		ts.clickGeneratePayslipButton();
		ts.acceptAlert();
		Assert.assertFalse(ts.GeneratePayslipElementIsEnabled(), "Generate paySlip button is enabled"); 

	}*/

	@Test
	public void testCase3GeneratePaySlipButtonDisableDruingBillGeneration() throws IOException {
		lp = new LoginPage(driver);
		ts = new TimeSheetPage(driver);
		xlre = new ExcelRead();
		lp.navigateUrl("https://www.qabible.in/payrollapp/");
		lp.enterUserName(xlre.readExcelData(1, 0));
		lp.enterPassword(xlre.readExcelData(1, 1));
		lp.clickLogin();
		lp.addImplicitWait(5);
		ts.clickTimesheetTab();
		lp.addImplicitWait(5);
		ts.clickGeneratePayslipButton();
		ts.acceptAlert();
		ts.waitTillAlertAppears(15); 
		String S = ts.getTextOfAlert();
		Assert.assertEquals(S, "Payslip generated!!!", "Alert message text is incorrect");
		ts.acceptAlert();
		System.out.println(S);

	}
}
