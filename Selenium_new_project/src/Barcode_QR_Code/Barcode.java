package Barcode_QR_Code;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class Barcode {

	public static void main(String[] args) throws IOException, NotFoundException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
		   WebDriver driver= new ChromeDriver();
		   
		driver.get("http://testautomationpractice.blogspot.com/");
        String barcode= driver.findElement(By.xpath("//*[@id=\"HTML12\"]/div[1]/img[1]")).getAttribute("src");
	
	     // create URL Class object and pass value
        URL url= new URL(barcode);
     BufferedImage bufferedimage=  ImageIO.read(url);
     
     LuminanceSource luminancesource= new BufferedImageLuminanceSource(bufferedimage);
	
	BinaryBitmap binarybitmap= new BinaryBitmap(new HybridBinarizer(luminancesource));
	Result result= new MultiFormatReader().decode(binarybitmap);
	System.out.println(result.getText());
	
	}

}
