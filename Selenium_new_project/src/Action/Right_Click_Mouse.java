package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click_Mouse {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
		   WebDriver driver= new ChromeDriver();
		   driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		   driver.manage().window().maximize();
          
		   Actions act= new Actions(driver);
            WebElement Rightclkbutton =driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
           act.contextClick(Rightclkbutton).build().perform();
		   driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[4]")).click();// click on the rightclick and select element
		  System.out.println(driver.switchTo().alert().getText()); // it will capture the text from the alert box
	        driver.switchTo().alert().accept();// close the alert box
	
	}

}
