package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntegrationWithTC {

	public static String[][] excelValue(String fileName) throws IOException {
		XSSFWorkbook workBook = new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		XSSFSheet sheet = workBook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		short colCount = sheet.getRow(0).getLastCellNum();
		
		String[][] datum = new String[rowCount][colCount];
		
		for(int i=1; i<=rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				datum[i-1][j] = data;
			}
		}
		workBook.close();
		return datum;
	}

}
