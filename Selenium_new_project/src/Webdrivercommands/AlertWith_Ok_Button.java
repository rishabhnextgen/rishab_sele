    package Webdrivercommands;

   import org.openqa.selenium.By;
   import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.chrome.ChromeDriver;
 
    public class AlertWith_Ok_Button {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();// click on alert with ok button
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();// click on alert button
	
	    // switch to alert button
		
		// capture the text on the alert box and print on console
		
		 System.out.println(driver.switchTo().alert().getText());
			
		
		 driver.switchTo().alert().accept();// it will close the window automatically click on OK button
		
	
	
	
	}

}
