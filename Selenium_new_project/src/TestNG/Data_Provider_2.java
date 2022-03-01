package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_2
{
	@Test(dataProvider ="create")
	public void datasetup(String username, String password)
{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

driver.close();
}
	
	
	@DataProvider(name="create")
	public Object[][] datasetup()
	{
		
		Object [][]dataset = new Object[4][2];
	    
		dataset[0][0]="standard_user";
		dataset[0][1]="secret_sauce";
	
		dataset[1][0]="locked_out_user";
		dataset[1][1]="secret_sauce";
		
		dataset[2][0]="problem_user";
		dataset[2][1]="secret_sauce";
		
		dataset[3][0]="performance_glitch_user";
		dataset[3][1]="secret_sauce";
		return dataset;
	
	
	}

}
