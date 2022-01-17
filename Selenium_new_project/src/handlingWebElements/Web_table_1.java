package handlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table_1 {

	public static void main(String[] args) {
	
		
		
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");	
	
	WebDriver driver= new ChromeDriver();
    driver.get("");
    
     int rows=driver.findElements(By.xpath("html/body/table/tbody/tr")).size();// it will count no. of rows in the table
    
                System.out.println(rows);
                
                int col=driver.findElements(By.xpath("html/body/table/tbody/tr/th")).size(); // it will count the no. of colums in the rows         
    
                System.out.println(col);
                
                for(int i=1;i<rows;i++)
                {
                	for(int j=1;j<col;j++)
                	{
           System.out.print(driver.findElement(By.xpath("html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText()); // always put rows increment and coloum increment in big bracket with + symbol
                	
                	}
                	System.out.println("");
                }
	
	}

}
