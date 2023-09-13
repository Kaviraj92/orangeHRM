package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {
	
	public static String filePath = null;
	public static Workbook book;
	public static Sheet sheet;
	/**
	 * this method is used to read data from excel
	 * @param sheetName
	 * @return
	 */
	public static Object[][] readTestData(String filePath,String sheetName) throws FileNotFoundException {
		Object [][] data =null;
		try {
			FileInputStream fis = new FileInputStream(filePath);
			
			book = WorkbookFactory.create(fis);
			sheet = book.getSheet(sheetName);
			
			data  = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			
			for(int i=0; i<sheet.getLastRowNum();i++) {
				for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
					
					data[i][j] = sheet.getRow(i+1).getCell(j).toString();
				}
			}
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return data;
	}
}
