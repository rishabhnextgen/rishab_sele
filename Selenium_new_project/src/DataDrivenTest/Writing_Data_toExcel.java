package DataDrivenTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data_toExcel {

	public static void main(String[] args) throws IOException {
		
		
	FileOutputStream file= new FileOutputStream("C:\\Users\\Rishabh Srivastava\\Desktop\\New folder\\newtest.xlsx");
	    XSSFWorkbook workbook= new XSSFWorkbook();// creating workbook
	   
	   XSSFSheet sheet1= workbook.createSheet("rishabh");// creating new sheet in the excel name is sheet1 
	   XSSFSheet sheet2= workbook.createSheet("Amit");
	
	for(int i=0;i<=5;i++)  // using for loop for creating row in the sheet
	{
		XSSFRow row1= sheet1.createRow(i);    // 
		XSSFRow row2= sheet2.createRow(i);    //
				
			for(int j=0;j<3;j++)
			{
				row1.createCell(j).setCellValue("xyz");// create cell value and insert value
				row2.createCell(j).setCellValue("abc");
			}
				}
	workbook.write(file);
	file.close();
	System.out.println("successfully written data into excel");
	
	
	}
	
	
	
	
	
	}


