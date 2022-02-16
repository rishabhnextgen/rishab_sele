package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_with_ok_cancel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		driver.get(" http://demo.automationtesting.in/Alerts.html");	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
	
	// for ok
	/*driver.switchTo().alert().accept();
	String expected= "You pressed Ok";
	 String actual=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
	 if(actual.equals(expected)== true)
	 {
		 System.out.println("my test is passed");
	 }
	 else {
		 System.out.println("test is failed");*/
	
	// for cancel
	
	driver.switchTo().alert().dismiss();
	String expected= "You Pressed Cancel";
	 String actual =driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
	 
	 if (actual.equals(expected)== true)
{
	System.out.println("my test is passed");
}
	 else
	 {
		 System.out.println("my test is failed");
	 }
	}
	
	}


