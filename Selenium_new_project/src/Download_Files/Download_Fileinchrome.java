package Download_Files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Download_Fileinchrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
		   WebDriver driver= new ChromeDriver();
		   
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("this is text file");
		   
		   //driver.findElement(By.xpath("//*[@id=\"createTxt\"]")).click();
		   Actions act = new Actions(driver);
			WebElement element = driver.findElement(By.id("createTxt"));
			
			act.click(element).build().perform();
			WebElement element2=	driver.findElement(By.xpath("//*[@id=\"link-to-download\"]"));
			act.click(element2).build().perform();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
	
	}

}
