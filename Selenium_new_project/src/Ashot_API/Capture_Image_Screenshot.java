package Ashot_API;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class Capture_Image_Screenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers#");
		WebElement logoimage=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		
		
		
		 Screenshot logoscreenshot=new AShot().takeScreenshot(driver,logoimage);
		ImageIO.write (logoscreenshot.getImage(),"png",new File("F://Screenshots/orangehrm.png"));
		File f= new File("F://Screenshots/orangehrm.png");
		
		if(f.exists())
		{
			System.out.println("image captured");
			
			}
	
		else {
			System.out.println("image not captured");
		}
	}
	

}
