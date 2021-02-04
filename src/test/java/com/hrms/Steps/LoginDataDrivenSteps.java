package com.hrms.Steps;

import org.junit.runner.RunWith;
import org.testng.asserts.SoftAssert;

import com.hrms.base.PageIntializer;
import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDataDrivenSteps extends PageIntializer{

	@Given("User navigates to the login page and Enters the userID {string} and password {string}")
	public void user_navigates_to_the_login_page_and_Enters_the_userID_and_password(String username, String password) {
	    CommonMethods.senddata(loginpage.UserName, username);
	    CommonMethods.senddata(loginpage.Password, password);
	   
	   	}
	

	@Then("User verify if correct {string} is displayed")
	public void user_verify_if_correct_is_displayed(String ErrorMsg) {
		String ActulErrorMsg = loginpage.InvalidMsg.getText();
		System.out.println(ActulErrorMsg);
		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(ActulErrorMsg, ErrorMsg, "if expected value does not match test cases fails");
		sa.assertAll();
		
	}



	}
	
	

