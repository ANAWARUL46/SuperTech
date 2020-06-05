package datahelper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReader {
	HashMap<String, String>storeValue=new HashMap<String, String>();
	
	public static List<HashMap<String, String>>excelDataReading(String filepath, String sheetName) throws IOException {
		List<HashMap<String, String>>mydata=new ArrayList<HashMap<String, String>>();
		FileInputStream fis=new FileInputStream(filepath);
		Workbook wb= new XSSFWorkbook(fis);
		Sheet ws=wb.getSheet(sheetName);
		Row HeaderRow=ws.getRow(0);
		for(int i=1; i<ws.getPhysicalNumberOfRows();i++) {
			Row currentRow=ws.getRow(i);
			HashMap<String, String>currentHash=new HashMap<String, String>();
			for(int j=0; j<currentRow.getPhysicalNumberOfCells(); j++) {
				Cell currentCell=currentRow.getCell(j);
				switch(currentCell.getCellType()) {
				case STRING: 
					currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
					break;
				
				default:
				break;
			}
		}
		mydata.add(currentHash);
	}
		return mydata;
	}
}
