package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// using tag & id  input#id
		//driver.findElement(By.cssSelector("#email")).sendKeys("8181816283");
		 
		
		// tag & class  input.class
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("8181816283");

		
		//tag with attribute   input[class=email]
	     
		//driver.findElement(By.cssSelector("input[id=email]")).sendKeys("8181816283");
	
		// tag class and attribute   input.class[attribute]
		
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("8181816283");
	
	}
	
	
	

}
