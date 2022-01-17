package DataDrivenTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data_toExcel2 {

	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream file= new FileOutputStream("C:\\Users\\Rishabh Srivastava\\Desktop\\New folder\\newtest.xlsx");
	    XSSFWorkbook workbook= new XSSFWorkbook();// creating workbook
	   
	   XSSFSheet sheet= workbook.createSheet("rishabh");// creating new sheet in the excel name is sheet1 
	
	
	for(int i=0;i<=5;i++)  // using for loop for creating row in the sheet
	{
		XSSFRow row= sheet.createRow(i);// 
		
				
			for (int j=0;j<3;j++)
			{
				row.createCell(j).setCellValue("xyz");// create cell value and insert value
			}
				}
	workbook.write(file);
	file.close();
	System.out.println("successfully written data into excel");
	
	
	}
	
	
	
	
	
	}


