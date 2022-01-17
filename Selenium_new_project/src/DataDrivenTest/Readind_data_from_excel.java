package DataDrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.collections4.Get;
import org.apache.poi.xssf.usermodel.*;

public class Readind_data_from_excel {
	
	
	public static void main(String[] args) throws IOException {
		
		//create file input stream
		// import it
		// add throws exception
		
		
	FileInputStream file= new FileInputStream("F:\\selenium practise.xlsx");
	
	// create workbook 
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	
	// create sheet 
	XSSFSheet sheet=  workbook.getSheet("Sheet1");
	
	/*
	  create sheet for index
	
      XSSFSheet sheet= workbook.getSheetAt(0);
	*/
	
	                                                                               //i= 1
	                                                                               // j=1
	// count last row number of sheet
	int rowcount= sheet.getLastRowNum();
	
	//  count last coloumn number
	
	int colcount=sheet.getRow(0).getLastCellNum();
	
	for(int i=0;i<=rowcount;i++) // read the value from excel sheet
	{
		
	XSSFRow	currentrow =sheet.getRow(i);// focussed on current row
	
	for(int j=0;j<colcount;j++)
	{
		String value= currentrow.getCell(j).toString();// read the value from a cell// toString meathod is yused to read all type of value
	
	System.out.print(" " +" "+  value);
	}
	System.out.println();
	
	}
	}
	}


