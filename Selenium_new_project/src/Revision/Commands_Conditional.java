package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands_Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		 WebElement email= driver.findElement(By.xpath("//*[@id=\"email\"]"));
         WebElement password=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		
         // it will return true or false 
         
         if (email.isDisplayed()&& email.isEnabled()) {
        	 email.sendKeys("8181816283");
		
         
         if (password.isDisplayed()&& password.isEnabled()) {
        	 password.sendKeys("Hpelitebook");
			
         }
         }
	}}
         
         
		
				

	


