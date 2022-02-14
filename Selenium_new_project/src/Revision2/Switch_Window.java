package Revision2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Window {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
		// System.out.println(driver.getTitle()); it will show the first page title
		
	Set<String> s=	driver.getWindowHandles();
	for(String i:s)
	{
		String t=driver.switchTo().window(i).getTitle();
		//System.out.println(t);
	if(t.equals("Frames & windows")) {
		driver.close();
	}
	}
	
	
	
	}

}
