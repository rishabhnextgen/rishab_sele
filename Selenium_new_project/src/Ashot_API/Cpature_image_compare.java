package Ashot_API;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Image;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.util.ImageBytesDiffer;

public class Cpature_image_compare {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers#");
		
	 BufferedImage expectedimage=ImageIO.read(new File("F://Screenshots/orangehrm.png")); //expected image
		
	WebElement logoimage=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));// actual image
		
	Screenshot	screenshot=new AShot().takeScreenshot(driver,logoimage);
	BufferedImage actualimage=screenshot.getImage();
	ImageDiffer imagediffer=new ImageDiffer();
	
	ImageDiff diff=imagediffer.makeDiff(expectedimage, actualimage);
	
	if(diff.hasDiff()==true)
	{
		System.out.println("Image not matched");
	}
	else
	{
		System.out.println("image same ");
	}
	}

}
