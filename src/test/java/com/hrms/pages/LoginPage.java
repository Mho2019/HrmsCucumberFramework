package com.hrms.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.baseClass;
import com.hrms.base.baseClass1;
import com.hrms.utils.CommonMethods;
import com.hrms.base.baseClass1;

public class LoginPage extends baseClass{

	
	@FindBy(id="txtUsername")
	public WebElement UserName;
	
	@FindBy(id="txtPassword")
	public WebElement Password;
	
	@FindBy(id="btnLogin")
	public WebElement LoginButton;
	
	@FindBy(id="spanMessage")
	public WebElement InvalidMsg;
	
	@FindBy(id="spanMessage")
	public WebElement EmptyFieldMsg;
	
	@FindBy(xpath = "//*[@id=\'forgotPasswordLink\']")
	public WebElement ForgotPass;
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public  void loginDetails(String username,String password) {
		CommonMethods.senddata(UserName, username);
		CommonMethods.senddata(Password, password);
		CommonMethods.click(LoginButton);
	}
}
