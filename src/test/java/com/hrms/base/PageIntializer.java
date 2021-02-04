package com.hrms.base;

import com.hrms.pages.AddUserPage;
import com.hrms.pages.LogOutPage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.PimAddEmployeePage;

public class PageIntializer extends baseClass1 {
	public static LoginPage loginpage;
	public static PimAddEmployeePage addEmployee;
	public static LogOutPage logoutpage;
	public static AddUserPage adduserpage;
	
	public static void intialize() {
		 loginpage= new LoginPage();
		 addEmployee = new PimAddEmployeePage();
		 logoutpage = new LogOutPage();
		 adduserpage = new AddUserPage();
	}
	
	
	
}

