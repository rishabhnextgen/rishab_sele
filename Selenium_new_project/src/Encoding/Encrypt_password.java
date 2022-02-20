package Encoding;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Encrypt_password {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();

		  driver.get("https://demo.nopcommerce.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		  driver.findElement(By.id("Email")).sendKeys("rishabh0397@gmail.com");
		  driver.findElement(By.id("Password")).sendKeys(decodeString("dGVzdEAxMjM="));
		  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
		  
		  
		  
	}

	static String decodeString(String password)
	{
		byte[] decode=Base64.decodeBase64(password);
		return (new String(decode));
		
	}
}
