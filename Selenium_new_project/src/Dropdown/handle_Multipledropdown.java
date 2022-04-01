package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_Multipledropdown {

	public static void main(String[] args) {

      
        System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
        WebDriver driver= new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

           WebElement yeardrp=    driver.findElement(By.id("yearbox")) ;
           WebElement monthrdrp=    driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")) ;    
           WebElement datedrp=    driver.findElement(By.id("daybox")) ;
	
	
	
	
	}

}
