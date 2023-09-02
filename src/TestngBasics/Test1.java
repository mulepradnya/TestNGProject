package TestngBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	//Explain TestNg .xml file - use and advantages
	
	//What are the annotations in TestNG
	
	//@BeforeSuite
	//@BeforeTest
	//@BeforeClass
	//@BeforeMethod
	//@Test
	//@AfterMethod
	//@AfterClass
	//@AfterTest
	//@AfterSuite
	
	
	@AfterSuite
	public void method3 () {
		//driver.close;
		System.out.println("Test1Method3");
	}
	
	@BeforeSuite
	public void method1 () {
		//WebDriver driver = new ChromeDriver ();
		System.out.println("Test1Method1");
	}
	
	@AfterTest
	public void method2 () {
		System.out.println("Test1Method2");
	}
		
	@BeforeTest
	public void method4 () {
		System.out.println("Test1Method4");
	}
	
	@Test
	public void method5 () {
		System.out.println("Test1Method5");
	}
	
	@AfterClass
	public void method6 () {
		System.out.println("Test1Method6");
	}
		
	@BeforeClass
	public void method7 () {
		System.out.println("Test1Method7");
	}
	
	@Test
	public void method8 () {
		System.out.println("Test1Method8");
	}
	
	@AfterMethod
	public void method9 () {
		System.out.println("Test1Method9");
	}
		
	@BeforeMethod
	public void method10 () {
		System.out.println("Test1Method10");
	}
	
}
