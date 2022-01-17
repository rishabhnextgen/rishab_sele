package Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands_Revision {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("http://www.allahabadhighcourt.in/");
		System.out.println(driver.getTitle());
		driver.navigate().to("http://8.30.246.164:8080/icici2/admin/login");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.close();
		
	}
}
