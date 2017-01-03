package lib.website.utility;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;


public class Helper  {
	
	
	public static String captureScreenshot(WebDriver driver,String Screenshotname){
	
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	String destination= "C://Users//Sid//workspace//com.website.OrangeHRM//Screenshots"+Screenshotname+System.currentTimeMillis()+".png";
	
	try {
		FileUtils.copyFile(src,new File(destination));
	} catch (Exception e) {
		
		System.out.println("Exception is"+e.getMessage());
		
	}
	
	return destination;
	
	}
	

}
