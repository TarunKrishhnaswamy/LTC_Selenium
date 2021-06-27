package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataSheet {
	
	public static String[][] getdata(String dataSheetName) throws IOException {
		FileInputStream fis = new FileInputStream("./testdata/"+dataSheetName+".xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet =  wb.getSheet(dataSheetName);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		String [][] testData = new String[rowCount][columnCount];
		
		for(int i = 1; i<= rowCount ; i++){
			XSSFRow row = sheet.getRow(i);
			
			for(int j= 0;j<columnCount ; j++){
			String cellValue = 	row.getCell(j).getStringCellValue();
			testData[i-1][j] = cellValue;
			}
		}
		
		return testData;
	}

}
