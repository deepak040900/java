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

public class Specficcolumn {
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\deepak\\eclipse-workspace\\Maven_project\\task1.xlsx");
		FileInputStream f1=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(f1);
		Sheet sheetAt = w.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(0);
			CellType cellType = cell.getCellType();
			if(cellType.equals(cellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);
		
			}
			
			else if(cellType.equals(cellType.NUMERIC)) {
				double value = cell.getNumericCellValue();
				int num=(int) value;
				System.out.println(num);
			}
		}
		
	}

}
