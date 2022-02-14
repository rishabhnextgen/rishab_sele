package Revision2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Rishabh");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Srivastava");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Kol Pandey Shanti nagar Distt Azamgar UP , PIN 276001");
	    driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("rishabh0397@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("8181816283");
	    driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]")).isSelected();
	    driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[6]/div/div[1]/label")).click();
	    
		/*
		 * Select t= new Select(driver.findElement(By.xpath("//*[@id=\"msdd\"]")));
		 * t.selectByVisibleText("English");
		 */ 
	    Select t2= new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
	     t2.selectByVisibleText("Java");
	     
			/*
			 * Select t3= new Select(driver.findElement(By.xpath(
			 * "//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")));
			 * t3.selectByVisibleText("");
			 */
	     
			/*
			 * Select t4= new Select(driver.findElement(By.xpath(
			 * "//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")));
			 * t4.selectByVisibleText("India");
			 */
	     Select year= new Select(driver.findElement(By.xpath("//*[@id=\"yearbox\"]")));
	     year.selectByVisibleText("1995");
	     
	     Select month= new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
	     month.selectByVisibleText("March");
	     
	     Select date= new Select(driver.findElement(By.xpath("//*[@id=\"daybox\"]")));
	     date.selectByVisibleText("28");
	     
	     driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("Shubham@123s");
	     driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("Shubham@123s");
	     
         driver.findElement(By.xpath("//*[@id=\"Button1\"]")).click();
	
	
	
	
	
	
	}

}
