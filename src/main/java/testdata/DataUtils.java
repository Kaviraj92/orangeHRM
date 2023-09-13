package testdata;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import utility.ReadExcelData;

public class DataUtils {

	@DataProvider(parallel=!true)
	
	public String [][] getData() throws IOException
	{
		String[][]excelData=ReadExcelData.getSheetData();
		
		return excelData;
		
		
	}
	
}
