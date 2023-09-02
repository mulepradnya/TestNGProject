package TestngBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTestingInTestNG {

	WebDriver driver;
	
	@Test
	public void method1 () {
		//Open Browser
		WebDriver driver = new ChromeDriver ();
								
		//launch URL
		driver.get("https://login.salesforce.com/?locale=in");
		
		System.out.println("Salesforce");
	}
	
	@Test
	public void method2 () throws InterruptedException {
		
		Thread.sleep(2000);
		
		//Open Browser
		WebDriver driver = new ChromeDriver ();
								
		//launch URL
		driver.get("https://www.google.com/");
		
		System.out.println("Google");
	}
	
	@AfterMethod
	public void closeBrowser () throws InterruptedException {
		
		Thread.sleep(2000);
		
		//Close Browser
		driver.close();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
