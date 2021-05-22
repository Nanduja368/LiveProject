package com.UtilityMethods;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ExcelRead {

	 
		XSSFSheet sh;

		public ExcelRead() throws IOException
		{
			 FileInputStream fin=new FileInputStream("C:\\Users\\Nanduja.CN\\eclipse-workspace\\LiveProject\\src\\main\\resources\\Excelread.xlsx");
			 XSSFWorkbook w = new XSSFWorkbook(fin);
			 sh = w.getSheet("Sheet1");//Sheet data taken to sh variable
		}
		
		public String readExcelData(int row,int column) 
		{
			
			Row r= sh.getRow(row);
			Cell c= r.getCell(column);
			int celltype= c.getCellType();
			switch(celltype) 
			{
			case Cell.CELL_TYPE_NUMERIC:
			{
				double num=c.getNumericCellValue();
				return String.valueOf(num);
				
			}
			case Cell.CELL_TYPE_STRING:
			{
			      return c.getStringCellValue();
			
			}
			
			
			
			}
			return null;
		}
	}

	

