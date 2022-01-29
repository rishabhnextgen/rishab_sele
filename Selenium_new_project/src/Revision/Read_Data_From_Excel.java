package Revision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;               // "C:\\Users\\Rishabh Srivastava\\Desktop\\seleneun.xlsx"
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Excel {

	public static void main(String[] args) throws IOException {
		FileInputStream file= new FileInputStream("F:\\Selenium Data_Driven\\Emp_Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		/*
		 * XSSFSheet sheet = workbook.getSheet("Sheet1");// providing sheeet name
		 * 
		 * OR
		 */
		XSSFSheet sheet= workbook.getSheetAt(0);// providing index
    int rowcount= sheet.getLastRowNum();// row count and store in a variable
   int colcount= sheet.getRow(0).getLastCellNum();// count all col and store in a variable
         
	
   for(int i=0;i<rowcount;i++)
	{
		XSSFRow currentrow=sheet.getRow(i);// focussed on the current row
	
		for(int j=0;j<colcount;j++)
		{
		String value=	currentrow.getCell(j).toString();// read the value from the cell
			System.out.print("  " + value);
			
			}
		System.out.println();
		
		
	}
	
}

}
