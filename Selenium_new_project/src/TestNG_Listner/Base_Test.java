package TestNG_Listner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base_Test {

	public static WebDriver driver= null;
	@BeforeSuite
	public void launchbrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	}
   @AfterSuite
public void closingbrowser()
{
	driver.close();
}
}
