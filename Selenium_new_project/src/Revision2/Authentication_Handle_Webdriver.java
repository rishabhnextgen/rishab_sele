package Revision2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_Handle_Webdriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// for authentication in webdriver write the url like this
		// https://username:password@url 
	    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	    String text=driver.findElement(By.cssSelector("p")).getText();
	     System.out.println(text);
	
	
	}

}
