package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://jqueryui.com/slider/");
		   driver.manage().window().maximize();
	
	      driver.switchTo().frame(0);// we have to first switch to the frame so we put the id of the frame ie.0
	      WebElement Slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));// take the x path of the slider where we to slide
	      
	      
	      Actions act = new Actions(driver);
	      act.dragAndDropBy(Slider, 60, 10).build().perform();
	     
	
	
	}

}
