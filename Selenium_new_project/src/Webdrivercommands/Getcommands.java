package Webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://in.godaddy.com/offers/godaddy?isc=gofigin01&gclsrc=aw.ds&&cvosrc=ppc.google."
				+ "go%20daddy&cvo_crid=502425016696&matchtype=e&mkwid=s_pcrid_502425016696_pkw_go%20daddy_"
				+ "pmt_e_pdv_c&gclid=CjwKCAjwm7mEBhBsEiwA_of-TDF9SfqDT_RMCd9AGeegHafLkeE9--"
				+ "hb8i3tZQO7q7fqUuxQUnFjlRoCaPYQAvD_BwE");
      driver.manage().window().maximize();
	 String text=driver.findElement(By.xpath("/html/body/div[4]/div/a/div/span")).getText();
	 System.out.println(text);
	 driver.close(); // it will close current window
	 driver.quit(); // it will close all browser
	 }
}
