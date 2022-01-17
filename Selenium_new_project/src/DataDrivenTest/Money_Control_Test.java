package DataDrivenTest;

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


    public class Money_Control_Test {

	public static void main(String[] args) throws IOException {
    System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
    
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
    driver.manage().window().maximize();
    FileInputStream file= new FileInputStream   ("C:\\Users\\Rishabh Srivastava\\Desktop\\New folder\\Seleniumcalculator.xlsx");
    XSSFWorkbook workbook= new XSSFWorkbook(file);
    XSSFSheet sheet = workbook.getSheet("sheet1");
    
    
    int rowcount=sheet.getLastRowNum();
  
    
    for(int i=1;i<rowcount;i++)
    {
    XSSFRow row=sheet.getRow(i);
 
   // String var=row.getCell(0).getStringCellValue(); this is the meathod without creating object

                              // OR
    
    // int principal=(int)row.getCell(0).getNumericCellValue();    type casting numeric value
   
                           //     OR
    
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
   
    Select Periodcombo=new Select (driver.findElement(By.id("tenurePeriod")));
    Periodcombo.selectByVisibleText("year(s)");
    
    Select Frequency= new Select(driver.findElement(By.id("frequency")));
    Frequency.selectByVisibleText( fre);
    
    driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click();
   String Actualvalue= driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();// the value is dyanimically changing so here use get text meathod
    
    if(Double.parseDouble(Actualvalue)==mvalue)         // Double.parseDouble is used to convert string value into double because maturity value is returing double value sometimes
    {
    	System.out.println("test is passed");
    }
    else
    {
  
    	System.out.println("test is failed");
    	
         }
    
    driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img")).click();//       for clear button
   }
    
    driver.close();
    driver.quit();
	}
	}

