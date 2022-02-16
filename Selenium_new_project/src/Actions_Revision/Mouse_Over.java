package Actions_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		   driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("admin");
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	
	Actions act = new Actions(driver);
	
	WebElement admin=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]"));
	WebElement usermgmt=driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
	WebElement user=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
	/*
	 * act.moveToElement(admin).build().perform();
	 * act.moveToElement(usermgmt).build().perform();
	 * act.moveToElement(user).click().build().perform();
	 */ //or
	act.moveToElement(admin).moveToElement(usermgmt).moveToElement(user).click().build().perform();	
	
	
	
	
	
	
	
	}

}
