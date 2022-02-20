package Actions_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		   driver.manage().window().maximize();
		   
		   Actions act= new Actions(driver);
           WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
           act.contextClick(button).build().perform();
           
          driver.findElement(By.xpath("/html/body/ul/li[4]/span")).click();
          System.out.println(driver.switchTo().alert().getText());
          driver.switchTo().alert().accept();
          
          
          
          
           
 
	}

}