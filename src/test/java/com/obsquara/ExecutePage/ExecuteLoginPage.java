package com.obsquara.ExecutePage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.UtilityMethods.ExcelRead;
import com.obsquara.LoginElements.ClientsPage;
import com.obsquara.LoginElements.LoginPage;

//login case 

public class ExecuteLoginPage extends BaseClass {
	LoginPage lp;
	// LoginPage lp = new LoginPage(driver);
	ClientsPage cp;
	ExcelRead xlre;

	/*
	 * @Test public void testcase1VerifyPageTitle() { lp = new LoginPage(driver);
	 * lp.navigateUrl("https://www.qabible.in/payrollapp"); String expectedTitle =
	 * "Login"; String actualTitle = lp.pageTitle();
	 * Assert.assertEquals(actualTitle, expectedTitle,
	 * "Page title is not as expected");
	 * 
	 * }
	 * 
	 * @Test public void testcase2VerifyCurrentUrl() { lp = new LoginPage(driver);
	 * lp.navigateUrl("https://www.qabible.in/payrollapp"); String expectedUrl =
	 * "https://www.qabible.in/payrollapp/site/login"; String actualUrl =
	 * lp.expectedCurrentUrl(); Assert.assertEquals(actualUrl, expectedUrl,
	 * "URL is not as expected");
	 * 
	 * }
	 * 
	 * @Test public void testcase3LoginProcess() { lp = new LoginPage(driver);
	 * lp.navigateUrl("https://www.qabible.in/payrollapp");
	 * lp.enterUserName("Carol"); lp.enterPassword("1q2w3e4r"); lp.clickLogin();
	 * lp.addImplicitWait(10); String expectedUser = "CAROL THOMAS";
	 * Assert.assertEquals(lp.verifyUser(), expectedUser, "User login incorrect");
	 * 
	 * 
	 * }
	 * 
	 * @Test public void testcase4VerifyIncorrectLogin() { lp = new
	 * LoginPage(driver); lp.navigateUrl("https://www.qabible.in/payrollapp");
	 * lp.enterUserName("Nanduja"); lp.enterPassword("1234567"); lp.clickLogin();
	 * lp.addImplicitWait(5); String expectedErrLogin =
	 * "Incorrect username or password."; Assert.assertEquals(lp.getErrorLoginMsg(),
	 * expectedErrLogin,"Incorrect error messsage displayed");
	 * 
	 * }
	 * 
	 * @Test public void testcase5VerifyLoginPageHeadingDisplayed() { lp = new
	 * LoginPage(driver); lp.navigateUrl("https://www.qabible.in/payrollapp");
	 * System.out.println(lp.verifyHeadingLogin());
	 * Assert.assertTrue(lp.verifyHeadingLogin()); }
	 * 
	 * @Test public void testcase6VerifyForgetPasswdMsgDisplayed() { lp = new
	 * LoginPage(driver); lp.navigateUrl("https://www.qabible.in/payrollapp");
	 * System.out.println(lp.foregtPasswdMsg());
	 * Assert.assertTrue(lp.foregtPasswdMsg()); }
	 * 
	 * @Test public void testcase7VerifyForgetPasswdMsgDisplayed() { lp = new
	 * LoginPage(driver); lp.navigateUrl("https://www.qabible.in/payrollapp");
	 * System.out.println(lp.rmbrMeText()); Assert.assertTrue(lp.rmbrMeText()); }
	 * 
	 * @Test public void tc8verifyExcelReadLogin() throws IOException { lp = new
	 * LoginPage(driver); xlre= new ExcelRead();
	 * 
	 * lp.navigateUrl("https://www.qabible.in/payrollapp");
	 * lp.enterUserName(xlre.readExcelData(1, 0));
	 * lp.enterPassword(xlre.readExcelData(1, 1)); lp.clickLogin();
	 * lp.addImplicitWait(5); String expectedUrl =
	 * "https://www.qabible.in/payrollapp/site/login";
	 * Assert.assertEquals(lp.expectedCurrentUrl(), expectedUrl,
	 * "URL is not as expected"); }
	 * 
	 * @Test public void tc9verifyIncorrectUsername() throws IOException { lp = new
	 * LoginPage(driver); xlre= new ExcelRead();
	 * 
	 * lp.navigateUrl("https://www.qabible.in/payrollapp");
	 * lp.enterUserName("Nanduja"); lp.enterPassword("1q2w3e4r"); lp.clickLogin();
	 * lp.addImplicitWait(5); Assert.assertTrue(lp.webElementIsDisplayed(),
	 * "Invalid Username"); }
	 * 
	 * @Test public void tc10verifyIncorrectUsername() throws IOException { lp = new
	 * LoginPage(driver); xlre= new ExcelRead();
	 * 
	 * lp.navigateUrl("https://www.qabible.in/payrollapp");
	 * lp.enterUserName("Carol"); lp.enterPassword("1234"); lp.clickLogin();
	 * lp.addImplicitWait(5); Assert.assertTrue(lp.webElementIsDisplayed(),
	 * "Invalid Password"); }
	 */

	@Test
	public void tc11verifyReseltFuntionality() throws IOException {
		lp = new LoginPage(driver);
		lp.navigateUrl("https://www.qabible.in/payrollapp");
		lp.addImplicitWait(5);
		lp.clickReset();
		lp.addImplicitWait(5);
		Assert.assertEquals(lp.pageTitle(), "Password Reset", "Application didnt navigate to Password Reset page");
	}

}
