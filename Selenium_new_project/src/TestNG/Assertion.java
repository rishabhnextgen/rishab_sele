package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {


	@Test
    public void login()
{
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
	WebDriver driver= new ChromeDriver(); 
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	SoftAssert softassert= new SoftAssert();
	String expected_title= "Online Shopping Site for Mobiles, Electronics, "
			+ "Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	
                  String	actual_title= driver.getTitle();
                  Assert.assertEquals(actual_title, expected_title);

                 String text=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]"
                 		+ "/div[2]/div[5]/div/div/a/span")).
                 getAttribute("href");
                 String expected = "Login";	

                  softassert.assertEquals(text, expected);
                  
	

}


}
