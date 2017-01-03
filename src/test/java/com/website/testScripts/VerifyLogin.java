package com.website.testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.website.Factory.BrowserFactory;
import com.website.Factory.DataProviderFactory;
import com.website.pages.LoginPage;

import lib.website.utility.Helper;

public class VerifyLogin {

	WebDriver driver;
	ExtentReports reports;
	ExtentTest logger;
	
	@BeforeTest
	public void Setup(){
		
		reports= new ExtentReports("./Reports/testreport.html",true);
		logger = reports.startTest("Verify Login");
		driver = BrowserFactory.getBrowser("chrome");
		driver.get(DataProviderFactory.getconfig().getAppUrl());
		logger.log(LogStatus.PASS, "Open Application");
	}
	
	
	@Test
	public void verifyLogin(){
		
		LoginPage login = PageFactory.initElements(driver,LoginPage.class);
		login.loginApplication("Admin","admin");
		logger.log(LogStatus.INFO, "Login requested");
		login.loginsuccess();
		logger.log(LogStatus.PASS, logger.addScreenCapture(Helper.captureScreenshot(driver, "login")));
		logger.log(LogStatus.PASS, "Login Successful");
		
		
	}
	
	
	@AfterTest
	public void teardown(){
		
		driver.quit();
		reports.endTest(logger);
		reports.flush();
	}
	
	
}
