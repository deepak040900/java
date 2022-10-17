package com.Maven_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_write {
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\deepak\\eclipse-workspace\\Maven_project\\task1.xlsx");
		
		FileInputStream f1=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(f1);
		
		Sheet createSheet = w.createSheet("Data");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("yogesh");

		
		w.getSheet("Data").getRow(0).createCell(1).setCellValue("123");
		w.getSheet("Data").createRow(1).createCell(0).setCellValue("raj");
		w.getSheet("Data").getRow(1).createCell(1).setCellValue("234");
		w.getSheet("Data").createRow(2).createCell(0).setCellValue("sanjay");
		w.getSheet("Data").getRow(2).createCell(1).setCellValue("567");
		
		FileOutputStream f2=new FileOutputStream(f);
		w.write(f2);
		
		
		
	}

}
