package Log4J;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.css.dom.Property;

public class Log4J_Properties {

	public static void main(String[] args) {
		Logger logger=Logger.getLogger("facebook");
		PropertyConfigurator.configure("log4j.properties");
		
             System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			logger.info("browser opened");
			driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();
	        logger.info("username entered");
	        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("8181816283");
	        logger.info("password entered");
	        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Hpmacbook");
	        logger.info("click on sign in");
	         driver.findElement(By.name("login")).click();
		     driver.switchTo().alert().accept();
	}

}
