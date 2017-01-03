package com.website.dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@SuppressWarnings("unused")
public class ExcelDataprovider {
	
	XSSFWorkbook wb;
	
	public  ExcelDataprovider(){
		
	    File src = new File ("");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error message is.." + e.getMessage());
		}
	    
	}
		
		public String getdata (int sheetindex,int row,int col)
		{
			String data=wb.getSheetAt(sheetindex).getRow(row).getCell(col).getStringCellValue();
			return data;
			
			
		}
		
		public String getdata (String sheetname,int row,int col)
		{
			String data=wb.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
			return data;
			
			
		}
	    
	
}
