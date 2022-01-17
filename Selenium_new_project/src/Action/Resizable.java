package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://jqueryui.com/resizable/");
		   driver.manage().window().maximize();
		   driver.switchTo().frame(0);// we have to first switch to the frame so we put the id of the frame ie.0
		      WebElement Resizable=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));// take the x path of the resizable 
		      Actions act = new Actions(driver);
	
	       act.moveToElement(Resizable).dragAndDropBy(Resizable, 50, 50).build().perform();
	       Thread.sleep(3000);
	
	}

}
