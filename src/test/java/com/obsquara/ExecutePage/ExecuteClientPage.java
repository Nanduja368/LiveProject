package com.obsquara.ExecutePage;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.obsquara.LoginElements.ClientsPage;
import com.obsquara.LoginElements.LoginPage;

public class ExecuteClientPage extends BaseClass {
	ClientsPage cp;
	LoginPage lp;

	/*@Test
	public void testcase1VerifyClientTab() {
		cp = new ClientsPage(driver);
		lp = new LoginPage(driver);
		lp.navigateUrl("https://www.qabible.in/payrollapp/");
		lp.enterUserName("Carol");
		lp.enterPassword("1q2w3e4r");
		lp.clickLogin();
		lp.addImplicitWait(10);
		//cp.clickClientTab();
			Assert.assertTrue(cp.getAttributeClientTab(),"Client tab is not active currently");
	} 
	
	@Test
	public void testcase2VerifyDirectClientIsSelected()
	{
		cp = new ClientsPage(driver);
		lp = new LoginPage(driver);
		lp.navigateUrl("https://www.qabible.in/payrollapp/");
		lp.enterUserName("Carol");
		lp.enterPassword("1q2w3e4r");
		lp.clickLogin();
		lp.addImplicitWait(5);
		cp.clickClientTab();
		cp.clickCreateClient();
		lp.addImplicitWait(5);
		cp.scrollPage(130);
		cp.clickDirectClient();
		Assert.assertTrue(cp.elementDirectClientSelected(), "Direct Client Element is not selected");
		 
		
		
	}
	
	@Test
	public void testcase3VerifyDynamicClickGridvalue()
	{
		cp = new ClientsPage(driver);
		lp = new LoginPage(driver);
		lp.navigateUrl("https://www.qabible.in/payrollapp/");
		lp.enterUserName("Carol");
		lp.enterPassword("1q2w3e4r");
		lp.clickLogin();
		lp.addImplicitWait(5);
		cp.clickClientTab();
		cp.clickEditOnTheGrid("5");
		
		Assert.assertEquals(lp.pageTitle(), "Update Client", "Edit page is not displayed");
} 
	@Test
	public void testcase4VerifyNavigatetoBack()
	{
		cp = new ClientsPage(driver);
		lp = new LoginPage(driver);
		lp.navigateUrl("https://www.qabible.in/payrollapp/");
		lp.enterUserName("Carol");
		lp.enterPassword("1q2w3e4r");
		lp.clickLogin();
		lp.addImplicitWait(5);
		cp.clickClientTab();
		cp.NaviBack();
		lp.addImplicitWait(5);
		Assert.assertEquals(lp.pageTitle(), "Payroll Application", "Navigate.Back didnt work");
	}
	
	@Test
	public void testcase5VerifyNavigatetoForward()
	{
		cp = new ClientsPage(driver);
		lp = new LoginPage(driver);
		lp.navigateUrl("https://www.qabible.in/payrollapp/");
		lp.enterUserName("Carol");
		lp.enterPassword("1q2w3e4r");
		lp.clickLogin();
		lp.addImplicitWait(5);
		cp.NaviForward();
		lp.addImplicitWait(5);
		Assert.assertEquals(lp.pageTitle(), "Update Client", "Navigate.Forward didnt work");
	}
	
	@Test
	public void testcase6VerifyToolTip()
	{
		cp = new ClientsPage(driver);
		lp = new LoginPage(driver);
		lp.navigateUrl("https://www.qabible.in/payrollapp/");
		lp.enterUserName("Carol");
		lp.enterPassword("1q2w3e4r");
		lp.clickLogin();
		lp.addImplicitWait(5);
		cp.clickClientTab();
			
		Assert.assertEquals(cp.getTooltipEyeicon(), "View", "Incorrect tooltip displayed");
} 
	*/
	
	@DataProvider(name="data-provider")
	public Object[][] pName() {
		return new Object[][] {{"firstname","firstname1"},{"secondvalue","S1"},{"thirdvalue","t1"}};
	}
	
	
	@Test(dataProvider = "data-provider",dataProviderClass = ExecuteLoginPage.class)
	public void testCase1(String value, String V2) {
		System.out.println(value+V2);
		
	}
	
}
