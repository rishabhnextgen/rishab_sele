package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_with_ok {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		driver.get(" http://demo.automationtesting.in/Alerts.html");	
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
	    driver.switchTo().alert().accept();
	  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
