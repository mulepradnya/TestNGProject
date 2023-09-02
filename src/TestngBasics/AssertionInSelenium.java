package TestngBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInSelenium {

	@Test
	public void login () {
		
		//Open Browser
		WebDriver driver = new ChromeDriver ();
						
		//launch URL
		driver.get("https://login.salesforce.com/?locale=in");
						
		//Enter username
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("test");
				
		//Enter Password
		WebElement password = driver.findElement(By.xpath("//input[@name='pw']"));
		password.sendKeys("test11");
				
		//click on login button
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		//Hard Assertion
		String actualText = driver.findElement(By.xpath("//div[@id='error']")).getText();
		String expextedText = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		Assert.assertEquals(actualText, expextedText);
		
		String expextedText1 = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		
		String expextedText2 = "check your username and password. If you still can't log in, contact your Salesforce administrator.";
		
		//Soft Assertion
		SoftAssert sassert = new SoftAssert ();
		sassert.assertEquals(actualText, expextedText);
		sassert.assertEquals(actualText, expextedText1);
		sassert.assertEquals(actualText, expextedText2);
		sassert.assertEquals(10, 20, "Values are not matching...");
		sassert.assertEquals(200, 201, "Status code are not matching...");
			
		System.out.println("My application is working correctly.........");
		System.out.println("My application is working correctly.........");
		System.out.println("My application is working correctly.........");
		
		sassert.assertAll();
		
				
	}
	
}
