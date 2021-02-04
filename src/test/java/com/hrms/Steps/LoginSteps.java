package com.hrms.Steps;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.hrms.base.PageIntializer;
import com.hrms.base.baseClass1;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends PageIntializer {
	
	@Given("User navigates to the login page")
	public void user_navigates_to_the_login_page() {
		//Covered in Hooks
	   
	}

	@When("User Enters the valid Username and Valid Password")
	public void user_Enters_the_valid_Username_and_Valid_Password() {
		CommonMethods.senddata(loginpage.UserName,ConfigReader.getProperty("UserName"));
		CommonMethods.senddata(loginpage.Password,ConfigReader.getProperty("Password"));
		
	}

	@When("User Clicks on the login button")
	public void user_Clicks_on_the_login_button() {
		CommonMethods.click(loginpage.LoginButton);
	    if(loginpage.LoginButton.isEnabled()) {
	     
	    	String ActualValue=baseClass1.driver.getTitle();
	    	Assert.assertTrue(ActualValue.equalsIgnoreCase("U.S Custom and \n Border Proctioon" ));
	    	//Assert.assertTrue(true);
	    }
	}

	@Then("User Should successfully login into the application")
	public void user_Should_successfully_login_into_the_application() {
		String ActualValue=baseClass1.driver.getTitle();
		System.out.println(ActualValue);	
	//	String ExpectedValue= "OrangeHRM";
		Assert.assertTrue(ActualValue.equalsIgnoreCase("U.S Custom and \n Border Proctioon" ));
		
		
		String tileweb = driver.findElement(By.cssSelector("")).getText();
		
		
		
		
			
		
	}

	
	
	@When("User Enters the Invalid Username and Valid Password")
	public void user_Enters_the_Invalid_Username_and_Valid_Password() {
	loginpage.UserName.sendKeys(ConfigReader.getProperty("InvalidUsername"));
	loginpage.Password.sendKeys(ConfigReader.getProperty("Password"));
	loginpage.LoginButton.click();	
	}
	

	@Then("User Should not successfully login into the application")
	public void user_Should_not_successfully_login_into_the_application() {
	   
		String ActulErrorMsg = loginpage.InvalidMsg.getText();
		System.out.println(ActulErrorMsg);
		String ExpectedErrorMsg = "Invalid credentials";
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(ActulErrorMsg, ExpectedErrorMsg, "if expected value does not match test cases fails");
		sa.assertAll();
	}




}
