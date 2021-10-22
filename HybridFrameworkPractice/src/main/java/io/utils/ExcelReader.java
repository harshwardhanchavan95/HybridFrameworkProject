package io.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	XSSFWorkbook xssfWorkbook;
	
	public ExcelReader() {
		File excelFile= new File(System.getProperty("user.dir")+"/src/main/java/io/testdata/Book1.xlsx");
		try {
			FileInputStream fis=new FileInputStream(excelFile);
		    xssfWorkbook=new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public Object readexcel(int sheetIndex) {
		
		Object data[][]=new Object[3][3];
		int rows=rowCount(sheetIndex);
		
		for(int i=0; i<rows; i++) {
		data[i][0]=xssfWorkbook.getSheetAt(sheetIndex).getRow(i).getCell(0).getStringCellValue();
		data[i][1]=xssfWorkbook.getSheetAt(sheetIndex).getRow(i).getCell(1).getStringCellValue();
		}
		return data;	
	}

	public int rowCount(int sheetIndex) {
		int rows=xssfWorkbook.getSheetAt(sheetIndex).getLastRowNum();
		return rows+1;
	}

}
