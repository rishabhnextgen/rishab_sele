package Revision;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("ravi kumar");
		driver.findElement(By.name("submit")).click();
		
		String expect_title="Login: Mercury Tours";
		String actual_title= driver.getTitle();
		
		if(expect_title.equals(actual_title)==true)
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed ");
	
		
		}
	driver.close();
	}
	

}
