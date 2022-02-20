package Revision2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("8181816283");
driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Hpelitebook");
driver.findElement(By.name("login")).click();
	driver.switchTo().alert().accept();
	}

}
