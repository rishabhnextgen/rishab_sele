package Actions_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
		   WebDriver driver= new ChromeDriver();
		   driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
		   driver.manage().window().maximize();
		  WebElement source= driver.findElement(By.id("node1"));
		  WebElement target= driver.findElement(By.xpath("//*[@id=\"box1\"]"));
		  Actions act= new Actions(driver);
		  act.dragAndDrop(source, target).build().perform();
	
	}

}
