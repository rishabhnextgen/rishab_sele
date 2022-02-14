package Revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_Web_table {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
	    username.sendKeys("admin");
	    WebElement password= driver.findElement(By.xpath("//input[@id='txtPassword']"));
	    password.sendKeys("admin123");
	
	
	   WebElement Click=driver.findElement(By.xpath("//input[@id='btnLogin']"));
	   Click.click();
	    driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
	    driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
	    driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();
	
               int rowcount=driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tr")).size();
	
	           int  statuscount=0;
	           
	           for(int i=1; i<rowcount;i++)
	           {
	                 String status=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/thead/tr["+i+"]/th[5]")).getText();
	     
	       if(status.equals("enabled"))
	       {
	    	   statuscount=statuscount+1;
	    	   
	       }
	           
	           
	           }
	           System.out.println("no of employees enabled"+statuscount);
	           
	           
	driver.close();           
	}

}
