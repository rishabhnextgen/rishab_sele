package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Tshirt");
		driver.findElement(By.id("nav-search-submit-button")).click();
	    driver.findElement(By.linkText("Men's Regular Fit T-Shirt (Pack of 3)")).click();// using link text
	
	// using partial link text 
	
	//driver.findElement(By.partialLinkText("Men's Printed Round")).click();
	
	// check sliders in the image
	// using class name as a locator 
	int sliders=driver.findElements(By.className("a-button-text")).size();
	System.out.println(sliders);
	// using tag name as a  locator
	
	//check how many links are there in a page
	int links=driver.findElements(By.tagName("a")).size();
	System.out.println(links);
	
		
		
		
	}

}
