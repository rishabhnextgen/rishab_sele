package Webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerWith_Ok_CancelButton {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
		   WebDriver driver= new ChromeDriver();
		   driver.get("http://demo.automationtesting.in/Alerts.html");
		   driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();// click on alert with ok cancell button
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();// click on alert OK Cancell button

		
		String ExpectedtextOk= "You pressed Ok";// caputure the text from the given page after click on alert ok 
		
        driver.switchTo().alert().accept();
        String Actualtext= driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();// get the x path of the text and store into variable 
        if (ExpectedtextOk.equals(Actualtext)==true)
        {
        	System.out.println("Test Passed OK");
        	
        }
       // No.2 For Cancell Button
        String ExpectedtextCancel= "You Pressed Cancel";
        driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();// click on alert OK Cancell button
        driver.switchTo().alert().dismiss();
        String Actualtext2= driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
	    if (ExpectedtextCancel.equals(Actualtext2)==true)
       {
       	System.out.println("Test Passed Cancel");
       	
       }
      
	}

}
