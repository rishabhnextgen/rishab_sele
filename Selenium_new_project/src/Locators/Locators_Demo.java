package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//test
		
		WebElement Searchbox=driver.findElement(By.id("search_query_top"));
		Searchbox.sendKeys("TShirt");
		driver.findElement(By.name("submit_search")).click();
	// How to use link text 
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
	// partial link text
		driver.findElement(By.partialLinkText("Chiff dress")).click();
	
	}
	
	

}
