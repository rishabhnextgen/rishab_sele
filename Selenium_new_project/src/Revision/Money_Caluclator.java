package Revision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Money_Caluclator {

	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank"
				+ "-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		
		FileInputStream file= new FileInputStream("F:\\Selenium Data_Driven\\Calulator.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowcount =sheet.getLastRowNum();
		for (int i = 1; i <rowcount; i++) {
			
			
		XSSFRow row=	sheet.getRow(i);

	    XSSFCell principalcell= row.getCell(0);// this is the meathod on creating object then call cell value
	    int princ= (int) principalcell.getNumericCellValue();   
	    
	    XSSFCell roi= row.getCell(1);
	    int RateofInterest= (int)roi.getNumericCellValue();
	    
	    XSSFCell period= row.getCell(2);
	    int per= (int)period.getNumericCellValue(); 
	    
	    XSSFCell frequency= row.getCell(3);
	    String fre= frequency.getStringCellValue(); 
	    
	    
	    XSSFCell Maturityvalue= row.getCell(4);
	    int mvalue= (int)Maturityvalue.getNumericCellValue(); 
	    
		
		
		driver.findElement(By.id("principal")).sendKeys(String.valueOf(princ));

		driver.findElement(By.id("interest")).sendKeys(String.valueOf(RateofInterest));
		
		driver.findElement(By.id("tenure")).sendKeys(String.valueOf(per));
	   Select periodcombo= new Select(	driver.findElement(By.id("tenurePeriod")));
	   periodcombo.selectByVisibleText("year(s)");
		
	  Select freq= new Select (driver.findElement(By.id("frequency")));
	   freq.selectByVisibleText(fre);
	   driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click();
	   
	  String actual_maturity= driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();
	  if (Double.parseDouble(actual_maturity)==mvalue)
			  {
		System.out.println("Test is Passed");
	
			  
			  } else {
System.out.println("Test is Failed");
	}
	   
		
	  driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img")).click();
		
		}
		
			
		}
		
		
		
	}


