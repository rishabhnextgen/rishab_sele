package Revision2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class All_Handle_in_one_form {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		driver.manage().window().maximize();
	    // First name
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Rishabh");
		 // Last name
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Srivastava");
		     // Phone
		    driver.findElement(By.id("RESULT_TextField-3")).sendKeys("8181816283");
	
	       // country
		
		 driver.findElement(By.id("RESULT_TextField-4")).sendKeys("India");
		
		   // city
		
		   driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Azamgarh");
	       // Email id 
	       driver.findElement(By.id("RESULT_TextField-6")).sendKeys("rishabh0397@gmail.com");
	
	       // radio button
	      System.out.println(driver.findElement(By.xpath("//label[normalize-space()='Male']")).isSelected());
	      driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
	      
	      //check boxes
	      driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[1]/td/label")).click();

	
	        //dropdown
	      Select dropdowne= new Select(driver.findElement(By.id("RESULT_RadioButton-9")));
	      dropdowne.selectByVisibleText("Morning");
	     
	
	}

}
