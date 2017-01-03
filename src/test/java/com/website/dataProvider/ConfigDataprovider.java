package com.website.dataProvider;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ConfigDataprovider {
	
	Properties pro;
	
	public ConfigDataprovider(){
		
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is.."+e.getMessage());
			
		}
		
	}
	
	public String getAppUrl(){
		String url= pro.getProperty("url");
		return url;
	}
	
	public String chromepath(){
		String chromepath = pro.getProperty("chromePath");
		return chromepath;
	}
	
	public String IEpath(){
		String IEpath = pro.getProperty("IEPath");
		return IEpath;
	}
	
	public String geckopath(){
		String geckopath = pro.getProperty("geckopath");
		return geckopath;
	}

}
