package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
				WebDriver driver= new ChromeDriver(); 
				driver.get("http://automationpractice.com/index.php");
				driver.manage().window().maximize();
			
				// By using class name
				int sliderno=driver.findElements(By.className("homeslider-container")).size();
			System.out.println("Total number of sliders in the page is"+ " "+ sliderno);
	
	// By using tag name
			
			int links=driver.findElements(By.tagName("a")).size();
			System.out.println("Total number of links in the page is "+" "+ links);
	
	}

}
