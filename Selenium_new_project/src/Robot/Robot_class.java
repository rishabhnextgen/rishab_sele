package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_class {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
		   WebDriver driver= new ChromeDriver();
		   
		driver.get("url");
		driver.findElement(By.xpath("x path of download link")).click();
		
		Robot rc= new Robot();
		rc.keyPress(KeyEvent.VK_DOWN);// for down key
		rc.keyPress(KeyEvent.VK_TAB);// for tab key
		rc.keyPress(KeyEvent.VK_ENTER);// for enter key
	}

}
