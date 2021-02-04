package com.hrms.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.baseClass;
import com.hrms.base.baseClass1;
import com.hrms.base.baseClass1;

public class AddUserPage extends baseClass{

	@FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']")
	public WebElement AdminTab;
	
	@FindBy(xpath = "//input[@id='btnAdd']")
	public WebElement AddButton;
	
	@FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
	public WebElement employeeName;
	
	@FindBy(xpath = "//input[@id='systemUser_userName']")
	public WebElement userName;
	
	@FindBy(xpath = "//input[@id='systemUser_password']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
	public WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@id='btnSave']")
	public WebElement btnSave;
	
	
	public AddUserPage(){
		PageFactory.initElements(driver, this);
	}
		
}
