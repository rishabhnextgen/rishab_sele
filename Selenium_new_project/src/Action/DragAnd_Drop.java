package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnd_Drop {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
		   WebDriver driver= new ChromeDriver();
		   driver.get("http://demo.guru99.com/test/drag_drop.html");
		   driver.manage().window().maximize();
		  WebElement Source= driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));  // x path of where we have to pick and put it into source varaible
		  WebElement target= driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));    // x path of where we have to relese and put it into target varaible
	      Actions act= new Actions(driver);
	     // act.clickAndHold(Source).moveToElement(target).release().build().perform();// apply the meathods 
	      act.dragAndDrop(Source, target).build().perform();
	
	}

}
