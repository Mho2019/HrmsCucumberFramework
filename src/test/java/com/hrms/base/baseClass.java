package com.hrms.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.hrms.utils.ConfigReader;
import com.hrms.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
public static WebDriver driver;       
 
		
	public static  WebDriver setup() {
		ConfigReader.readProperties(Constants.CONFIGURATION_FILE_PATH);
		String headlessMode=ConfigReader.getProperty("headless");
		switch(ConfigReader.getProperty("browserName")) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions cOptions= new ChromeOptions();
			if(headlessMode.equalsIgnoreCase("true")) {
				cOptions.setHeadless(true);
				driver = new ChromeDriver(cOptions);
			}else {
				driver = new ChromeDriver(cOptions);
				//break;
			}
			
	       // driver = new ChromeDriver();
	        break;
		case "Firefox":
			 WebDriverManager.firefoxdriver().setup();
			 FirefoxOptions fOptions= new FirefoxOptions();
				if(headlessMode.equalsIgnoreCase("true")) {
					fOptions.setHeadless(true);
					driver = new FirefoxDriver(fOptions);
				}else {
					driver = new FirefoxDriver(fOptions);
					//break;
				}
				
		       // driver = new FirefoxDriver();
		        break;
		case "IE":
			WebDriverManager.iedriver().setup();
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
