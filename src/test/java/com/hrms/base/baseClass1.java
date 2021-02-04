package com.hrms.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.hrms.utils.ConfigReader;
import com.hrms.utils.Constants;



public class baseClass1 {

	public static WebDriver driver;       
 
	
	
	
	public static  WebDriver setup() {
		ConfigReader.readProperties(Constants.CONFIGURATION_FILE_PATH);
		switch(ConfigReader.getProperty("browserName")) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
	        driver = new ChromeDriver();
	        break;
		case "Firefox":
			 System.setProperty("webdriver.gecko.driver", Constants.FIREFOX_DRIVER_PATH);
		        driver = new FirefoxDriver();
		        break;
		case "IE":
			 System.setProperty("webdriver.ie.driver", Constants.IE_DRIVER_PATH);
		        driver = new InternetExplorerDriver();
		        break;
		        default:{
		        	System.out.println("Invalid browser selected by user");
		        }
	   		           
		}
		
		
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		PageIntializer.intialize();
		return driver;
		
	       	        
	}
	
  
	public static void tearDown() {
	if (driver !=null) {
	driver.quit();
		}
		
	}
	
}

