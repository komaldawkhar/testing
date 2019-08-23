package com.excelsheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 
{

	public static void main(String[] args) 
	{
		

//		File source= new File("E:\\myworkspace\\DemoExcel.xlsx");
//		FileInputStream fs= new FileInputStream(source);
//		XSSFWorkbook ws= new XSSFWorkbook(fs);
//		XSSFSheet sheet1= ws.getSheetAt(0);
//		
//		int rowcount = sheet1.getLastRowNum();
//		System.out.println("Total row is:"+rowcount);
//		
//		for(int i=0;i<rowcount;i++)
//		{
//			String data=sheet1.getRow(i).getCell(0).getStringCellValue();
//			System.out.println("Test data from "+" is: " +data);
//		}
		//ws.close();
	
		ExcelDataConfig excel = new ExcelDataConfig("E:\\myworkspace\\DemoExcel.xlsx");
	System.out.println(excel.getData(0,0, 0));
	
	
	}

}
