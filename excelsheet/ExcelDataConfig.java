package com.excelsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig 
{
	XSSFWorkbook ws;
	XSSFSheet sheet1;
	
	public ExcelDataConfig(String excelPath)
	{
		try 
		{
			//reading file from harddrive
			File source= new File(excelPath);
			
			//getting input filestream of src file object
			FileInputStream fs= new FileInputStream(source);
			
			//For accessing Excel from POI  api pass input stream of src to XSSFWorkbook constructor. loads whole workbook
			XSSFWorkbook ws= new XSSFWorkbook(fs);
			
		}
		catch (Exception e) 
		{
				System.out.println(e.getMessage());
		}
	}

   public String getData(int sheetNumber, int row, int column)
  {
	sheet1= ws.getSheetAt(0);
	String data = sheet1.getRow(row).getCell(column).getStringCellValue();
	return data;
   }
}