package Revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Xpath_Axes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
         
		// Self
		  String text=driver.findElement(By.xpath("//a[normalize-space()='NDTV']/self::a")).
		  getText(); System.out.println(text);
		 
		
		// Parent  (Select the Parent of the Current node)
		String text2=driver.findElement(By.xpath("//a[normalize-space()='NDTV']/parent::td")).getText();
		System.out.println(text2);

		// ancestor (Select all ancestor(Parent,grandparent etc)
		String text3=driver.findElement(By.xpath("//a[normalize-space()='NDTV']/ancestor::tr")).getText();
		System.out.println(text3);

		// Child  (Select all the children of the current node)
		List<WebElement> childs=driver.findElements(By.xpath("//a[normalize-space()='NDTV']/ancestor::tr/child::*"));
		childs.size();
		System.out.println("number of child "+childs.size());
		
		// Descendent == Child+ grand Child  (select all the descendant (children, grandchildren)
		List<WebElement> Descendant=driver.findElements(By.xpath("//a[normalize-space()='NDTV']/ancestor::tr/descendant::*"));
		Descendant.size();
		System.out.println("No of Descendant are"+Descendant.size());
		
		// Following (Select everything in the document after closing tag of the current node)
		
		List<WebElement> Following=driver.findElements(By.xpath("//a[normalize-space()='NDTV']/following::*"));
		Following.size();
		System.out.println("No of following nodes  are"+Following.size());
		
		// Following Sibling (Select all siblings after the current node)
		
				List<WebElement> Followingsiblings=driver.findElements(By.xpath("//a[normalize-space()='NDTV']/ancestor::tr/following-sibling::tr"));
				Followingsiblings.size();
				System.out.println("No of following siblings nodes  are"+Followingsiblings.size());
				
		
		 // Preceding (Select everything in the document before closing tag of the current node above)
				  
				  List<WebElement> Preceding =driver.findElements(By.xpath("//a[normalize-space()='NDTV']/preceding::*"));
				  Following.size();
				  System.out.println("No of Preceding nodes  are"+Preceding.size());
				  
				 
       // Preceding (Select everything in the document before closing tag of the current node above)
							  
			    List<WebElement> Precedingsibling =driver.findElements(By.xpath("//a[normalize-space()='NDTV']/preceding-sibling::*"));
							  Precedingsibling.size();
							  System.out.println("No of Preceding-Sibling nodes  are"+Precedingsibling.size());
							  
							 
		
		
		
		
	}
}
