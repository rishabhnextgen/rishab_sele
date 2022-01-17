package handlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {

	public static void main(String[] args) {
   
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get(" Enter the URL");	
	
	driver.findElement(By.xpath("")).click();// Enetr the X path of the calender click
	
	     Select y= new Select (driver.findElement(By.xpath("")));// make select class for drop down
	     y.selectByVisibleText("2018");// select date from the drop down
	 
	         //  for future month 
	  
	     
	     /*   
		for (int i=6;i>=1; i--)
		{
			driver.findElement(By.xpath("Click on the right buttton of the calendeer")).click();// click on the button to navaigate month 
			
			String m= driver.findElement(By.xpath("Enter the x path of the month")).getText();// select the month 
		
			if(m.equals("December"))
			{
				driver.findElement(By.linkText("Enter the link of the date")).click();// here link is used because link value changed always 
				
				break;
			}
		}
		
		*/
	     
	     
	    // For Past month
		
	     for (int i=5;i>=1; i--)
			{
				driver.findElement(By.xpath("Click on the Left buttton of the calendeer")).click();// click on the button to navaigate month 
				
				String m= driver.findElement(By.xpath("Enter the x path of the month")).getText();// select the month 
			
				if(m.equals("Jan"))
				{
					driver.findElement(By.linkText("Enter the link of the date")).click();// here link is used because link value changed always 
					
					break;
				}
			}
	     
	     
	     
	     
	}

}


