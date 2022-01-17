package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coomands_selected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]" + "/div/div[1]/form/div[5]/a"))
				.click();

		  driver.findElement(By.xpath("//*[@id=\"u_3_2_h8\"]")).click();
		
		
		/*
		 * WebElement Female= driver.findElement(By.xpath("//*[@id=\"u_g_2_M+\"]"));
		 * Female.isSelected();
		 * 
		 * WebElement male = driver.findElement(By.xpath("//*[@id=\"u_g_3_p7\"]"));
		 * male.isSelected();
		 * 
		 * WebElement Custom = driver.findElement(By.xpath("//*[@id=\"u_g_4_7k\"]"));
		 * Custom.isSelected();
		 * 
		 * if (Female.isSelected() == false) {
		 * 
		 * Custom.click();
		 * 
		 * }
		 */
	}
}