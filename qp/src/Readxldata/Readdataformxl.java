package Readxldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdataformxl {
	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		//read data from ipl sheet
		
		//implementation of read the data from excel
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");// provide the path 
		Workbook wb = WorkbookFactory.create(fis);//make the file for ready to read
		Sheet sheet = wb.getSheet("IPL");//Get into the sheet
		Row row = sheet.getRow(3);//get into the desired row
		Cell cell = row.getCell(1);//get into the desired cell
		String data = cell.getStringCellValue();
		System.out.println(data);
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		
	}

}
