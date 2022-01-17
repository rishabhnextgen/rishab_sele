package DataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration_test {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		
		
         WebDriver driver= new ChromeDriver();
         driver.get("http://demo.guru99.com/test/newtours/index.php");
         driver.manage().window().maximize();
         

         
                        // getting data from excel sheet
         
         FileInputStream file= new FileInputStream("C:\\Users\\Rishabh Srivastava\\Desktop\\New folder\\seleniumtest.xlsx");
        
    
       
                  // get the work XLS from instance file 
         
         XSSFWorkbook workbook= new XSSFWorkbook(file);
         
                  // get the first sheet from the workbook
         
         XSSFSheet sheet= workbook.getSheet("Sheet1");
         
                      // get the first row from sheet
         
                 int noofrow=sheet.getLastRowNum();
   
   System.out.println("the number of records in the excel sheets  "+ noofrow);
         
         for (int row=1; row<noofrow; row++)
         {
        XSSFRow currentrow=	 sheet.getRow(row);
    
        
        XSSFCell firstname=  currentrow.getCell(0);
    String first= (String) firstname.getStringCellValue();
        
    XSSFCell Lastname=  currentrow.getCell(1);
    String last= (String) Lastname.getStringCellValue();
   
    XSSFCell phone=  currentrow.getCell(2);
    int ph= (int) phone.getNumericCellValue();
    
   
    XSSFCell Email=  currentrow.getCell(3);
    String eml= (String) Email.getStringCellValue();
    
    XSSFCell Address= currentrow.getCell(4);
    String Add=(String)Address.getStringCellValue(); 
    
    XSSFCell City= currentrow.getCell(5);
    String cty=(String)City.getStringCellValue(); 
    
    XSSFCell State= currentrow.getCell(6);
    String state=(String)State.getStringCellValue(); 
    
    XSSFCell Pincode=  currentrow.getCell(7);
    int pin= (int) Pincode.getNumericCellValue();
     
    XSSFCell Country= currentrow.getCell(8);
    String contry=(String)Country.getStringCellValue(); 
    
    
    XSSFCell Username= currentrow.getCell(9);
    String name=(String)Country.getStringCellValue(); 
    
    XSSFCell Password= currentrow.getCell(10);
    String pass=(String)Country.getStringCellValue(); 
    
    
    XSSFCell ConfirmPassword= currentrow.getCell(11);
    String cnfrmpass=(String)Country.getStringCellValue(); 
    
                                     //OR
         /* String First_name= currentrow.getCell(0).getStringCellValue();
        String Last_name= currentrow.getCell(1).getStringCellValue();
        String Phone= currentrow.getCell(2).getStringCellValue();
        String Email= currentrow.getCell(3).getStringCellValue();
        String Address= currentrow.getCell(4).getStringCellValue();
        String City= currentrow.getCell(5).getStringCellValue();
        String State= currentrow.getCell(6).getStringCellValue();
        String Pincode= currentrow.getCell(7).getStringCellValue();
        String Country= currentrow.getCell(8).getStringCellValue();
        String UserName= currentrow.getCell(9).getStringCellValue();
        String Password= currentrow.getCell(10).getStringCellValue();
        */
   
                             //  Registration process
    
    driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]")).click();

                            // Entering contact information
    
    driver.findElement(By.name("firstName")).sendKeys(String.valueOf(firstname));
    driver.findElement(By.name("lastName")).sendKeys(String.valueOf(Lastname));
    driver.findElement(By.name("phone")).sendKeys(String.valueOf(phone));
    driver.findElement(By.id("userName")).sendKeys(String.valueOf(Email));
 
                             // Entering mailing address
   
    driver.findElement(By.name("address1")).sendKeys(String.valueOf(Address));
    driver.findElement(By.name("city")).sendKeys(String.valueOf(City));
    driver.findElement(By.name("state")).sendKeys(String.valueOf(State));
    driver.findElement(By.name("postalCode")).sendKeys(String.valueOf(Pincode));

                     // selecting country from dropdown 
   
     Select Frequency=new Select (driver.findElement(By.name("country")));
     Frequency.selectByVisibleText("ARUBA");
    
                          // entering user information
    driver.findElement(By.name("email")).sendKeys(String.valueOf(Username));
    driver.findElement(By.name("password")).sendKeys(String.valueOf(Password));   
    driver.findElement(By.name("confirmPassword")).sendKeys(String.valueOf(ConfirmPassword));   
    
   
   
    if(String.valueOf(Password).equals(String.valueOf(ConfirmPassword)))
    {
    	System.out.println("password confirmed");
    	
    }
    else
    {
    	System.out.println("Incorrect Confirm Password");
    }
     
                      // submitting form
    
    driver.findElement(By.name("submit")).click();
     
    if(driver.getPageSource().contains("Thank you for registering."))
    {
    	System.out.println("registration completed" + row +"record ");

    }

    else {
    	System.out.println("registration failed "+ row+ "record" );
    }
    
          }
     System.out.println("data driven test completed");
     driver.close();
     driver.quit();
     file.close(); 
    
  }
}
	