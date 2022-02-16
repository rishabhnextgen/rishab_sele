package Sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class File_upload {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
		   WebDriver driver= new ChromeDriver();
		 //  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		  driver.get("http://demo.automationtesting.in/Register.html");
		   driver.manage().window().maximize();
	
			/*
			 * driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
			 * driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123")
			 * ;
			 * 
			 * driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
			 * 
			 * driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click()
			 * ; driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]")).click();
			 * driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Rishabh");
			 * driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("srivastava");
			 */
	        
		   
		         driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).click();
	         
				
				  String imagespath="F:\\Sikuli_upload\\"; 
				  String inputfilepath="F:\\Sikuli_upload\\";
				  
				  Screen s= new Screen(); 
				  Pattern FileInputTextBox= new Pattern(imagespath+"File.PNG"); 
				  Pattern open= new Pattern(imagespath+"open.PNG");
				  
					
					   Thread.sleep(5000);
					   s.wait(FileInputTextBox,20);
					 
				       s.type(open,inputfilepath+"PHOTO");
				       s.click(open);
				 
			 
		   
	}

}
