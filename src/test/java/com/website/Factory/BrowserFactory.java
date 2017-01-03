package com.website.Factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver getBrowser(String browserName){
		
		if(browserName.equalsIgnoreCase("firefox")){
			
			
			System.setProperty("driver.firefox.marionette", DataProviderFactory.getconfig().geckopath());
			driver= new FirefoxDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("chrome")){
			
			
			System.setProperty("Webdriver.chrome.driver", DataProviderFactory.getconfig().chromepath());
			driver= new ChromeDriver();
			
		}
		
else if(browserName.equalsIgnoreCase("IE")){
			
			
			System.setProperty("Webdriver.ie.driver", DataProviderFactory.getconfig().IEpath());
			driver= new InternetExplorerDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}

}
