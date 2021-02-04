package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.baseClass1;

public class LogOutPage {

	
	
	@FindBy(xpath = "//a[@id='welcome']")
	public WebElement ClickOnLogoutIcon;
	
	@FindBy(xpath = "//a[@href='/index.php/auth/logout']")
	public WebElement ClickOnLoggingout;
		
	
	public LogOutPage(){
		PageFactory.initElements(baseClass1.driver, this);
	}
}
