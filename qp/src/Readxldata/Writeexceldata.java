package Readxldata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Datadrivenframework.Flib;

public class Writeexceldata {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//write the data in excel sheet
//		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sheet = wb.getSheet("IPL");
//		Row row = sheet.createRow(12);
//		Cell cell = row.createCell(0);
//		 cell.setCellValue("pune");
//		
//		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
//		wb.write(fos);
		Flib flib = new Flib();
		flib.writeExcelData("./data/TestData.xlsx", "IPL", 13, 0, "PUNE");
		
	}

}
