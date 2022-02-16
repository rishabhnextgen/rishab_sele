package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_with_text_box {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		driver.get(" http://demo.automationtesting.in/Alerts.html");	
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		driver.switchTo().alert().sendKeys("rishabh");
		driver.switchTo().alert().accept();
		
		String exp= "Hello rishabh How are you today";
	String act=	driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
	if(act.equals(exp)==true)
	{
		System.out.println("my test is passed");
	}
	else {
		System.out.println("my test is failed");
	}
	}

}
