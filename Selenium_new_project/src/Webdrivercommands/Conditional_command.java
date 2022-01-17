package Webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_command {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		
		// storing the value in the webdriver variable
		
		WebElement user= driver.findElement(By.name("userName"));
		WebElement pass=driver.findElement(By.name("password") );
		
		
		{
			user.sendKeys("mercury");
			
			System.out.println("test is passes");
		}
	
	 if(pass.isDisplayed() && pass.isEnabled())//    here is displayed meathod is use to check wheteher the particular block is present or not
		{
			pass.sendKeys("mercury");               // is enabled meathod is to use to check the entire value is present in the box or not
		
	}
		else {
			System.out.println("test is failed");
		}
	
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
        driver.close();
        
	}
}


        
/*       is  selected commands 
            
             
             For  female button 
           
       System.out.println( driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/"
         		+ "tr/td[2]/table/tbody/tr[2]/td[3]/form/table/"
         		+ "tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).isSelected());
	
                    For male
                    
                    System.out.println( driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/"
                     		+ "tr/td[2]/table/tbody/tr[2]/td[3]/form/table/"
                     		+ "tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).isSelected());
                    
                    if(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/"
                     		+ "tr/td[2]/table/tbody/tr[2]/td[3]/form/table/"
                     		+ "tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).isSelected()== false)
                    {
                    	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/"
                         		+ "tr/td[2]/table/tbody/tr[2]/td[3]/form/table/"
                         		+ "tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
                    }
*/













