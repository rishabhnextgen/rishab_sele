package Headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	public static void main(String[] args) {
		
		// 1- setting the chrome browser property
		
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		
		
		// 2- setting for the headless browser
		ChromeOptions option= new ChromeOptions();
		option.setHeadless(true);
		  // or
		//option.addArguments("--headless");
		
		// 3- Get the driver object
		
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("https://www.facebook.com/");
		driver.getTitle();
		System.out.println("title of the page" + " " + driver.getTitle());
		
		

	}

}
