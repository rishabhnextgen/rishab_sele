package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_Cookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://www.flipkart.com/");
		   Set <Cookie> cookie=driver.manage().getCookies();
		   // add new cookies to the browser
		  
		   
		     System.out.println(cookie.size());
		    Cookie c= new Cookie("rishabh","1234567");
		   driver.manage().addCookie(c);
		    cookie=  driver.manage().getCookies();
		   for(Cookie cokie:cookie)
		   {
			   System.out.println(cokie.getName()+""+cokie.getValue());
		   }
driver.quit();
	}

}
