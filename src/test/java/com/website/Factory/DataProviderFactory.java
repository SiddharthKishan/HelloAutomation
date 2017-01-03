package com.website.Factory;

import com.website.dataProvider.ConfigDataprovider;
import com.website.dataProvider.ExcelDataprovider;

public class DataProviderFactory {

	public static ConfigDataprovider getconfig (){
		
		ConfigDataprovider config = new ConfigDataprovider();
		return config;
		
	}
	
public static ExcelDataprovider getexcel (){
		
	ExcelDataprovider excel = new ExcelDataprovider();
		return excel;
		
	}
	

	
	
}
