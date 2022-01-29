package Revision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Another_Example_of_Excel_Read {

	

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file = new FileInputStream("F:\\Selenium Data_Driven\\Student Database.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
	 int row	=sheet.getLastRowNum();
	int col= sheet.getRow(0).getLastCellNum();
	for(int i=0;i<row; i++)
	{
		XSSFRow currentrow = sheet.getRow(i);
		for (int j=0;j<col;j++)
		{
	   String value=    currentrow.getCell(j).toString(); 
		
		System.out.print(" "+ " "+ value);
		}
	System.out.println();
	System.out.println();
	}
		
		
	}

}
