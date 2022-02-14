package Revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Automate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		 driver.get("https://jqueryui.com/datepicker/#date%E2%88%92range");
	      //identify and switch to frame
	      WebElement r = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	      driver.switchTo().frame(r);
	      //identify element
	      WebElement e = driver.findElement(By.id("datepicker"));
	      e.click();
	      //identify elements with td tag in list
	      List<WebElement> d =driver.findElements(By.xpath("//table/tbody/tr/td"));
	      //iterate list
	      for (int i = 0; i<d.size(); i++) {
	         //check expected data
	         String s = d.get(i).getText();
	         if (s.equals("2")) {
	            d.get(i).click();
	            break;
	         }
	      }
	      //get data selected
	      String m = e.getAttribute("value");
	      System.out.print("Date selected in calendar is: "+ m);
	      //close browser
	      driver.quit();
	}

}
