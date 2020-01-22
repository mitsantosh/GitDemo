package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
		static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static void main(String[] args) {
		//getRowCount();
		//getCellDataString();
		getCellDataNumber(2, 1);
	}
	
	public ExcelUtils (String excelPath, String SheetName) {
		try {
		
		workbook = new XSSFWorkbook(excelPath);
		sheet=workbook.getSheet(SheetName);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	public static void getRowCount() {
		int rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows :"+rowCount);
	}

	public static void getCellDataString(int rowNum, int columnNum) {
		
		String cellData=sheet.getRow(rowNum).getCell(columnNum).getStringCellValue();
		System.out.println(cellData);
		
	}
	
	public static void getCellDataNumber(int rowNum, int columnNum) {
		
		double cellData=sheet.getRow(rowNum).getCell(columnNum).getNumericCellValue();
		System.out.println(cellData);
		
	}
}
