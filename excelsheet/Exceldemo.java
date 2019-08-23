/*Apache POI is simple set of java library.
 * FileInputStream class contains 
 * XSSFWorkbook is a class 
 * If file is .xls use HSSFWorkbook class
 * */

package com.excelsheet;

public class Exceldemo 
{

	public static void main(String[] args)
	{
		ExcelDataConfig excel = new ExcelDataConfig("E:\\myworkspace\\DemoExcel.xlsx");
		System.out.println(excel.getData(0, 0,0));
		
		
	}

}
