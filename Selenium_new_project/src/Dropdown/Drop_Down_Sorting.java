package Dropdown;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

         public class Drop_Down_Sorting {

	    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\New folder\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get(" https://testautomationpractice.blogspot.com/");	
	    driver.manage().window().maximize();
	    WebElement element=    driver.findElement(By.id("animals"));
	    Select se= new Select(element);
	
	     List originalList= new ArrayList();// All data store in Array list
	     List<WebElement> options= se.getOptions();// get option will capture all dta from dropdown
	
	     for(WebElement e:options)
	      {
		originalList.add(e.getText());// .get text meathod can capture all value from WebElement and store into it
	       }
	      System.out.println(originalList);
	     List tempList= new ArrayList();
	      tempList=originalList;
	
	     System.out.println("Before Sorting temperoryList"+tempList);
	
	    Collections.sort(tempList);// for sorting we use
	
     System.out.println("After Sorting temperoryList"+tempList);
    // System.out.println("After Sorting originalList"+originalList);// Here Original list should also be shorted because in line no.32 we have done comparision
     
	if(originalList.equals(tempList))
	{
		System.out.println("Sorting is successfull");
	}
	else
	{
		System.out.println("Sorting is failed");
	}
	
	}

}
