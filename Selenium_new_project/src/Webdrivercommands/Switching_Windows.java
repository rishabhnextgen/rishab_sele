 package Webdrivercommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching_Windows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
        //System.out.println(driver.getTitle());
        
		
		Set <String> s=driver.getWindowHandles();// .getWindowssHandlesWill give the id/key value  of the particular windows or browser
		
		for(String i:s)
		{
			System.out.println(i);// lets print the id of the page
	String t=driver.switchTo().window(i).getTitle();// switch to command will switch the particular id to next id
	
	/*if(t.contains("Frames & windows"))  // it will compare the title and close
	{
		driver.close();
	}
	*/
	System.out.println(t);
		}
		 
	}

}
 