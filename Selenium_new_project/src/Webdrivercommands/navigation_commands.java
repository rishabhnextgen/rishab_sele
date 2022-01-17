package Webdrivercommands;
 import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
	public class navigation_commands 
	{
     public static void main(String[] args) 
     {
			
			System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
            driver.get("https://www.ixigo.com/");
            driver.navigate().to("https://www.facebook.com/");
            System.out.println(driver.getTitle());
            driver.navigate().back();
            System.out.println(driver.getTitle());
            driver.navigate().forward();
            System.out.println(driver.getTitle());
            driver.quit();
			
}
	}
