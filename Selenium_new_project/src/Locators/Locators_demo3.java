package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_demo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		// Tag & id combination
		
		/*
		 * driver.findElement(By.cssSelector("#email")).sendKeys("8181816283");
		 * driver.findElement(By.cssSelector("#pass")).sendKeys("Hpelitebook");
		 * driver.findElement(By.name("login")).click();
		 */
		 
		
		
		//Tag & class combination
		
		
		/*
		 * driver.findElement(By.cssSelector(".inputtext")).sendKeys("8181816283");
		 * driver.findElement(By.cssSelector(".inputtext")).sendKeys("Hpelitebook");
		 * driver.findElement(By.name("login")).click();
		 */
		
		
		// Tag& attribute
		
		/*
		 * driver.findElement(By.cssSelector("input[id=email]")).sendKeys("8181816283");
		 * driver.findElement(By.cssSelector("input[id=pass]")).sendKeys("Hpelitebook");
		 * driver.findElement(By.name("login")).click();
		 * 
		 */
		  // Tag , class & Attribute
		  
		  driver.findElement(By.cssSelector("input.inputtext[id=email]")).sendKeys("8181816283");
		  driver.findElement(By.cssSelector("input.inputtext[id=pass]")).sendKeys("Hpelitebook");
		  driver.findElement(By.name("login")).click();
		  
		  driver.close();
		  
		  
		  
		  
		
		
		
		
		
		
	}

}
