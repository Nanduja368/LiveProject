package com.UtilityMethods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class WebElementListText {
	
	public List<String> WebElementListToText(WebDriver driver, String locator){
		List<WebElement> weList = driver.findElements(By.xpath(locator));
		List<String> welValue = new ArrayList<String>();
		for (int i=0; i<weList.size();i++)
		{
			welValue.add(weList.get(i).getText());
		}
		
		return welValue;
	}

}
