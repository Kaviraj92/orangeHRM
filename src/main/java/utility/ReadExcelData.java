package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public static String[][] getSheetData() throws IOException {
	
	String fileLocation="./src/main/java/testdata/swacelab.xlsx";
	XSSFWorkbook wbook=new XSSFWorkbook(fileLocation);
	XSSFSheet sheet=wbook.getSheetAt(0);
		int lastRowNum=sheet.getLastRowNum();
		int physicalNumberOfRows=sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows: "+ lastRowNum);
		short lastCellNum=sheet.getRow(0).getLastCellNum();
		System.out.println("No ofCells "+ lastCellNum);
		String[][] data =new String [lastRowNum][lastCellNum];
		for (int i = 1; i <=lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
		for (int j = 0; j < lastCellNum; j++) {
			XSSFCell cell = row.getCell(j);
			DataFormatter dft=new DataFormatter();
			String value=dft.formatCellValue(cell);
			//String value = cell.getStringCellValue();
			data [i-1][j]=value;
			
		
			System.out.println(value);
		} 
	}
	wbook.close();
	return data;

		} 
	}

	

