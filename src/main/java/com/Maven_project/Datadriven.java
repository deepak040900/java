package com.Maven_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {
	  
	public static void read_All_Data() throws IOException {
		
		File f=new File("C:\\Users\\deepak\\eclipse-workspace\\Maven_project\\task1.xlsx");
		FileInputStream f1=new FileInputStream(f);
		
		//interface class
		Workbook w=new XSSFWorkbook(f1);
		
		Sheet sheetAt = w.getSheetAt(0);
		
		 int numberofrows = sheetAt.getPhysicalNumberOfRows();
		 //outerloop
		 for (int i = 0; i < numberofrows ; i++) {
			 Row row = sheetAt.getRow(i);
			 int numberOfCells = row.getPhysicalNumberOfCells();
		//innnerloop	 
	     for (int j = 0; j < numberOfCells; j++) {
	    	 
	    	 Cell cell = row.getCell(j);
	    	 CellType cellType = cell.getCellType();
	    	 
	    	 if(cellType.equals(cellType.STRING)) {
	    		 
	    		 String Value = cell.getStringCellValue();
	    		 System.out.println(Value);
	    	 }
	    	 else if(cellType.equals(cellType.NUMERIC)) {
	    		 double Value1 = cell.getNumericCellValue();
	    		 int num=(int) Value1;
	    		 System.out.println(num);
	    	 }
		}
			
		}
	}
public static void main(String[] args) throws IOException {
	 read_All_Data();
}
}
