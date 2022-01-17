package Webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_text_Box {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
			   WebDriver driver= new ChromeDriver();
			   driver.get("http://demo.automationtesting.in/Alerts.html");
			   driver.manage().window().maximize();
			   driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
			   driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
			   
			   // Enter the text in the alert box
			   
			   driver.switchTo().alert().sendKeys("Shubham");
	
	             // Accept the alert with Ok Button
			   driver.switchTo().alert().accept();
			   String Experctedtext = "Hello Rishabh How are you today";
		String Actualtext=	   driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
		if(Experctedtext.equals(Actualtext)==true)
		{
			System.out.println("Test is Passed");
		}
			   
	
	}

}
