package com.website.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver){
		
		this.driver= ldriver;
		
	}
	
	@FindBy (id="txtUsername") WebElement usernamebox;
	@FindBy (id="txtPassword") WebElement passwordbox;
	@FindBy (id="btnLogin") WebElement LoginButton;
	
	By Welcomelabel= By.id("welcome");
	



public void loginApplication( String user,String pass){
	
	usernamebox.clear();
	usernamebox.sendKeys(user);
	passwordbox.clear();
	passwordbox.sendKeys(pass);
	LoginButton.click();
	
}

public void loginsuccess(){
	WebDriverWait wait = new WebDriverWait(driver,20);
	WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(Welcomelabel));
	String text = ele.getText();
	Assert.assertEquals(text, "Welcome Admin");
	
	
}




}
