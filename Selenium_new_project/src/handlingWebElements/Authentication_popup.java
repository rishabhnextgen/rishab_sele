package handlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_popup {

	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");	
		   WebDriver driver= new ChromeDriver();
		  
		    // driver.get("https://the-internet.herokuapp.com/basic_auth");
		   driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");// write the url like this
		   driver.manage().window().maximize();
		   String text=  driver.findElement(By.cssSelector("#content > div > p")).getText();// select the text from the link
		   System.out.println(text);
	}

}
