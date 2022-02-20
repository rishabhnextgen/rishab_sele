package JavaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Down {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		   
		   JavascriptExecutor js= (JavascriptExecutor)driver;
		   //scroll by using pixel
		  // js.executeScript("window.scrollBy(0,1000)", "");
		   // scrolling till we find element
		   //WebElement flag=  driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[28]/td[2]"));
		   //js.executeScript("arguments[0].scrollIntoView();",flag);
		   
            // scrolling till end
		   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

}
