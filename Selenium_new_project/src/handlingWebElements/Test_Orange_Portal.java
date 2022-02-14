package handlingWebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class Test_Orange_Portal {
 public static void main(String[] args) {
		
	   System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");	
	   WebDriver driver= new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	   driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
	    driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
	    driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	    
	    driver.findElement(By.className("firstLevelMenu")).click();
	    driver.findElement(By.id("menu_admin_UserManagement")).click();
	    driver.findElement(By.id("menu_admin_viewSystemUsers")).click();	
		
	    int rowcount=	driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr")).size();
	    int statuscount=0;// to store the no. of value that is enabled 
		
		for(int i=1; i<=rowcount;i++)
		{
		String Status=	driver.findElement(By.xpath("//*[@id=\"resultTable\"]/thead/tr["+i+"]/td[5]")).getText(); 
		// we are not changing coloum value
		
		
		if(Status.equals("Enabled"))
		{
			statuscount=statuscount+1;	
		
			}
		
		}
		System.out.println("no of employees in enabled"+ "  "+ statuscount);
		
		driver.close();
			
		}
		
		
		}
	
		
		
		

	


