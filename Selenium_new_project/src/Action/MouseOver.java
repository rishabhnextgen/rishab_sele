package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseOver {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		   driver.manage().window().maximize();
		    
		    driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		    driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		    driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();

		   

		    
		   
	           // Step1-> Create Actions Class
	  
		    Actions act= new Actions(driver);
		    
		    WebElement admin =driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		    WebElement usermgmt= driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
		    WebElement user=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
		   
		    
		    // perform the action by using object
		    
		    act.moveToElement(admin).build().perform();// mouseover to admin tab
		    act.moveToElement(usermgmt).build().perform();// mouseover to Usermanagement tab
		    act.moveToElement(user).click().build().perform();// here we have to click on users
	        // write all three in one// act.moveToElement(admin).moveToElement(usermgmt).moveToElement(user).click().build().perform();// 
	
		  
	
		  
	
	
	}

}
