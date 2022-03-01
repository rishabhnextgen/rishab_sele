package TestNG;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class login_assert {
	@Test
	public void verifytitle()
	{
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		String expected_title= "Online Shopping Site for Mobiles, Electronics, "
				+ "Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
	String	actual_title= driver.getTitle();
	Assert.assertEquals(actual_title, expected_title);
	}

}
