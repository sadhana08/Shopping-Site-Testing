package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntegrationWithTC {

	public static String[][] excelValue(String fileData) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook("./data/"+fileData+".xlsx");
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		short cellCount = sheet.getRow(0).getLastCellNum();
		
		String[][] datum = new String[rowCount][cellCount];
		
		for(int i=1; i<=rowCount; i++) {
			for(int j=0; j<cellCount; j++) {
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
				datum[i-1][j]= data;
			}
		}
		workbook.close();
		return datum;	
	}
}
