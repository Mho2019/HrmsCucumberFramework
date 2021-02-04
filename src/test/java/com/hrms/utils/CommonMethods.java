package com.hrms.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.hrms.base.baseClass;
import com.hrms.base.baseClass1;

public class CommonMethods {

	public static void senddata(WebElement element, String text) {
		isElementPresent(element);
		element.clear();
		element.sendKeys(text);
		
	}
	
	public static void click(WebElement element) {
		isElementPresent(element);
		element.click();
	}

	
	public static void staticwait(int second) {
		try {
			Thread.sleep(second*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static boolean isElementPresent(WebElement element) {
		if (element.isDisplayed()) {
			return true;
		}
		
		else {
			System.out.println("Element is not displayed");
			return false;
		}
		
		
	}
	
	public static JavascriptExecutor jsobject() {
		JavascriptExecutor js= (JavascriptExecutor)baseClass.driver; 
		return js;
	}
	
	public static void jsClick(WebElement ele) {
		jsobject().executeScript("arguments[0].click();", ele);
	}
	
	
}
