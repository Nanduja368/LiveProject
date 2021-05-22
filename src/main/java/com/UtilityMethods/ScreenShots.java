package com.UtilityMethods;

import java.io.File;
import java.util.logging.FileHandler;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

//import com.sun.java.util.jar.pack.Package.File;



public class ScreenShots {
  //WebDriver driver;
  public void screenShotOfFailureCases(WebDriver driver) throws Exception {
	  
	  TakesScreenshot ss =((TakesScreenshot)driver);
	  File f1 =ss.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f1, new File("C:\\Users\\Nanduja.CN\\eclipse-workspace\\LiveProject\\"+"Screenshot"+".png"));
		System.out.println("Successfully captured a screenshot");
  }
}



