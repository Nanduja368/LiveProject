package com.UtilityMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VerifyAttributeValues {

	public boolean getElementAttribute(WebElement element, String attrType, String attrValue) {
		boolean b = element.getAttribute(attrType).contains(attrValue);
		return b;

	}

}
