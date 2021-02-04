package com.hrms.Steps;

import com.hrms.base.PageIntializer;
import com.hrms.base.baseClass1;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUserSteps extends PageIntializer {
	
	@Given("User login with valid credintals")
	public void user_login_with_valid_credintals() {
		
		CommonMethods.senddata(loginpage.UserName,ConfigReader.getProperty("UserName"));
		CommonMethods.senddata(loginpage.Password,ConfigReader.getProperty("Password"));
		CommonMethods.click(loginpage.LoginButton);
		
	}

	@Given("User navigate to Add new user page")
	public void user_navigate_to_Add_new_user_page() {
		CommonMethods.click(adduserpage.AdminTab);
		CommonMethods.click(adduserpage.AddButton);
	}

	@When("User Enters following user details {string} {string} {string} and {string}")
	public void user_Enters_following_user_details_and(String EmployeeName, String Username, String Password, String ConfirmPassword) {
		CommonMethods.senddata(adduserpage.employeeName, EmployeeName );
		CommonMethods.senddata(adduserpage.userName, Username);
		CommonMethods.senddata(adduserpage.password, Password);
		CommonMethods.senddata(adduserpage.confirmPassword, ConfirmPassword);
	}

	@When("User Clicks on the Save button")
	public void user_Clicks_on_the_Save_button() {
		CommonMethods.click(adduserpage.btnSave);
	   
	}

	@Then("User is added successfully")
	public void user_is_added_successfully() {
	   
	}

	
	
	

}
