package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		/*
		 * 
		 * 1) Absolute X path
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"
		 * )).sendKeys("8181816283"); driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div"
		 * )).sendKeys("Hpelitebook");
		 * 
		 * 2) Relative X path //input[@id="value"]
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("8181816283");
		 * driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Hpelitebook");
		 * 
		 * 3) X path with or Operator //input[@id="value or @name="value"]
		 * 
		 * driver.findElement(By.xpath("//input[@id='email' or @name='email']")).
		 * sendKeys("8181816283"); driver.findElement(By.
		 * xpath("//input[@id='pass' or @data-testid=\\\"royal\\\"]")).sendKeys(
		 * "Hpelitebook");
		 * 
		 * 4) X path with and Operator input[@id="value and @name="value"]
		 * 
		 * driver.findElement(By.
		 * xpath("//input[@id='email' and @data-testid=\"royal_email\"]")).sendKeys(
		 * "8181816283");
		 * driver.findElement(By.xpath("//input[@id='pass' and @name=\"pass\"]")).
		 * sendKeys("Hpelitebook");
		 * 
		 * 
		 * 5) x path with contains() input[contains(@attribute,'value')] Note---> No
		 * need to match the attribute value
		 * 
		 * 
		 * driver.findElement(By.xpath("//input[contains(@id,'ema')]")).sendKeys(
		 * "8181816283");
		 * driver.findElement(By.xpath("//input[contains(@id,'pas')]")).sendKeys(
		 * "Hpelitebook");
		 * 
		 * 6) x path with starts with() input[starts-with(@attribute,'value')] Note-->
		 * value must be match with the same
		 * 
		 * 
		 * driver.findElement(By.xpath("//input[starts-with(@id,'email')]")).sendKeys(
		 * "8181816283");
		 * driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys(
		 * "Hpelitebook");
		 * 
		 * 7) x path with text Note---> Locate the text element
		 * 
		 * 
		 * 
		 * driver.findElement(By.xpath("//a[text()='facebook']")).sendKeys("8181816283")
		 * ;
		 * 
		 * 8) Chained X Path //form[@attribute='value']//tagname[4]
		 * //form[@attribute='value']//tagname[@attribute='value']
		 * 
		 * 
		 * driver.findElement(By.xpath("//form[@method='post']//input[4]")).sendKeys(
		 * "8181816283");
		 * driver.findElement(By.xpath("//form[@method='post']//input[@id='pass]")).
		 * sendKeys("Hpelitebook");
		 * 
		 * 
		 */
	}

}
