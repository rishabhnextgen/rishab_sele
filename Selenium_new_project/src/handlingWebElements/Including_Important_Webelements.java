package handlingWebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Including_Important_Webelements {

	    public static void main(String[] args)  {
	    	
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get(" https://testautomationpractice.blogspot.com/");	
		driver.manage().window().maximize();
		
		//  1--> Name, Country Email, City ,Phone
	    driver.findElement(By.id("Enter the id of the element First Name")).sendKeys("Rishabh");
	    driver.findElement(By.id("Enter the id of the element Last Name")).sendKeys("Srivastava");
	    driver.findElement(By.id("Enter the id of the element phone")).sendKeys("8181816283");
	    driver.findElement(By.id("Enter the id of the element Country")).sendKeys("India"); 
	    driver.findElement(By.id("Enter the id of the element City")).sendKeys("Azamgarh");
	    driver.findElement(By.id("Enter the id of the element Email")).sendKeys("Rishabh0397@gmail.com");
	     
	    // 2-->  Dropdown Box
	    
       WebElement	dropspeed=    driver.findElement(By.id("speed"));// create a driver object of dropdown id and store into WebElement
       Select speed= new Select(dropspeed);// Create a select Object and Pass the value into it.
	     //speed.selectByIndex(2); 
         //speed.selectByValue("medium");
	   speed.selectByVisibleText("Slow");
	   
	   // Validation in dropdown for how many meathods are there in dropdown
	   speed.getOptions().size(); // no. of items present in the dropdown box
	   
	    // 3-->  check boxes radio button
	   
	   // validation if check box is selected then unselect or if unselect then select
	     System.out.println(driver.findElement(By.id("RESULT_RadioButton-7_0")).isSelected());  // it will return true or false
	    driver.findElement(By.id("RESULT_RadioButton-7_0")).click();// it will click if it return false
	    
	    // 4--> Checkboxes form
	    
	    driver.findElement(By.id("\"RESULT_CheckBox-8_0")).click();
	    driver.findElement(By.id("\"RESULT_CheckBox-8_0")).click();
	    // 5--> Bigger text box/ area
	    
	    driver.findElement(By.id("")).sendKeys("");
	    
	    // 6--> link validation click on link
	    
	    driver.findElement(By.linkText("")).click();
	    
	    // 8--> Return back to window after clicking
	    
	    driver.navigate().back();
	    
	    
	     }

      }
