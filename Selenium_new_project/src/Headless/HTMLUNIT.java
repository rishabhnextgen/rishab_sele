package Headless;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUNIT {

	public static void main(String[] args) {
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println("title of the page is" + " " + driver.getTitle() );
		System.out.println("current url of the page is" + " "+ driver.getCurrentUrl());
		//System.out.println(" current page source is " + " "+ driver.getPageSource());
	}

}
